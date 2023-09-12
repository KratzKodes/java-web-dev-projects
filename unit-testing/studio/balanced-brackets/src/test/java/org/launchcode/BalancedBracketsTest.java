package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptryString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Momo"));
    }

    @Test
    public void singleBracketTest(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));

    }

    @Test
    public void stringAndBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void nestedStringAndBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Coding Boot Camp: [Launch[Code]]"));
    }

    @Test
    public void nestedInsideBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    public void deepNested(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Inception [layer 2 [layer 3]]]"));
    }

    @Test
    public void multipleBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void multipleBracketWithNested(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Papa]][Dog]"));
    }


    @Test
    public void reversedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void singleLeft(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleRight(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    public void misMatched(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("My goals: [LaunchCode[career: get a job in tech ]"));
    }


}