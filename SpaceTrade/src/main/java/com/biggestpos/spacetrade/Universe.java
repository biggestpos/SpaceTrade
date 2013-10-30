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
        for(int i = 0;i <= size;){
            int x = myRandom.nextInt(10);
            int y = myRandom.nextInt(10);
            int z = myRandom.nextInt(10);

            Sector aSector = mySectors[x][y][z];

            if(aSector.myMarket == null){
                aSector.myMarket = new Market(myRandom.nextInt(10000), myRandom.nextInt(500), myRandom.nextInt(250), myRandom.nextInt(10000));
                i++;
            }


        }
    }

}
