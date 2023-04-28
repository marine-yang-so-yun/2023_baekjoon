import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num_calc = scanner.nextInt();
		
		int [] result = new int[num_calc];
		
		for (int i = 0; i < num_calc; i++)	{
			int num_a = scanner.nextInt();
			int num_b = scanner.nextInt();
			result[i] = num_a + num_b;
			
		}
		for (int i = 0; i < num_calc; i++)	{
			System.out.println(result[i]);
		}
	}
}