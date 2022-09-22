// A city of 80,000 people is increasing at the rate of 5% annually. When will
// their population first exceed 150000? Write a java program for it. Use While Loop.

public class Ques4 {
    public static void main(String args[]){

        //We are asumming that we are applying 5% on the increased amount of previous year
        int population = 80000;
        double rate = 0.05;
        int desiredPopulation = 150000;
        int timeInYears = 0;
        while(population <= desiredPopulation){

            population += (int)(rate*population); //we add the 5% of population to existing population
            timeInYears++;

        }
        System.out.println("The population will exceed after " + timeInYears + " years");
    }
}
