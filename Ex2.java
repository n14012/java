import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;
                

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
                System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}
class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
                int z;
                

		x = 63;
		y = 18;
                z = 9;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
                System.out.println("zの値は" + z + "です。");
                System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}
}
/*
class Ex2_00 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値：");		// xの値の入力を促す
		int x = stdIn.nextInt();
		
		System.out.print("yの値：");		// yの値の入力を促す
		int y = stdIn.nextInt();

		System.out.println("x + x = " + (x + y)); // x + yの値を表示
		System.out.println("x - x = " + (x - y)); // x - yの値を表示
		System.out.println("x * x = " + (x * y)); // x * yの値を表示
		System.out.println("x / x = " + (x / y)); // x / yの値を表示 (商)
		System.out.println("x % x = " + (x % y)); // x % yの値を表示 (剰余)
	}
}

*/
class Ex2_3 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("キーボードから読み込んだ整数値をそのまま反復して表示します。");

		System.out.print("xの値:");
		int x = stdIn.nextInt();
		
		System.out.println(x); // x の値を表示
		System.out.println(x); // x の値を再び表示
                }
}
class Ex2_4 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力します。");

		System.out.print("xの値:");
		int x = stdIn.nextInt();
		
		System.out.println(x + 10);
                System.out.println(x - 10);
        }
}

class Ex2_5 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("2つの実数値を読み込み、その和と平均を求めて表示します。");

		System.out.print("xの値:");
                double x = stdIn.nextDouble();
		System.out.print("yの値:");
                double y = stdIn.nextDouble(); 
		
		System.out.println(x+y);
                System.out.println((x+y)/2);
        }
}
class Ex2_6 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の底辺と高さを実数値で読み込んで、その面積を表示します。");

		System.out.print("底辺の値:");
                double x = stdIn.nextDouble();
		System.out.print("高さの値:");
                double y = stdIn.nextDouble(); 
		
		System.out.println((x*y)/2 );
        }
}
class Ex2_7 extends Ex{
	void execute(){
		Random rand = new Random();

		int luchy = rand.nextInt(9)+1;		// 0～9の乱数
                System.out.println("1桁の正の整数値をランダムに表示" ); 
		System.out.println(luchy);

                int happy = rand.nextInt(9)-9;
                System.out.println("1桁の負の整数値をランダムに表示");
                System.out.println(happy); 

                int rarery  = rand.nextInt(90)+10;
                System.out.println("2桁の正の整数値をランダムに表示");
                System.out.println(rarery); 

	}
}

class Ex2_8 extends Ex{
  void execute(){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("キーボードから読み込んだ整数値プラスマイナス５の範囲の整数値をランダムで表示します。");
      Random rand = new Random();
    System.out.print("xの値");
    int x = stdIn.nextInt();
    int y = rand.nextInt(11)-5;
    int range = (x+y); 
    System.out.println(range); 
  }  
} 
public class Ex2 {
	public static void main(String[] args){
		Ex a;
/*
		a = new Ex2_0();
		a = new Ex2_00();
		a = new Ex2_000();
		a.execute();
*/
                a = new Ex2_1();
                a.execute();
                a = new Ex2_2();
                a.execute();
                a = new Ex2_3();
                a.execute(); 
                a = new Ex2_4();
                a.execute(); 
                a = new Ex2_5();
                a.execute(); 
                a = new Ex2_6();
                a.execute(); 
                a = new Ex2_7();
                a.execute(); 
                a = new Ex2_8();
                a.execute(); 
	}
}
