package com.biggestpos.spacetrade;

import java.util.ArrayList;

/**
 * Created by robpayne on 10/29/13.
 */
public class Ship {

    Sector currentSector;

    Sector[][][] mySectorMap = new Sector[Universe.size][Universe.size][Universe.size];

    int holds;
    int speed;
    int fuel;
    int food;
    int fun;

    public Ship(Sector startingSector){
        //place this sector in our sector map
        mySectorMap[startingSector.getX()][startingSector.getY()][startingSector.getZ()] = startingSector;

        //set the current sector to this one.
        currentSector = startingSector;
    }

    void scanAdjacentSectors(){
        ArrayList<Sector> theSectors = currentSector.scanAdjacentSectors();

        for(Sector aSector : theSectors){
            mySectorMap[aSector.getX()][aSector.getY()][aSector.getZ()] = aSector;
        }
    }
}
