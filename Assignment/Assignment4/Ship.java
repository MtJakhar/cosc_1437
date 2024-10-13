public class Ship {
  private int size;
  private int placement[] = new int[2];
  private boolean shipSunk = false;

  Ship(int size, int column, int row) {
    this.size = size;
    placement[0] = column;
    placement[1] = row;
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

  public void setShipSunk() {
    this.shipSunk = true;
  }
}
