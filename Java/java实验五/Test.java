import java.io.*;
import java.util.*;
public class Test{
	public static void main(String args[]) throws IOException{
        System.out.println("请输入5位学生的成绩：");
        Scanner in = new Scanner(System.in);
        int[] hmc = new int[5];
        for (int i=0; i<5; i++) {
            hmc[i] = in.nextInt();
        }
        in.close();
		FileOutputStream fout = new FileOutputStream("data.txt");
		DataOutputStream dout = new DataOutputStream(fout);
        for (int i=0; i<5; i++) {
            dout.writeInt(hmc[i]);
        }
		dout.close();
	}
}
