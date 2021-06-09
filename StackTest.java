package com.company;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void popTest() throws Exception{
        int[] arrayOfNumbersOne = {3,2,1};
        int[] anotherArray = new int[4];

        Stack stack = new Stack(arrayOfNumbersOne);
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.pop());

        Stack stack2 = new Stack(anotherArray);
        Assert.assertEquals(-1, stack2.pop());

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        Assert.assertEquals(3,stack2.pop());
        Assert.assertEquals(2,stack2.pop());
        Assert.assertEquals(1,stack2.pop());
    }

}