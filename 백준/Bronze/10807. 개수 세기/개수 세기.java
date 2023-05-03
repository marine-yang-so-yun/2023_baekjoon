import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input_number = scanner.nextInt();
		int temp = 0;
		
		int [] input_array = new int[input_number];
		
		for (int i = 0; i < input_number; i++)	{
			input_array[i] = scanner.nextInt();
		}
		
		int num = scanner.nextInt();
		
		for (int i = 0; i < input_number; i++)	{
			if (num == input_array[i])	{
				temp++;
			}
		}
		
		System.out.println(temp);
		
	}
}