import java.util.Scanner;

public class block1{
	public static int remainder(int a, int b){
		return a % b;
	} 

	public static int triArea(int a, int b){
		return a * b / 2;
	}

	public static int animals(int a, int b, int c){
		return a * 2 + b * 4 + c * 4;
	}

	public static boolean profitableGamble(double prob, double prize, double pay){
		if((prob * prize - pay) > 0)
			return true;
		else
			return false;
	}

	public static int ctoa(char a){
		return (int)a;
	}

	public static int addUpTo(int a){
		int result = 0;
		for(int i = 0; i <= a; i++)
			result += i;
		return result;
	}

	public static int nextEdge(int a, int b){
		return a + b - 1;
	}

	public static int sumOfCubes(int a[]){
		int result = 0;

		for(int i : a)
			result += i * i * i;
		return result;
	}

	public static boolean abcmath(int a, int b, int c){
		for(int i = 0; i < b; i++){
			a *= 2;
		}
		System.out.println(a);
		if(a % c == 0)
			return true;
		else
			return false;
	}

    public static void main(String []args) {
		Scanner in = new Scanner(System.in);

		/*		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		*/
		
    }
}
