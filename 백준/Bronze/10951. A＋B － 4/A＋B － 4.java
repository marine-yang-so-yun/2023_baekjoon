import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt())	{
			int num_a = scanner.nextInt();
			int num_b = scanner.nextInt();
			
			System.out.println(num_a + num_b);
		}
		
		scanner.close();
	}
}