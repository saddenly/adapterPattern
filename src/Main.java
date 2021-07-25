public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5, 10));
        System.out.println(calc.mult(10, 50));
        System.out.println(calc.pow(6, 3));
    }
}