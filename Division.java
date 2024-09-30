import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        //Gets and stores inputs from the autograder. 
        Scanner graderInput = new Scanner(System.in);

        double firstNumber = graderInput.nextDouble();
        double secondNumber = graderInput.nextDouble();

        
        //Default output for result
        double result = firstNumber / secondNumber;

        System.out.print(result);
    }
}
