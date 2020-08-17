import java.util.Scanner;

public class dentaku1 {
	public static void main(String args[]) {
//		System.out.println("計算式を入力してください");

		Scanner intScanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);

		int[] inputVal = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println((i+1) + "つ目の値を入力してください");
			inputVal[i] = intScanner.nextInt();
		}

		int input1 = inputVal[0];
		int input2 = inputVal[1];

		System.out.println("演算子を入力してください");
		String ope = strScanner.nextLine();

		if(ope.equals("+")) {
			int add = input1 + input2;
			System.out.println(add);
		}else if(ope.equals("-")) {
			int sub = input1 - input2;
			System.out.println(sub);
		}else if(ope.equals("*")) {
			int mult = input1 * input2;
			System.out.println(mult);
		}else if(ope.equals("/")) {
			int divi = input1 / input2;
			System.out.println(divi);
		}

		intScanner.close();
		strScanner.close();

	}
}
