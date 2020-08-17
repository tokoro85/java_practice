import java.util.Scanner;

public class dentaku1 {
	public static void main(String args[]) {
		System.out.println("計算式を入力してください");

		Scanner scanner = new Scanner(System.in);
		String inputval = scanner.nextLine();

		String[] inputList = inputval.split(" ");

		int input1 = Integer.parseInt(inputList[0]);
		int input2 = Integer.parseInt(inputList[2]);
		String ope = inputList[1];

		int sum = input1 + input2;

		System.out.println(input1 + " " + ope + " " + input2 + " = " + sum);

		scanner.close();

	}
}
