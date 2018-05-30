public class Ex {
    public static void main(String[] args) {
        Fraction f1;
        Fraction f2;
        Fraction test;

        if (args[0].indexOf("+") >= 0) {
            String[] hmc = args[0].split("[+]");
            String[] spring = hmc[0].split("\\/");
            f1 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            spring = hmc[1].split("\\/");
            f2 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            test = f1.add(f2);
            System.out.println(args[0]+"结果为");
            test.show();
        }
        else if (args[0].indexOf("-") >= 0) {
            String[] hmc = args[0].split("[-]");
            String[] spring = hmc[0].split("\\/");
            f1 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            spring = hmc[1].split("\\/");
            f2 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            test = f1.sub(f2);
            System.out.println(args[0]+"结果为");
            test.show();
        }
        else if (args[0].indexOf("*") >= 0) {
            String[] hmc = args[0].split("[*]");
            String[] spring = hmc[0].split("\\/");
            f1 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            spring = hmc[1].split("\\/");
            f2 = new Fraction(Integer.parseInt(spring[0]), Integer.parseInt(spring[1]));
            test = f1.mul(f2);
            System.out.println(args[0]+"结果为");
            test.show();
        }
        else {
            System.out.println("输入有误");
        }
    }
}
