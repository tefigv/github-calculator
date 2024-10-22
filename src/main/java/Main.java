public class Main {
    public static void main(String args []){
        //comment
        System.out.println("Docker test");
        Calculator calc = new Calculator();

        int add = calc.add(1,3);
        int subtract = calc.subtract(5,2);
        int multiply = calc.multiply(3,5);
        int fibonacci = calc.fibonacciNumberFinder(10);
        String binary = calc.intToBinaryNumber(40);
        System.out.println("add 1,3: " + add + "\n");
        System.out.println("subtract 5,2: " + subtract + "\n");
        System.out.println("multiply 3,5: " + multiply + "\n");
        System.out.println("fibonacciNumberFinder 10: " + fibonacci + "\n");
        System.out.println("intToBinaryNumber 40: " + binary + "\n");
    }
}
