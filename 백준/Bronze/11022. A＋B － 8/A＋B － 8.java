import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input_num = scanner.nextInt();
		
		for (int i = 0; i < input_num; i++)	{
			int num_a = scanner.nextInt();
			int num_b = scanner.nextInt();
			
			System.out.println("Case #"+(i+1)+": "
			+num_a + " + "+num_b+" = "+(num_a + num_b));
		}
	}
}