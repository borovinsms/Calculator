public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(3, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(a,1);
        calc.println.accept(b);
        int c = calc.multiply.apply(a, b);
        calc.println.accept(c);
        int d = calc.divide.apply(c, b);
        calc.println.accept(d);
        int e = calc.pow.apply(d);
        calc.println.accept(e);
        int f = calc.abs.apply(e);
        calc.println.accept(f);
        boolean g = calc.isPositive.test(f);
        System.out.println(g);
    }
}