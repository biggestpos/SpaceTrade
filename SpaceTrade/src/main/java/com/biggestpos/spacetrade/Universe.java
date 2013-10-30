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
                    aSector.navigability = myRandom.nextFloat();

                    mySectors[x][y][z] = aSector;

                }
            }
        }

        //lets pre-populate the world with with markets (space ports)
        for(int i = 0;i <= size;i++){
            x = myRandom.nextInt(10);
            y = myRandom.nextInt(10);
            z = myRandom.nextInt(10);

            Sector aSector = mySectors[x][y][z];

            aSector.myMarket = new Market();
        }
    }

}
