import java.util.*;
public class Juggle {
    public static int show() {
        System.out.println("请输入一个浮点数：");
        String hmc;
        Scanner in = new Scanner(System.in);
        hmc = in.nextLine();
        in.close();
        double spring;
        try {
            spring = Double.parseDouble(hmc);
        } catch(Exception e) {
            System.out.println("请输入正确的浮点数");
            return 0;
        }
        String[] temp = hmc.split("\\.");
        int ll = hmc.length() - 1;
        System.out.println("浮点数有"+ll+"位");
        System.out.println("整数部分是"+temp[0]);
        System.out.println("小数部分是"+temp[1]);
        System.out.println("整数部分位数:"+temp[0].length());
        System.out.println("小数部分位数:"+temp[1].length());
        return 1;
    }

    public static void main(String[] args) {
        show();
    }
}
