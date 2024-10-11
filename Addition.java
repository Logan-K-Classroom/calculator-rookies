
public class Addition {
    public static void main(String[] args) {
        //Retrieves inputs from the autograder.
        double firstNumber = AutoGraderInput.getFirstNumber();
        double secondNumber = AutoGraderInput.getSecondNumber();

        double sum = firstNumber + secondNumber; 

        System.out.print(sum);
    }
}
