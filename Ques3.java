import java.util.Scanner;

// Consider the index of the month (let say 1 for January). Write a java program to
// print the name of the month and number of days in the month. Use Switch Case.

import java.util.*;
public class Ques3 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Enter the index to find out the month and number of days");
        index = sc.nextInt();//take input from user
        switch(index){

            case 1://index of the month starts from 1
            System.out.println("Month - January, Number of days - 31");
            break;

            case 2:
            System.out.println("Month - February, Number of days - 28");
            break;

            case 3:
            System.out.println("Month - March, Number of days - 30");
            break;

            case 4:
            System.out.println("Month - April, Number of days - 31");
            break;

            case 5:
            System.out.println("Month - May, Number of days - 30");
            break;

            case 6:
            System.out.println("Month - June, Number of days - 31");
            break;

            case 7:
            System.out.println("Month - July, Number of days - 30");
            break;

            case 8:
            System.out.println("Month - August, Number of days - 31");
            break;

            case 9:
            System.out.println("Month - September, Number of days - 30");
            break;

            case 10:
            System.out.println("Month - October, Number of days - 31");
            break;

            case 11:
            System.out.println("Month - November, Number of days - 30");
            break;

            case 12:
            System.out.println("Month - December, Number of days - 31");
            break;

            default://case when the index is invalid
            System.out.println("Invalid Index");
            break;

        }

    }


}
