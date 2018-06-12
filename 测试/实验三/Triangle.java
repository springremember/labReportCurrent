import java.util.*;

public class Triangle {
    //分别对应三个边
    private double a;
    private double b;
    private double c;

    //输入函数并排序a b c逐渐变大
    private void getTheInput(){
        System.out.println("请输入三角形的三个边的长度(以空格区分)。");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        in.close();
        String[] inputList = inputStr.split("\\s+");
        ArrayList<Double> sortList = new ArrayList<Double>();
        for (String temp : inputList) {
            sortList.add(Double.parseDouble(temp));
        }
        Collections.sort(sortList);
        a = sortList.get(0);
        b = sortList.get(1);
        c = sortList.get(2);
    }

    //判断是否三角形
    private boolean isTriangle(){
        if (a+b > c) {
            return true;
        }
        return false;
    }

    //判断角度
    private String juggleByAngle(){
        double juggle = a*a + b*b - c*c;
        if (juggle > 0) {
            return "锐角";
        }
        else if (juggle == 0.0) {
            return "直角";
        }
        else {
            return "钝角";
        }
    }

    //判断边形状
    private String juggleByBorder(){
        if (a == b || b == c) {
            if (a == c) {
                return "等边";
            }
            else {
                return "等腰";
            }
        }
        else {
            return "普通";
        }
    }

    //输出判断
    public void show(){
        getTheInput();
        if (isTriangle()) {
            String out1 = juggleByBorder();
            String out2 = juggleByAngle();
            System.out.println(out1+out2+"三角形");
        }
        else {
            System.out.println("不能组成三角形");
        }
    }
}
