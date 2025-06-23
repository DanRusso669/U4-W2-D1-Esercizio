package exceptions;

public class NumberLessThanZeroException extends Exception {

    public NumberLessThanZeroException(int num) {
        super("The number entered " + num + " is less than 0.");
    }

    public NumberLessThanZeroException(double num) {
        super("The number entered " + num + " is less than 0.");
    }
}
