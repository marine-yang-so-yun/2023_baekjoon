import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		
		for (int i = 0; i < input/4; i++)	{
			System.out.print("long ");
		}
		if (input % 4 != 0)	{
			System.out.print("long ");
		}
		
		System.out.print("int");
		
	}
}
