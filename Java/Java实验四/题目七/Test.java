import java.util.*;
public class Test{
    public static void numberException(int x) throws Exception{
        if (x > 100) {
            throw new NumberTooBigException();
        }
        else if (x < 0) {
            throw new NumberTooSmallException();
        }
        else {
            System.out.println("没有发生异常");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        in.close();
        numberException(x);
    }
}

class NumberTooBigException extends Exception {
    public String getMessage(){
        return "发生数字太大异常";
    }
}

class NumberTooSmallException extends Exception {
    public String getMessage(){
        return "发生数字太小异常";
    }
}
