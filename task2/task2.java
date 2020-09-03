import java.util.Scanner;

public class task2{
    public static void main(String []args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите длину стороны и высоты:");
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println("Площадь = " + a * b / 2);
    }
}
