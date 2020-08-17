import java.util.Scanner;

public class dentaku1 {
	public static void main(String args[]) {
		System.out.println("計算式を入力してください");

		Scanner scanner = new Scanner(System.in);

		String[] inputVal = new String[3];

		for (int i = 0; i < 3; i++) {
			inputVal[i] = scanner.nextLine();
		}

		int input1 = Integer.parseInt(inputVal[0]);
		int input2 = Integer.parseInt(inputVal[2]);
		String ope = inputVal[1];

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

		scanner.close();

	}
}
