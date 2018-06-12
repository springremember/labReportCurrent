public class Test {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 3);

        Fraction hmc = f1.add(f2);
        hmc.show();

        hmc = f1.sub(f2);
        hmc.show();

        hmc = f1.mul(f2);
        hmc.show();

        hmc = f1.div(f2);
        hmc.show();
    }
}
