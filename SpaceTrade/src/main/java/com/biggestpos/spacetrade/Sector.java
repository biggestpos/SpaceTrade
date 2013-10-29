package com.biggestpos.spacetrade;

import java.util.ArrayList;

/**
 * Created by robpayne on 10/29/13.
 */
public class Sector {

    Market myMarket = null;
    ArrayList<Ship> myShips = new ArrayList<Ship>();

    float navigability = 0; // 0 to 1 with 0 being easily navigable and 1 being impassable.
    int x;
    int y;
    int z;

    public Sector (int x, int y, int z){

        this.x = x;
        this.y = y;
        this.z = z;



    }
}
