import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input_num = scanner.nextInt();
		int num = scanner.nextInt();
		int [] num_array = new int[input_num];
		
		for (int i = 0; i < input_num; i++)	{
			num_array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < input_num; i++)	{
			if (num_array[i] < num)	{
				System.out.print(num_array[i] + " ");
			}
		}
	}
}
