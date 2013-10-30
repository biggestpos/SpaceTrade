package com.biggestpos.spacetrade;

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


                }
            }
        }
    }

}
