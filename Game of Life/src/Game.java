import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends Canvas{

    public static void setBorder() {
        for (int i = 0; i < cdim; i++) {
            grid[0][i] = dead;
            grid[rdim - 1][i] = dead;
        }
        for (int i = 0; i < cdim; i++) {
            grid[i][0] = dead;
            grid[i][cdim - 1] = dead;
        }
    }

    public static String aliveOrDead() {
        double ranNum = Math.random();

        if (ranNum > 0.8) {
            // alive
            return live;
        } else {
            // dead
            return dead;
        }
    }

    public static int neighbors(int r, int c) {
        int neighbors = 0;
        if (grid[r + 1][c] == live)
            neighbors++;
        if (grid[r - 1][c] == live)
            neighbors++;
        if (grid[r][c + 1] == live)
            neighbors++;
        if (grid[r][c - 1] == live)
        	neighbors++;
        if (grid[r + 1][c + 1] == live)
            neighbors++;
        if (grid[r + 1][c - 1] == live)
            neighbors++;
        if (grid[r - 1][c + 1] == live)
            neighbors++;
        if (grid[r - 1][c - 1] == live)
            neighbors++;
        return neighbors;
    }

    public static void survive() {
        for (int r = 1; r < rdim - 1; r++) {
            for (int c = 1; c < cdim - 1; c++) {
                if (grid[r][c] == live) {
                    if (neighbors(r, c) != 3 && neighbors(r, c) != 2) {
                        store[r][c] = dead;
                    } else {
                        store[r][c] = live;
                    }
                }
                else if (grid[r][c] == dead && neighbors(r, c) == 3) {
                    store[r][c] = live;
                } else {
                    store[r][c] = dead;
                }
            }
        }
    }

    public static void copy() {
        for (int r = 1; r < rdim - 1; r++) {
            for (int c = 1; c < cdim - 1; c++) {
                grid[r][c] = store [r][c];
            }
        }
    }
    
    public static void print() {
        for (int r = 1; r < rdim - 1; r++) {
            for (int c = 1; c < cdim - 1; c++) {
                if (c == 1 && r == 1) {
                    clearConsole();
                    System.out.print(grid[r][c]);
                }
                else if (c == cdim - 2) {
                    System.out.println(grid[r][c]);
                } else {
                    System.out.print(grid[r][c]);
                }
            }
        }
    }
    
    public static void play() {
        survive();
        copy();
        print();
    }
    
    public static void randomReset() {
        for (int r = 1; r < rdim - 1; r++) {
            for (int c = 1; c < cdim - 1; c++) {
                if (c == cdim - 2) {
                    grid[r][c] = aliveOrDead();
                    System.out.println(grid[r][c]);
                } else {
                    grid[r][c] = aliveOrDead();
                    System.out.print(grid[r][c]);
                }
            }
        }
    }
    
    public static void blankReset() {
        for (int r = 1; r < rdim - 1; r++) {
            for (int c = 1; c < cdim - 1; c++) {
                grid[r][c] = dead;
            }
        }
    }
    
    public static void rPentomino() {
        blankReset();
        int r = rdim / 2;
        int c = cdim / 2;
        grid[r][c] = live;
        grid[r - 1][c] = live;
        grid[r - 1][c + 1] = live;
        grid[r][c - 1] = live;
        grid[r + 1][c] = live;
    }
    
    public static void clearConsole() {
        for (int i = 0; i < 64; i++){
            System.out.println();
        }
    }
    
    public static void drawLive (int r, int c, Graphics g) {
        int cellSize = 10;
        g.fillRect(c * cellSize, r * cellSize, cellSize, cellSize);
    }
    
    static int rdim = 40; // R dimension
    static int cdim = 58; // C dimension
    static String[][] grid = new String[rdim][cdim];
    static String[][] store = new String[rdim][cdim];
    static String live = " • ";
    static String dead = " · ";
    static int choice;
    static boolean incorrect = true;
    static int speed = 250;

    public static void main(String[] args) throws InterruptedException {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.WHITE);

        // add the canvas
        Canvas canvas = new Game();
        canvas.setSize(640, 480);
        frame.getContentPane().add(canvas);
//        JPanel jpanel = new JPanel();
        frame.add(canvas);
        frame.setSize(640, 480);

        // show the frame
        frame.pack();
        frame.setVisible(true); 
        
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread();
//        System.out.println("Welcome to Conway's Game of Life! The game will start in just a second.");
//        while (incorrect) {
//            System.out.println("You can start from:");
//            System.out.println("1) A random grid");
//            System.out.println("2) R-Pentomino");
//            System.out.println("Please type the number of your choice");
//            choice = scanner.nextInt();
//            if (choice == 1) {
                randomReset();
//                incorrect = false;
//            } else if (choice == 2) {
//                rPentomino();
//                incorrect = false;
//            } else {
//                System.out.println("That is not a choice. Please enter a valid option.");
//            }
//        }
        print();
        thread.sleep(speed);
        while (true) {
            play();
            frame.repaint();
            thread.sleep(speed);
        }
    }

    public void paint(Graphics g) {
        for (int r = 0; r < 40; r++) {
            for (int c = 0; c < 58; c++) {
                if (grid[r][c] == live) {
                    drawLive(r, c, g);
                }
            }
        }
    }
}