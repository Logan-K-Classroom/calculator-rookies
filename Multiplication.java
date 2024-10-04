
public class Multiplication {
    public static void main(String[] args) {
        //Retrieves inputs from the autograder.
        double firstNumber = AutoGraderInput.getFirstNumber();
        double secondNumber = AutoGraderInput.getSecondNumber();

        double mult = firstNumber * secondNumber;

        System.out.print(mult);

    }
}
