// Custom Exception Class
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class CWH_84_throw_throws {

    // Method that throws custom exception
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    // Method that throws ArithmeticException
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 7);
            System.out.println("Result: " + c);

            double ar = area(-5);
            System.out.println("Area: " + ar);
        }
        catch (NegativeRadiusException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}