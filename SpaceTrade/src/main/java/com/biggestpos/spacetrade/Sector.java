package com.biggestpos.spacetrade;

import java.util.ArrayList;

/**
 * Created by robpayne on 10/29/13.
 */
public class Sector {

    Market myMarket = null;
    ArrayList<Ship> myShips = new ArrayList<Ship>();
    Universe myUniverse = null;

    public float navigability = 0; // 0 to 1 with 0 being easily navigable and 1 being impassable.
    protected int x;
    protected int y;
    protected int z;

    public Sector (int x, int y, int z, Universe theUniverse){

        this.x = x;
        this.y = y;
        this.z = z;

        this.myUniverse = theUniverse;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    ArrayList scanAdjacentSectors(){
        return myUniverse.scanAdjacentSectors(x, y, z);
    }


}
