package com.mattdepoorter.game_of_life;

import org.junit.Assert;
import org.junit.Test;

public class GenerateTreeOfLifeTest {
private final TreeOfLifeGenerator generator = new TreeOfLifeGenerator();
    @Test
    public void testGenerator(){
        final boolean [][] startingGrid = new boolean[3][3];
        boolean [][] gridResult = generator.newPhase(startingGrid);
        Assert.assertArrayEquals(startingGrid, gridResult);
    }

    @Test
    public void testGridCheck(){

    }
}
