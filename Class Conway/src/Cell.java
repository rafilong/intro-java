import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	Color CellNormal = new Color(0x0090FF);
	Color CellFew = new Color(0x80C7FF);
	Color CellOver = new Color(0x006CBF);
    private int myX, myY; // x,y position on grid
    private boolean myAlive; // alive (true) or dead (false)
    private int myNeighbors; // count of neighbors with respect to x,y
    private boolean myAliveNextTurn; // Used for state in next iteration
    private Color myColor; // Based on alive/dead rules
    private final Color DEFAULT_ALIVE = CellNormal;
    private final Color DEFAULT_DEAD = Color.WHITE;

    public Cell(int col, int row) {
        this(col, row, false, Color.WHITE);
    }

    public Cell(int col, int row, boolean alive, Color color) {
        myAlive = alive;
        myColor = color;
        myX = col;
        myY = row;
    }

    public boolean getAlive() {
        return myAlive;
    }

    public int getX() {
        return myX;
    }

    public int getY() {
        return myY;
    }

    public Color getColor() {
        return myColor;
    }

    public void setAlive(boolean alive) {
        if (alive) {
            setAlive(true, DEFAULT_ALIVE);
        } else {
            setAlive(false, DEFAULT_DEAD);
        }
    }

    public void setAlive(boolean alive, Color color) {
        myColor = color;
        myAlive = alive;
    }

    public void setAliveNextTurn(boolean alive) {
        myAliveNextTurn = alive;
    }

    public boolean getAliveNextTurn() {
        return myAliveNextTurn;
    }

    public void setColor(Color color) {
        myColor = color;
    }

    public int getNeighbors() {
        return myNeighbors;
    }

    // Calculates the neighbors of the cell and invokes wrap when it is turned on
    public void calcNeighbors(Cell[][] cell) {
        myNeighbors = 0;
        // the for loops cycle through the cell's neighbors
        for (int neighborX = this.getX() - 1; neighborX <= this.getX() + 1; neighborX++) {
            for (int neighborY = this.getY() - 1; neighborY <= this.getY() + 1; neighborY++) {
                if (neighborX < 0 || neighborX >= Display.COLS || neighborY < 0 || neighborY >= Display.ROWS) {
                	if (Display.wrapOn) wrap(cell, neighborX, neighborY);
                }
                else if (cell[neighborX][neighborY].getAlive()) {
                    myNeighbors++;
                }
            }
        }
        if (this.getAlive()) myNeighbors--;
    }

    // Wraps the calcNeighbors
    public void wrap(Cell[][] cell, int x, int y) {
    	if (x < 0){
    		x = Display.COLS - 1;
    	}
    	if (x >= Display.COLS){
    		x = 0;
    	}
    	if (y < 0){
    		y = Display.ROWS - 1;
    	}
    	if (y >= Display.ROWS){
    		y = 0;
    	}
    	if (cell[x][y].getAlive()) {
            myNeighbors++;
        }
    }
    
    public void draw(int x_offset, int y_offset, int width, int height,
            Graphics g) {
        // I leave this understanding to the reader
        int xleft = x_offset + 1 + (myX * (width + 1));
        int xright = x_offset + width + (myX * (width + 1));
        int ytop = y_offset + 1 + (myY * (height + 1));
        int ybottom = y_offset + height + (myY * (height + 1));
        Color temp = g.getColor();

        g.setColor(myColor);
        g.fillRect(xleft, ytop, width, height);
    }
}

