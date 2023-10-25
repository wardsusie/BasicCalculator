public class Calculator {


    public Calculator() {

    }

    public int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        int difference;
        difference = a-b;
        return difference;
    }

    public int multiply(int a, int b) {
        int product;
        product = a*b;
        return product;
    }

    public double divide(double a, double b) {
        double quotient;
        quotient = a/b;
        return quotient;
    }

    public int square(int a) {
        int squaredNumber;
        squaredNumber = a*a;
        return squaredNumber;
    }

    public int cube(int a) {
        int cubedNumber;
        cubedNumber = a*a*a;
        return cubedNumber;
    }

    public int exponent(int a, int b) {
        int product = a;
        for(int i=1; i<b; i++){
            product = product*a;
        }
        return product;
    }
}
