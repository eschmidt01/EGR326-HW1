import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Eric Schmidt, Section B
 * This class/program stores a list of tiles in an ArrayList and uses various
 * methods to manipulate a group of tiles based on user input from other classes.
 */
public class TileManager {
    private List<Tile> tiles = new ArrayList<>(); //DO NOT MODIFY THIS LINE
    //Implement your own code here
    // This is a Constructor Method.
    public TileManager() {
    }

    // This method adds a tile to the end of the tiles ArrayList.
    public void addTile(Tile t1) {
        tiles.add(t1);
    }

    // This method draws all the tiles using the Graphics object and draw method.
    public void drawAll(Graphics g) {
        for (Tile tile : tiles) {
            tile.draw(g);
        }
    }

    // This method moves the left-clicked tile to the end of the list of tiles using the getTopTile helper method.
    public void raise(int x, int y) {
        if (tiles.size() != 0) {
            int temp = getTopTile(x, y);
            if (temp != -1) {
                Tile tempTile = tiles.get(temp);
                tiles.remove(temp);
                tiles.add(tempTile);
            }
        }
    }

    // This method moves the shift left-clicked tile to the beginning of the list of tiles.
    public void lower(int x, int y) {
        if (tiles.size() != 0) {
            int temp = getTopTile(x, y);
            if (temp != -1) {
                Tile tempTile = tiles.get(temp);
                tiles.remove(temp);
                tiles.add(0, tempTile);
            }
        }
    }

    // This method deletes the topmost tile.
    public void delete(int x, int y) {
        if (tiles.size() != 0) {
            int temp = getTopTile(x, y);
            if (temp != -1) {
                tiles.remove(temp);
            }
        }
    }

    // This method deletes all tiles that are touching the same x, y coordinates.
    public void deleteAll(int x, int y) {
        while (tiles.size() != 0) {
            int temp = getTopTile(x, y);
            if (temp == -1) {
                break;
            } else {
                tiles.remove(temp);
            }
        }
    }

    // This method uses the Collections.shuffle method to
    // 1) reorder the tiles into a random order and
    // 2) move every tile into a new random x, y position.
    public void shuffle(int width, int height) {
        if (tiles.size() != 0) {
            Collections.shuffle(tiles);
            for (Tile tile : tiles) {
                tile.setX((int) (Math.random() * (width - tile.getWidth())));
                tile.setY((int) (Math.random() * (height - tile.getHeight())));
            }
        }
    }

    // This helper-method returns the top most tile with the given x, y user input coordinates.
    private int getTopTile(int x, int y) {
        boolean found = false;
        int numTile = tiles.size() - 1;
        while (!found) {
            Tile tempTile = tiles.get(numTile);
            boolean boundX = tempTile.getX() <= x && tempTile.getX() + tempTile.getWidth() >= x;
            boolean boundY = tempTile.getY() <= y && tempTile.getY() + tempTile.getHeight() >= y;
            if (boundX && boundY) {
                found = true;
            } else if (numTile == 0) {
                numTile = -1;
                found = true;
            } else {
                numTile--;
            }
        }
        return numTile;
    }

    //*** FOR TESTING PURPOSE ONLY ****//
    //SHOULD USE THIS METHOD ONLY IN J-UNIT TEST CODE
    //DO NOT MODIFY THIS METHOD
    public List<Tile> getTiles() {
        return tiles;
    }
}