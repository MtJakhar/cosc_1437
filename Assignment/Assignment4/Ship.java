
/**
 * Ship class which is a part of assignment 4,
 * October 11 2024
 * Muizz Jakhar 
 * cosc-1437.006
 */

import java.util.ArrayList;

public class Ship {
  private int size;
  private int placement[] = new int[2];
  private boolean shipSunk = false;
  private boolean isHorizontal;
  private ArrayList<int[]> shipPositions;

  Ship(int size, int column, int row, boolean isHorizontal) {
    this.size = size;
    this.isHorizontal = isHorizontal;
    placement[0] = column;
    placement[1] = row;
    shipPositions = new ArrayList<int[]>();

    for (int i = 0; i < size; i++) {
      if (isHorizontal) {
        shipPositions.add(new int[] { placement[0] + i, placement[1] });
      } else {
        shipPositions.add(new int[] { placement[0], placement[1] + i });
      }
    }
  }

  public int getSize() {
    return size;
  }

  public int[] getPlacement() {
    return placement;
  }

  public boolean getShipSunk() {
    return shipSunk;
  }

  public void getOrientation() {
    if (isHorizontal) {
      System.out.println("ship is oriented horizontally.");
    } else {
      System.out.println("ship is oriented vertically.");
    }
  }

  public void setShipSunk() {
    this.shipSunk = true;
  }

  public ArrayList<int[]> getShipPositions() {
    return shipPositions;
  }
}
