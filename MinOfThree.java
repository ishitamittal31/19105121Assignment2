// Write the main() method of the MinOfThree class that determines which of the
// three numbers is the smallest number, and displays that number using if-else
// statement.(Note: You don’t have to take input from user. )


public class MinOfThree {
    
    public static void main(String args[]){

        int number1 = 10; // initializing the 3 variables
        int number2 = 5;
        int number3 = 20;
        int minimumNumber; //stores the final answer
        if(number1 < number2 && number1 < number3){ // condition for number1 to be smallest
            minimumNumber = number1;
        }
        else if(number2 < number1 && number2 < number3){ // condition for number2 to be smallest
            minimumNumber = number2;
        }
        else{
            minimumNumber = number3; // condition for number3 to be smallest
        }
        System.out.println("The smallest number is: " + minimumNumber);
    }

}
