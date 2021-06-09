package com.company;

import java.util.Arrays;
import java.util.SortedMap;

public class Stack {
    private int[] numbers;

    public Stack(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] push(int number){
        int[] copyOfArray = new int[numbers.length + 1];
        copyOfArray[0] = number;
        for (int i = 1 ; i < copyOfArray.length; i++){
            copyOfArray[i] = numbers[i-1];
        }
        numbers = new int[copyOfArray.length];

        for (int i = 0 ; i < copyOfArray.length; i++){
            numbers[i] = copyOfArray[i];
        }
        return numbers;
    }

    public int pop(){
        int[] copyOfArray = new int[numbers.length - 1];
        int popValue = numbers[0];
        if (empty() == true){
            System.out.println("Stack is Empty.");
            return -1;
        } else {
            for (int i = 0 ; i < copyOfArray.length; i++){
                copyOfArray[i] = numbers[i+1];
            }

            numbers = new int[copyOfArray.length];
            for (int i = 0 ; i < copyOfArray.length; i++){
                numbers[i] = copyOfArray[i];
            }
            System.out.println("pop -> " + popValue);
            return popValue;
        }
    }

    public boolean empty(){
        boolean isEmpty = true;
        for (int i = 0 ; i<numbers.length ; i++){
            if (numbers[i] != 0){
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public int count(){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != 0){
                counter++;
            }
        }
        return counter;
    }
}
