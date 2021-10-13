package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner binaryInput = new Scanner(System.in);
        Scanner columnAmount = new Scanner(System.in);
        int denaryAnswer;
        int binaryColumn;
        int bit;
        int bitNum;

        denaryAnswer = 0;
        binaryColumn = 8;
        bitNum = 1;

        while (binaryColumn >= 1) {

            System.out.println("Enter bit number " + bitNum);
            bit = binaryInput.nextInt();
            denaryAnswer = denaryAnswer + (binaryColumn * bit);
            binaryColumn = binaryColumn/2;
            bitNum++;
        }

        if(binaryColumn < 1){

            System.out.println("The decimal answer is " + denaryAnswer);

        }

    }
}
