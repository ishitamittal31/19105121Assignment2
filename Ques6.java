// Write a do-while loop that will print out all the multiples of 3 from 3 to 36, that
// is: 3 6 9 12 15 18 21 24 27 30 33 36.
public class Ques6 {
    public static void main(String args[]){

        int leftLimit = 3; // the range starts from 3
        int rightLimit = 36; // the range should end at 3

        do{
            System.out.print(leftLimit + " ");
            leftLimit += 3; // adding 3 in order to get the multiples OR WE CAN USE if (leftlimit%3==0) condition
        }
        while(leftLimit <= rightLimit);

    }
}
