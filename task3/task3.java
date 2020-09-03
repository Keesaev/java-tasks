import java.util.Scanner;

public class task3{
    public static void main(String []args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите число животных каждого из 3 типов:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int result = a * 2 + b * 4 + c * 4;

		System.out.println("Число ног = " + result);
    }
}
