import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num_a = scanner.nextInt();
		int num_b = scanner.nextInt();
		
		while (num_a != 0 || num_b !=0)	{
			System.out.println(num_a + num_b);
			
			num_a = scanner.nextInt();
			num_b = scanner.nextInt();
		}
	}
}