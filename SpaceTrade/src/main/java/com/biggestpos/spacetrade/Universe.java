package com.biggestpos.spacetrade;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by robpayne on 10/29/13.
 */
public class Universe {

    int size = 10;
    long seed = 1492;

    Random myRandom = new Random(seed);

    Sector[][][] mySectors = new Sector[size][size][size];

    public Universe(){

        for(int x = 0; x <= size;x++){
            for(int y = 0; y <= size;y++){
                for(int z = 0; z <= size;z++){

                    Sector aSector = new Sector(x, y, z);
                    aSector.navigability = myRandom.nextFloat();

                    mySectors[x][y][z] = aSector;

                }
            }
        }

        //lets pre-populate the world with with markets (space ports)
        for(int i = 0;i <= size;){
            int x = myRandom.nextInt(10);
            int y = myRandom.nextInt(10);
            int z = myRandom.nextInt(10);

            Sector aSector = mySectors[x][y][z];

            if(aSector.myMarket == null && aSector.navigability < 0.25){
                aSector.myMarket = new Market(myRandom.nextInt(10000), myRandom.nextInt(500), myRandom.nextInt(250), myRandom.nextInt(10000));
                i++;
            }


        }
    }

    Sector scanSector(int x, int y, int z){
        return mySectors[x][y][z];
    }

    ArrayList<Sector> scanAdjacentSectors(int x, int y, int z){
        ArrayList<Sector> adjacentSectors = new ArrayList<Sector>();

        int xPlus;
        int xMinus;
        int yPlus;
        int yMinus;
        int zPlus;
        int zMinus;

        if(x+1 > size){
            xPlus = 0;
        } else{
            xPlus = x+1;
        }

        if(x-1 < 0){
            xMinus = size;
        } else {
            xMinus = x-1;
        }

        if(y+1 > size){
            yPlus = 0;
        } else{
            yPlus = y + 1;
        }

        if(y - 1 < 0){
            yMinus = size;
        } else {
            yMinus = y - 1;
        }

        if(z + 1 > size){
            zPlus = 0;
        } else{
            zPlus = z + 1;
        }

        if(z - 1 < 0){
            zMinus = size;
        } else{
            zMinus = z - 1;
        }

        adjacentSectors.add(mySectors[xPlus][y][z]);
        adjacentSectors.add(mySectors[xMinus][y][z]);

        adjacentSectors.add(mySectors[x][yPlus][z]);
        adjacentSectors.add(mySectors[x][yMinus][z]);

        adjacentSectors.add(mySectors[x][y][zPlus]);
        adjacentSectors.add(mySectors[x][y][zMinus]);

        return adjacentSectors;
    }


}
