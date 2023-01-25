import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.*;
import java.util.List;

/**
 * Add comments
 */
public class TileManagerTest {
    //MUST PROPERLY TEST ALL PUBLIC METHODS (except drawAll) in TileManager class
    //MUST CALL getTiles method to test the internal state of tiles in TileManager class
    //MUST RUN TEST WITH COVERAGE and SHOW minimum of 85% COVERAGE for TileManager to get the full credit in testing

    @Test (timeout = 5000)
    public void constructorTest() { //Example test provided by the instructor
        TileManager tileManager = new TileManager();
        List<Tile> tileList = tileManager.getTiles(); //use getTiles method to get the state of your tiles
        assertTrue("The constructor should initialize an empty list", tileList.isEmpty());
    }

    @Test (timeout = 5000)
    public void addTest() { //Example test provided by instructor (uncomment below after you implement addTile method)
//        TileManager tileManager = new TileManager();
//        Tile tile = new Tile(100, 100, 50, 20, Color.RED);
//        Tile tile2 = new Tile(35, 50, 20, 20, Color.blue);
//        Tile tile3 = new Tile(45, 170, 30, 90, Color.DARK_GRAY);
//        List<Tile> tileList = tileManager.getTiles();
//
//        tileManager.addTile(tile);
//        assertEquals("Tiles should be added to the end of the list", tile, tileList.get(0));
//        tileManager.addTile(tile2);
//        assertEquals("Tiles should be added to the end of the list", tile2, tileList.get(1));
//        tileManager.addTile(tile3);
//        assertEquals("Tiles should be added to the end of the list", tile3, tileList.get(2));
    }

    /**
     * Add comments
     */
    @Test (timeout = 5000)
    public void test1() {
        //Implement your code here
    }

    /**
     * Add comments
     */
    @Test (timeout = 5000)
    public void test2() {
        //Implement your code here
    }

    //ADD MORE TEST HERE
}