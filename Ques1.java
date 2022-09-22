// Suppose that score is a variable of type double. Write the java statement that
// increases the score by 5 marks if score is between 80 and 90.
import java.util.*;
public class Ques1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); // Scanner class , sc object for taking input
        double score; // score variableas mentioned in the question
        System.out.println("Enter the score: ");
        score = sc.nextDouble();
        if(score>80 && score<90){ // condition
            score += 5; //update the score according to question
        }
        System.out.println("The score is: " + score);

    }
}
