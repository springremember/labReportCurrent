package main;
import java.util.*;
class Test {
    public static void main(String[] args) {
        System.out.println("请输入三个数：");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        in.close();
        src.QuadraticEquation hmc = new src.QuadraticEquation(a,b,c);
        double dis = hmc.getDiscriminant();
        System.out.println("判别式结果:"+dis);
        if (dis<0) {
            System.out.println("The equation has no roots");
        }
        else if (dis==0) {
            System.out.println("单根为:"+hmc.getRoot1());
        }
        else {
            System.out.println("两个根为"+hmc.getRoot1()+"和"+hmc.getRoot2());
        }
    }
}
