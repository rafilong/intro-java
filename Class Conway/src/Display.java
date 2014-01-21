import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

// Note that the JComponent is set up to listen for mouse clicks
// and mouse movement.  To achieve this, the MouseListener and
// MousMotionListener interfaces are implemented and there is additional
// code in init() to attach those interfaces to the JComponent.

// See the other submitted assignment in the Schoology Dropbox for summary paragraph

public class Display extends JComponent implements MouseListener, MouseMotionListener {
    public static final int ROWS = 90; // Originally 80, fullscreen at 90
    public static final int COLS = 180; // Originally 100, fullscreen at 180
    public static Cell[][] cell = new Cell[COLS][ROWS];
    private final int X_GRID_OFFSET = 25; // 25 pixels from left
    private final int Y_GRID_OFFSET = 40; // 40 pixels from top
    private final int CELL_WIDTH = 5;
    private final int CELL_HEIGHT = 5;
    public static boolean wrapOn = false;
    public static boolean colorOn = true;
    private int cellSpeed = 100;
    private int genCount = 0;
    private int popCount = 0;
    private int sidePos = COLS * 6 + 60; // X coordinate for side bar buttons
    private int bottomPos = ROWS * 6 + 70; // Y coordinate for bottom bar buttons
    private boolean stable = false;
    private int stableCounts = 10;
    private int[][] stableGen = new int[stableCounts][stableCounts];
    private int[][] stablePop = new int[stableCounts][stableCounts];
    private boolean[][] rules = new boolean[9][2];
    private SpeedBox speedBox = new SpeedBox();
    
    // Note that a final field can be initialized in constructor
    private final int DISPLAY_WIDTH;
    private final int DISPLAY_HEIGHT;
    private StartButton startStop;
    private boolean paintloop = false;
    private NextButton next;
    private ClearButton clear;
    private QuitButton quit;
    private WrapButton wrap;
    private ColorButton color;
    private RandomButton random;
    private PauseButton pause;
    private JLabel genDisplay = new JLabel("Generation - " + String.valueOf(genCount));
    private JLabel popDisplay = new JLabel("Population - " + String.valueOf(popCount));
    private JLabel stabilityMeter = new JLabel("Population Stable");
    private JLabel birth = new JLabel("Birth Rules", SwingConstants.CENTER);
    private JLabel survive = new JLabel("Survival Rules", SwingConstants.CENTER);
    private RuleButton L0 = new RuleButton("0", false);
    private RuleButton L1 = new RuleButton("1", false);
    private RuleButton L2 = new RuleButton("2", false, true);
    private RuleButton L3 = new RuleButton("3", false, true);
    private RuleButton L4 = new RuleButton("4", false);
    private RuleButton L5 = new RuleButton("5", false);
    private RuleButton L6 = new RuleButton("6", false);
    private RuleButton L7 = new RuleButton("7", false);
    private RuleButton L8 = new RuleButton("8", false);
    private RuleButton D0 = new RuleButton("0", true);
    private RuleButton D1 = new RuleButton("1", true);
    private RuleButton D2 = new RuleButton("2", true);
    private RuleButton D3 = new RuleButton("3", true, true);
    private RuleButton D4 = new RuleButton("4", true);
    private RuleButton D5 = new RuleButton("5", true);
    private RuleButton D6 = new RuleButton("6", true);
    private RuleButton D7 = new RuleButton("7", true);
    private RuleButton D8 = new RuleButton("8", true);

    public Display(int width, int height) {
        DISPLAY_WIDTH = width;
        DISPLAY_HEIGHT = height;
        init();
    }


