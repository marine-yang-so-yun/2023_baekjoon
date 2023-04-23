import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num_a = scanner.nextInt();
		int num_b = scanner.nextInt();
		
		if (num_a > num_b)	{
			System.out.println(">");
		}
		else if (num_a < num_b)	{
			System.out.println("<");
		}
		else	{
			System.out.println("==");
		}
		
		
	}
}