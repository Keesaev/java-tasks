import java.util.Scanner;

public class task1{
    public static void main(String []args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Type 2 numbers");
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println(a + " % " + b + " = " + a % b);
    }
}
