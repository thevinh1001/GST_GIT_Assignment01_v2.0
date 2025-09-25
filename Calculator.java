public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

public double power(int a, int b) {
    return Math.pow(a, b);
}

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("plus: " + c.plus(5, 3));
        System.out.println("minus: " + c.minus(5, 3));
        System.out.println("multiply: " + c.multiply(5, 3));
        System.out.println("divide: " + c.divide(6, 3));
        System.out.println("power: " + c.power(2, 3));

    }
}
