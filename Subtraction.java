
public class Subtraction {
    public static void main(String[] args) {
        //Retrieves inputs from the autograder.
        double firstNumber = AutoGraderInput.getFirstNumber();
        double secondNumber = AutoGraderInput.getSecondNumber();

        double subtracted = firstNumber - secondNumber;

        System.out.print(subtracted);

    }
}
