import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> hmc = new ArrayList<>();
        System.out.println("请输入5个整数：");
        Scanner in = new Scanner(System.in);
        try {
            String temp = in.nextLine();
            hmc.add(Integer.parseInt(temp));
            temp = in.nextLine();
            hmc.add(Integer.parseInt(temp));
            temp = in.nextLine();
            hmc.add(Integer.parseInt(temp));
            temp = in.nextLine();
            hmc.add(Integer.parseInt(temp));
            temp = in.nextLine();
            hmc.add(Integer.parseInt(temp));
        } catch(NumberFormatException e) {
            System.out.println("请输入整数！");
        }
        in.close();
        try {
            int out;
            for (int i = 0; i<5; i++) {
                out = i + 1;
                System.out.println("第"+out+"个数:"+hmc.get(i));
            }
        } catch(ArrayIndexOutOfBoundException e) {
            System.out.println("请输入至少五个整数！");
        }
    }
}
