public class Calculator {
    public int plus(int a, int b)       { return a + b; }
    public int minus(int a, int b)      { return a - b; }
    public int multiply(int a, int b)   { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {git 
        Calculator c = new Calculator();
        System.out.println("plus: "     + c.plus(6,3));
        System.out.println("minus: "    + c.minus(6,3));
        System.out.println("multiply: " + c.multiply(6,3));
        System.out.println("divide: "   + c.divide(6,3));
    }
}
