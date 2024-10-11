
public class Division {
    public static void main(String[] args) {
        //Retrieves inputs from the autograder.
        double firstNumber = AutoGraderInput.getFirstNumber();
        double secondNumber = AutoGraderInput.getSecondNumber();

        // Defines a double variable that takes the variable firstNumber and divides it by the variable secondNumber
        double quotient = firstNumber / secondNumber;
        
        //This function prints the value quotient to the console
        System.out.print(quotient);
    }
}
