import java.util.Scanner;
import java.util.Vector;

public class block4
{
						// 1

	public static void textEditor(int n, int k, String s){
		int lastId = 0;
		Vector<String> words = new Vector<>();
		for(int i = 0; i < n - 1; i++){
			String buffer = s.substring(lastId, s.length());
			lastId += buffer.indexOf(' ') + 1;
			words.addElement(buffer.substring(0, buffer.indexOf(' ')));
		}
		words.addElement(s.substring(lastId, s.length()));

		int currentLine = 0;
		for(String i : words){
			if(currentLine + i.length() > k){
				System.out.println();
				currentLine = 0;
			}
			System.out.print(i + " ");
			currentLine += i.length();
		}
		System.out.println();
	}

						// 2

	public static void split(String s){
		int openedBrackets = 0;
		int left = 0;
		Vector<String> vec = new Vector<>();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(')
				openedBrackets++;
			else if(s.charAt(i) == ')')
				openedBrackets--;
			if(openedBrackets == 0){
				vec.addElement(s.substring(left, i + 1));
				left = i + 1;
			}
		}

		System.out.print("[ ");
		for(String i : vec)
			System.out.print("\"" + i + "\", ");
		System.out.println(" ]");
	}

						// 3

	public static String toCamelCase(String s){
		Vector<String> words = new Vector<>();
		int left = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '_'){
				String buffer = (char)((int)s.charAt(left) - 32) + s.substring(left + 1, i);
				words.addElement(buffer);
				left = i + 1;
			}
		}
		words.addElement((char)((int)s.charAt(left) - 32) + s.substring(left + 1, s.length()));
		for(String i : words){
			System.out.println(i);
		}

		return "";
	}

						// 4

	public static double overTime(double[] a){
		double base = a[1] - a[0];
		if(a[1] > 17){
			base -= a[1] - 17;
			base = base * a[2] + (a[1] - 17) * a[2] * a[3]; 
		}
		else
			base *= a[2];
		return base;
	}

						// 5

	public static String BMI(String a, String b){
		double weight, height;
		if(a.indexOf("pounds") != -1){
			weight = Double.parseDouble(a.substring(0, a.indexOf("pounds")));
			weight *= 0.453592;
		}
		else
			weight = Double.parseDouble(a.substring(0, a.indexOf("kilos")));
		if(b.indexOf("inches") != -1){
			height = Double.parseDouble(b.substring(0, b.indexOf("inches")));
			height *= 0.0254;
		}
		else
			height = Double.parseDouble(b.substring(0, b.indexOf("meters")));

		double bmi = weight / (height * height);
		String text = "";
		if(bmi < 18.5)
			text = " Underweight";
		else if(bmi < 24.9)
			text = " Normal weight";
		else
			text = " Overweight";

		return String.format("%.1f", bmi) + text;
	}

						// 6

	public static int bugger(int a){
		int i = 0;
		for( ; a > 9; i++){
			int b = a;
			a = 1;
			while(b > 1){
				a *= b % 10;
				b /= 10;
			}
		}
		return i;
	}

						// 7

	public static String toStarShorthand(String a){
		a = a.concat("!");
		char lastChar = a.charAt(0);
		int repeats = 0;
		String retVal = "";
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) == lastChar)
				repeats++;
			else
			{
				retVal = retVal.concat(Character.toString(lastChar));
				if(repeats > 1)
					retVal = retVal.concat("*" + Integer.toString(repeats));
				lastChar = a.charAt(i);
				repeats = 1;
			}
		}
		return retVal;
	}

						// 8

	public static boolean doesRhyme(String a, String b){

		String lastA = a.substring(a.lastIndexOf(" ") + 1, a.length() - 1);
		String lastB = b.substring(b.lastIndexOf(" ") + 1, b.length() - 1);
		System.out.println(lastA + ";" + lastB);

		return true;
	}

	public static void main(String[] args){
						// 1
		System.out.println("4.1: ");
		textEditor(10, 7, "hello my name is Bessie and this is my essay");
						// 2
		System.out.print("4.2: ");
		split("()()()");
						// 3
		System.out.println("4.3: ");
		toCamelCase("is_modal_open");
						// 4
		double[] arr1 = {13.25, 15, 30, 1.5};
		System.out.println("4.4: $" + overTime(arr1));
						// 5
		System.out.println("4.5: " + BMI("154 pounds", "2 meters"));
						// 6
		System.out.println("4.6: " + bugger(39));
						// 7
		System.out.println("4.7: " + toStarShorthand("77777geff"));
						// 8
		System.out.println("4.8: " + doesRhyme("Sam I am!", "Green eggs and ham."));

	}
}