    public void init() {
    	// Adds all of the buttons, cells, and JLabels
        setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        initCells();

        addMouseListener(this);
        addMouseMotionListener(this);

        startStop = new StartButton();
        next = new NextButton();
        clear = new ClearButton();
        quit = new QuitButton();
        wrap = new WrapButton();
        color = new ColorButton();
        random = new RandomButton();
        pause = new PauseButton();
        startStop.setBounds(25, bottomPos, 100, 36);
        next.setBounds(275, bottomPos, 100, 36);
        clear.setBounds(400, bottomPos, 100, 36);
        quit.setBounds(525, bottomPos, 100, 36);
        pause.setBounds(150, bottomPos, 100, 36);
        wrap.setBounds(sidePos, 130, 100, 36);
        color.setBounds(sidePos, 180, 100, 36);
        random.setBounds(sidePos, 260, 100, 36);
        add(startStop);
        add(next);
        add(clear);
        add(quit);
        add(wrap);
        add(color);
        add(random);
        add(pause);
        startStop.setVisible(true);
        next.setVisible(true);
        clear.setVisible(true);
        quit.setVisible(true);
        wrap.setVisible(true);
        color.setVisible(true);
        random.setVisible(true);
        pause.setVisible(true);
        add(genDisplay);
        add(popDisplay);
        add(stabilityMeter);
        add(speedBox);
        add(birth);
        add(survive);
        genDisplay.setLocation(sidePos, 35);
        popDisplay.setLocation(sidePos, 65);
        stabilityMeter.setLocation(sidePos, 95);
        speedBox.setBounds(sidePos, 220, 100, 36);
        birth.setLocation(sidePos, 300);
        survive.setLocation(sidePos, 430);
        genDisplay.setSize(150, 25);
        popDisplay.setSize(150, 25);
        stabilityMeter.setSize(150, 25);
        birth.setSize(100, 25);
        survive.setSize(100, 25);
        genDisplay.setVisible(true);
        popDisplay.setVisible(true);
        stabilityMeter.setVisible(false);
        speedBox.setVisible(true);
        birth.setVisible(true);
        survive.setVisible(true);
        for (int i = 0; i < stableCounts; i++) {
        	for (int j = 0; j < stableCounts; j++) {
        	stableGen[i][j] = 0;
        	stablePop[i][j] = 0;
        	}
        }
        add(L0);
        add(L1);
        add(L2);
        add(L3);
        add(L4);
        add(L5);
        add(L6);
        add(L7);
        add(L8);
        add(D0);
        add(D1);
        add(D2);
        add(D3);
        add(D4);
        add(D5);
        add(D6);
        add(D7);
        add(D8);
        repaint();
    }


