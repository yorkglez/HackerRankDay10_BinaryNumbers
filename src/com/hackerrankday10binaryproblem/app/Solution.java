package com.hackerrankday10binaryproblem.app;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int number = 0;     //Input number
        int res = 0;        //Residue of module
        int count = 0;      //This count save the consecutive 1
        int maxCount = 0;   //Save the current maximum count

        //Object declaration
        Scanner in = new Scanner(System.in);
        //Input number to binary
        number = in.nextInt();

        //Process convert decimal to
        while(number > 0)
        {
            //Get residue
            res = number % 2;
            number /= 2;
            //Validate if residue is 1
            if(res == 1)
            {
                count++;
                //Compare current count with max count
                if(count >= maxCount)
                {
                    maxCount = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        //Output
        System.out.println(maxCount);
        //Close input
        in.close();
    }
}
