package polymorphism.compiletime;

public class Calculator {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer add(Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    public Double add(Double a, Double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // This is called compile time polymorphism because it gets pre-decided as to which
        // `add` method will be called on compile time based on the inputs provided. This is
        // popularly known as Method Overloading.
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(-1, 1, 10));
        System.out.println(calc.add(100.01, 90.77));
    }
}
