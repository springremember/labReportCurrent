import java.util.Scanner;


public class Test {
	public static void main(String[] args){
		System.out.println("第一题：");
		TriangleH hmc = new TriangleH();
		hmc.show();
		System.out.print("\n");

		System.out.println("第二题：");
		Personal test = new Personal();
		test.printTheInformation();
		System.out.print("\n");

		System.out.println("第三题：");
		Circular aTest = new Circular();
		System.out.println(aTest.calculate());
		System.out.print("\n");

		System.out.println("第四题：");
		Triangle bTest = new Triangle();
		System.out.println(bTest.juggle());
		System.out.print("\n");

		System.out.println("第五题：");
		Calculate cTest = new Calculate();
		cTest.show();
		System.out.print("\n");

		System.out.println("第六题：");
		Cylinder dTest = new Cylinder();
		dTest.set();
		System.out.println(dTest.getS());
		System.out.println(dTest.getV());
		System.out.print("\n");

		System.out.println("第七题：");
		Daffodil.show();
		System.out.print("\n");

		System.out.println("第八题：");
		Fibonacci.show();
		System.out.print("\n");

		System.out.println("第九题：");
		Multiplication.show();
		System.out.print("\n");
	}
}
