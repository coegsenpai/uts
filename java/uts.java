//import scanner
import java.util.Scanner;

//import Math class

/**
 *
 * @author usergaming
 */
public class uts {

    public static void main(String[] args) {
        //declare variables
        try ( // TODO Auto-generated method stub
        //create scanner
                Scanner input = new Scanner(System.in)) {
            //declare variables
            double weight;
            int feet;
            int inches;
            //prompt user
            System.out.print("Enter weight in pounds: ");
            weight = input.nextFloat();
            System.out.print("Enter feet: ");
            feet = input.nextInt();
            System.out.print("Enter inches: ");
            inches = input.nextInt();
            //convert measurements
            double weightInKilos = weight * 0.453592;
            double heightInMeters = (((feet * 12) + inches) * .0254);
            double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
//      double bmi = weightInKilos / (heightInMeters * heightInMeters);
//display output
System.out.println("Your BMI is: " + bmi);
            //interpret BMI
            if (bmi < 18.5) {
                System.out.print("Underweight");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.print("Normal");
            }
            
            else if (bmi >= 25 && bmi < 30) {
                System.out.print("Overweight");
            }
            
            else if (bmi >= 30) {
                System.out.print("Obese");
            }
//      Do I need this last else if there?
//      else {
//          System.out.print("");
//      }
        }

    }

}