public class Main  {



    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.add(5, 8);
        System.out.println("The sum is " + myCalculator.add(5, 8));
        System.out.println("The difference is " + myCalculator.subtract(20, 9));
        System.out.println ("The product is " + myCalculator.multiply(4, 3));
        System.out.println ("The quotient is " + myCalculator.divide(21, 2));
        System.out.println ("The squared number is " + myCalculator.square(5));
        System.out.println ("The cubed number is " + myCalculator.cube(4));
        System.out.println ("The product is " + myCalculator.exponent(3, 3));

        //exponent
    }
}