    public void paintComponent(Graphics g) {
    	/* This is performed when repaint() is called.
    	 * It repaints the cells on the grip so that the dead ones disappear
    	 * and the live ones appear.
    	 */
        g.setColor(Color.GRAY);
        drawGrid(g);
        drawCells(g);
        drawButtons();

        if (paintloop) {
            try {
                Thread.sleep(cellSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextGeneration();
            stabilityCheck();
            if (stable) stabilityMeter.setVisible(true);
            else stabilityMeter.setVisible(false);
            repaint();
        }
        chooseColor();
        repaint();
    }


    public void initCells() {
    	// Creates the cell objects
    	int tempPop = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cell[col][row] = new Cell(col, row);
            }
        }
        
        // Sets certain cells to start off alive
        cell[49][38].setAlive(true);
        cell[49][39].setAlive(true);
        cell[49][40].setAlive(true);
        cell[48][39].setAlive(true);
        cell[50][38].setAlive(true);
        
        // Checks to see if the cells will be alive next turn
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cell[col][row].calcNeighbors(cell);
                int neighbors = cell[col][row].getNeighbors();
                cell[col][row].setAliveNextTurn(false);
                for (int i = 0; i < 9; i++) {
                	if (cell[col][row].getAliveNextTurn() == false) {
						if (cell[col][row].getAlive() && neighbors == i && rules[i][0]) {
							cell[col][row].setAliveNextTurn(true);
						} else if (cell[col][row].getAlive() == false && neighbors == i && rules[i][1]) {
							cell[col][row].setAliveNextTurn(true);
						} else {
							cell[col][row].setAliveNextTurn(false);
						}
                	}
                }
                if (cell[col][row].getAlive()) tempPop++;
            }
        }
        // Updates the population counter
        popCount = tempPop;
        popDisplay.setText("Population - " + String.valueOf(popCount));
    }


    public void togglePaintLoop() {
        paintloop = !paintloop;
    }


    public void setPaintLoop(boolean value) {
        paintloop = value;
    }


    void drawGrid(Graphics g) {
        for (int row = 0; row <= ROWS; row++) {
            g.drawLine(X_GRID_OFFSET,
                    Y_GRID_OFFSET + (row * (CELL_HEIGHT + 1)), X_GRID_OFFSET
                    + COLS * (CELL_WIDTH + 1), Y_GRID_OFFSET
                    + (row * (CELL_HEIGHT + 1)));
        }
        for (int col = 0; col <= COLS; col++) {
            g.drawLine(X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET,
                    X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET
                    + ROWS * (CELL_HEIGHT + 1));
        }
    }

    
    void drawCells(Graphics g) {
        // Have each cell draw itself
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                // The cell cannot know for certain the offsets nor the height
                // and width; it has been set up to know its own position, so
                // that need not be passed as an argument to the draw method
                cell[col][row].draw(X_GRID_OFFSET, Y_GRID_OFFSET, CELL_WIDTH, CELL_HEIGHT, g);
            }
        }
    }


    private void drawButtons() {
    	// repaints the buttons
        startStop.repaint();
        next.repaint();
        clear.repaint();
        quit.repaint();
        wrap.repaint();
        color.repaint();
        random.repaint();
        L0.repaint();
        L1.repaint();
        L2.repaint();
        L3.repaint();
        L4.repaint();
        L5.repaint();
        L6.repaint();
        L7.repaint();
        L8.repaint();
        D0.repaint();
        D1.repaint();
        D2.repaint();
        D3.repaint();
        D4.repaint();
        D5.repaint();
        D6.repaint();
        D7.repaint();
        D8.repaint();
    }
    
    
    private void nextGeneration() {
    	// Next generation sets each cell to be alive or dead based on what was previously calculated
    	// in decideAliveNextTurn(). It then runs decideAliveNextTurn() and updates the population counter
    	int tempPop = 0;
    	decideAliveNextTurn();
    	for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cell[col][row].setAlive(cell[col][row].getAliveNextTurn());
                if (cell[col][row].getAlive()) tempPop++;
            }
        }
        decideAliveNextTurn();
        genCount++;
        genDisplay.setText("Generation - " + String.valueOf(genCount));
        popCount = tempPop;
        popDisplay.setText("Population - " + String.valueOf(popCount));
    }
    
    public void chooseColor() {
    	// Calculates what color each cell is based on whether it will live,
    	// die of over population, or die of isolation next turn. We call it...
    	// Forecast coloring
    	if (colorOn) {
			for (int row = 0; row < ROWS; row++) {
				for (int col = 0; col < COLS; col++) {
					if (cell[col][row].getAliveNextTurn() == false && cell[col][row].getAlive()) {
						if (cell[col][row].getNeighbors() < 2) cell[col][row].setColor(cell[col][row].CellFew);
						else if (cell[col][row].getNeighbors() > 3) cell[col][row].setColor(cell[col][row].CellOver);
						else cell[col][row].setColor(cell[col][row].CellNormal);
					}
				}
			}
    	}
    }
    
    public void decideAliveNextTurn() {
    	// Decide alive next turn calculates which cells will survive or die the next turn
    	for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cell[col][row].calcNeighbors(cell);
                int neighbors = cell[col][row].getNeighbors();
                cell[col][row].setAliveNextTurn(false);
                for (int i = 0; i < 9; i++) {
                	if (cell[col][row].getAliveNextTurn() == false) {
						if (cell[col][row].getAlive() && neighbors == i && rules[i][0]) {
							cell[col][row].setAliveNextTurn(true);
						} else if (cell[col][row].getAlive() == false && neighbors == i && rules[i][1]) {
							cell[col][row].setAliveNextTurn(true);
						} else {
							cell[col][row].setAliveNextTurn(false);
						}
                	}
                }   
            }
        }
    	chooseColor();
    }
    
    public void randomize() {
    	// randomize resets the grid with randomly generated cells
    	for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
        		double ranNum = Math.random();
        		if (ranNum > 0.95) {
        			cell[col][row].setAlive(true);
        		} else {
        			cell[col][row].setAlive(false);
        		}
            }
    	}
    }
    
    public void stabilityCheck() {
    	// Stability check checks to see if the formation has stabilized by
    	// comparing the current population to previous populations. If the
    	// population is the same over a regular period of time more than twice,
    	// this method decides that the population has stabilized. 99% accurate
    	for (int i = 0; i < stableCounts; i++){
			int num = genCount % (stableCounts - i);
			if (stablePop[num][i] == popCount) stableGen[num][i]++;
			else stableGen[num][i] = 0;
			if (stable == false && stableGen[num][i] > 2) stable = true;
			
			stablePop[num][i] = popCount;
		}
    }
    
    public void mouseClicked(MouseEvent e) {
    	// Kills live cells, and resurrects dead ones where clicked
    	int x = e.getX(); // Gets the mouse position
    	int y = e.getY();
    	// Daniel helped us  by showing us how to get the mouse position and how to do the offsets
    	x=x/6-4; // Takes the offset of the grid into account
    	y=y/6-7;
    	
    	try{
    		cell[x][y].setAlive(!cell[x][y].getAlive());
    	} catch (ArrayIndexOutOfBoundsException f) {} // Gets rid of error messages when you click outside of the grid
    	int tempPop = 0;
    	for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (cell[col][row].getAlive()) tempPop++;
            }
        }
        popCount = tempPop; // Updates the population counter
        popDisplay.setText("Population - " + String.valueOf(popCount));
        chooseColor();
        stable = false;
    }

    public void mouseEntered(MouseEvent arg0) {

    }

    public void mouseExited(MouseEvent arg0) {

    }

    public void mousePressed(MouseEvent arg0) {
    	
    }

    public void mouseReleased(MouseEvent arg0) {
    	
    }

    public void mouseDragged(MouseEvent e) {
    	// Adds live cells when the mouse is clicked and dragged
    	int x = e.getX();
    	int y = e.getY();
    	// Daniel helped us  by showing us how to get the mouse position and how to do the offsets
    	x=x/6-4;
    	y=y/6-7;
    	
    	try{
    		cell[x][y].setAlive(true);
    	} catch (ArrayIndexOutOfBoundsException f) {}
    	int tempPop = 0;
    	for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (cell[col][row].getAlive()) tempPop++;
            }
        }
        popCount = tempPop;
        popDisplay.setText("Population - " + String.valueOf(popCount));
        chooseColor();
        stable = false;
    }

    public void mouseMoved(MouseEvent arg0) {
        
    }
    
    
    private class StartButton extends JButton implements ActionListener { // Start/Stop Button
        StartButton() {
            super("Start");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            if (this.getText().equals("Start")) {
                togglePaintLoop();
                setText("Pause");
                pause.setText("Pause"); // Makes sure that the pause button changes with the start button
            } else {
                togglePaintLoop();
                setText("Start");
                pause.setText("Unpause");
            }
            repaint();
        }
    }
    
    private class PauseButton extends JButton implements ActionListener { // Does the same as the start button
        PauseButton() {
            super("Unpause");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            if (this.getText().equals("Unpause")) {
                togglePaintLoop();
                setText("Pause");
                startStop.setText("Pause"); // Makes sure that the start button changes with the pause button
            } else {
                togglePaintLoop();
                setText("Unpause");
                startStop.setText("Start");
            }
            repaint();
        }
    }
    
    private class ClearButton extends JButton implements ActionListener { // Clears the grid and pauses the game
        ClearButton() {
            super("Clear");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
        	for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                	cell[col][row].setAlive(false);
                }
        	}
        	if (startStop.getText().equals("Pause")){
        		togglePaintLoop();
                startStop.setText("Start");
                pause.setText("Unpause");
        	}
        	nextGeneration();
            genCount = 0; // Resets the generation and population counters
            genDisplay.setText("Generation - " + String.valueOf(genCount));
            popCount = 0;
            popDisplay.setText("Population - " + String.valueOf(popCount));
            stable = false;
            repaint();
        }
    }
    
    private class NextButton extends JButton implements ActionListener { // Progresses the game by one step
        NextButton() {
            super("Next Step");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            if (startStop.getText().equals("Start")) nextGeneration();
            stabilityCheck();
            if (stable) stabilityMeter.setVisible(true);
            else stabilityMeter.setVisible(false);
            repaint();
        }
    }
    
    private class QuitButton extends JButton implements ActionListener { // Quits the program
        QuitButton() {
            super("Quit");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            System.exit(0);
            repaint();
        }
    }
    
    private class WrapButton extends JButton implements ActionListener { // Toggles wrapping on and off
        WrapButton() {
            super("Wrap Off");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            if (this.getText().equals("Wrap On")) {
                wrapOn = false;
                setText("Wrap Off");
            } else {
                wrapOn = true;
                setText("Wrap On");
            }
            stable = false;
            repaint();
        }
    }
    private class ColorButton extends JButton implements ActionListener { // Toggles forecast coloring on and off
        ColorButton() {
            super("Color On");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
            if (this.getText().equals("Color On")) {
                colorOn = false;
                setText("Color Off");
            } else {
                colorOn = true;
                setText("Color On");
            }
            repaint();
        }
    }
    
    private class RandomButton extends JButton implements ActionListener { // Resets the grid with randomly generated cells
        RandomButton() {
            super("Random");
            addActionListener(this);
        }

        public void actionPerformed(ActionEvent arg0) {
        	genCount = 0;
        	randomize();
        	nextGeneration();
        	stable = false;
            repaint();
        }
    }
    
    private class RuleButton extends JButton implements ActionListener { // Changes the rules of the game
    	String num;
    	int number;
    	boolean die;
    	boolean selected;
    	
        RuleButton(String numbre, boolean dies) { // Constructor that automatically disables the rule
            super(numbre);
            num = numbre;
            die = dies;
            number = Integer.parseInt(numbre);
            addActionListener(this);
            if (die) this.setBounds(sidePos + (33 * (number % 3)), 291 + 33 * ((number + 3) / 3), 33, 33); // Sets position of the button
            else this.setBounds(sidePos + (33 * (number % 3)), 423 + 33 * ((number + 3) / 3), 33, 33);
            if (die) rules[number][1] = false;
            else rules[number][0] = false;
            this.setVisible(true);
        }

        RuleButton(String numbre, boolean dies, boolean select) { // Constructor that takes the parameter to enable the rule
            super(numbre);
            num = numbre;
            die = dies;
            selected = select;
            number = Integer.parseInt(numbre);
            if (selected) this.setFont(this.getFont().deriveFont(Font.BOLD, 14));
            if (die && selected) rules[number][1] = true;
            else if (selected) rules[number][0] = true;
            else if (die) rules[number][1] = false;
            else rules[number][0] = false;
            if (die) this.setBounds(sidePos + (33 * (number % 3)), 291 + 33 * ((number + 3) / 3), 33, 33);
            else this.setBounds(sidePos + (33 * (number % 3)), 423 + 33 * ((number + 3) / 3), 33, 33);
            this.setVisible(true);
            addActionListener(this);
        }
        
        public void actionPerformed(ActionEvent arg0) {
            if (selected) {
                selected = false;
                if (die) rules[number][1] = false;
                else rules[number][0] = false;
                this.setFont(this.getFont().deriveFont(Font.PLAIN, 12));
            } else {
                selected = true;
                if (die) rules[number][1] = true;
                else rules[number][0] = true;
                this.setFont(this.getFont().deriveFont(Font.BOLD, 14));
            }
            repaint();
        }
    }
    
    private class SpeedBox extends JComboBox implements ActionListener { // A combo box with multiple speeds inside
    	public SpeedBox() {
			this.addItem("Super Slow");
			this.addItem("Slow");
			this.addItem("Medium");
			this.addItem("Fast");
			this.addItem("Super Fast");
			this.addItem("Lightspeed");
			this.addActionListener(this);
			this.setSelectedItem("Medium");
		}

		public void actionPerformed(ActionEvent arg0) {
    		if (this.getSelectedItem().toString().equals("Super Slow")) cellSpeed = 500;
    		else if (this.getSelectedItem().toString().equals("Slow")) cellSpeed = 250;
    		else if (this.getSelectedItem().toString().equals("Medium")) cellSpeed = 100;
    		else if (this.getSelectedItem().toString().equals("Fast")) cellSpeed = 50;
    		else if (this.getSelectedItem().toString().equals("Super Fast")) cellSpeed = 25;
    		else if (this.getSelectedItem().toString().equals("Lightspeed")) cellSpeed = 1;
    	}
    }
}

