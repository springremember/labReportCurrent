import java.util.Scanner;

//用星型输出等腰三角形
class TriangleH{
	int border;
	public void show(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入底边长：");
		border = reader.nextInt();
		int showCounter = border;
		int Counter = 0;
		while(showCounter>0){
			for(int i=0;i<Counter;i++){
				System.out.print(" ");
			}
			for(int i=0;i<showCounter;i++){
				System.out.print("*");
			}
			System.out.println("");
			showCounter = showCounter - 2;
			Counter = Counter + 1;
		}
	}
}

//个人信息类
class Personal{
	String ID = "JT2011023";
	String name = "张三";
	String sex = "男";
	int hign = 168;
	double weight = 54.3;

	public  void printTheInformation(){
		System.out.print("学号：");
		System.out.println(ID);
		System.out.print("姓名：");
		System.out.println(name);
		System.out.print("性别：");
		System.out.println(sex);
		System.out.print("身高：");
		System.out.print(hign);
		System.out.println("cm");
		System.out.print("体重：");
		System.out.print(weight);
		System.out.println("kg");

	}
}

//圆锥类计算体积
class Circular{
	double r;
	double h;
	double v;
	public double calculate(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入圆锥的半径：");
		r = reader.nextDouble();
		System.out.println("请输入圆锥的高：");
		h = reader.nextDouble();
		v = 3.14*r*r*(1.0/3)*h;
		return v;
	}
}

//判断三条边是否形成三角形
class Triangle{
	double border1;
	double border2;
	double border3;
	public boolean juggle(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入第一条边的长度：");
		border1 = reader.nextDouble();
		System.out.println("请输入第二条边的长度：");
		border2 = reader.nextDouble();
		System.out.println("请输入第三条边的长度：");
		border3 = reader.nextDouble();
		boolean flag = false;
		if (border1 + border2 > border3){
			if (border1 + border3 > border2){
				if (border2 + border3 > border1){
					flag =true;
				}
			}
		}
		return flag;
	}
}

//显示两个浮点数四则运算结果哦
class Calculate{
	double num1;
	double num2;
	public void show(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		num1 = reader.nextDouble();
		System.out.println("请输入第二个数：");
		num2 = reader.nextDouble();
		System.out.print("加法的结果：");
		System.out.println(num1+num2);
		System.out.print("减法的结果：");
		System.out.println(num1-num2);
		System.out.print("乘法的结果：");
		System.out.println(num1*num2);
		System.out.print("除法的结果：");
		System.out.println(num1/num2);
	}
}

//圆柱体面积和体积计算
class Cylinder{
	double r;
	double h;
	double v;
	double s;

	public void set(){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入底边半径：");
		r = reader.nextDouble();
		System.out.println("请输入高的长度：");
		h = reader.nextDouble();
	}

	public double getV(){
		v = Math.PI*r*r*h;
		return v;
	}

	public double getS(){
		s = Math.PI*r*r*2 + 2*Math.PI*r*h;
		return s;
	}
}

//输出三位数中的水仙花数
class Daffodil{
	static int num;

	public static void set(int aNum){
		num = aNum;
	}

	public static boolean juggle(){
		int a = num / 100;
		int b = (num % 100)/10;
		int c = num % 100 % 10;
		int temp = a*a*a + b*b*b + c*c*c;
		if (temp == num){
			return true;
		}
		else {
			return false;
		}
	}

	public static void show(){
		for (int i=100; i<=999; i++) {
			Daffodil.set(i);
			if (Daffodil.juggle()) {
				System.out.print(i+"\t");
			}
		}
	}
}

//输出数列
class Fibonacci{
	static int first = 1;
	static int second = 1;
	public static void show(){
		System.out.print(Fibonacci.first+"  ");
		System.out.print(Fibonacci.second+"  ");
		int lastLast = Fibonacci.first;
		int last = Fibonacci.second;
		for (int i=0;i<18;i++){
			int now = lastLast + last;
			System.out.print(now+"  ");
			lastLast = last;
			last = now;
		}
	}
}

//输出乘法表
class Multiplication{
	public static void show(){
		int counter = 1;
		for (int i=1;i<=counter;i++){
			for (int j=1;j<=i;j++){
				System.out.print(counter);
				System.out.print("*");
				System.out.print(j);
				System.out.print("=");
				System.out.print(counter*j);
				System.out.print("\t");
			}
			System.out.println("");
			if (counter < 9){
				counter ++;
			}
		}
	}
}
