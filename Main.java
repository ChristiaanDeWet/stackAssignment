package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbersOne = {42,66,99};
        int[] anotherArray = new int[4];
        int[] arrayOfNumbersTwo = {50,51,52,53,54};
        int[] arrayOfNumbersThree = {1,2,3,4,5,6,7,8,9,10};

        Stack stack = new Stack(anotherArray);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.count());
        stack.pop();
        System.out.println(stack.count());
        stack.pop();
        System.out.println(stack.count());
        stack.pop();
        System.out.println(stack.count());


    }
}
