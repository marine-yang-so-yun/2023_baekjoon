import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] num_array = new int [9];
		
		for (int i = 0; i < 9; i++)	{
			num_array[i] = scanner.nextInt();
		}
		
		int max = num_array[0];
		int temp = 0;
		
		for (int i = 0; i < 9; i++)	{
			if (max <= num_array[i])	{
				max = num_array[i];
				temp = i;
			}
		}
		System.out.println(max);
		System.out.println(temp+1);
	}
}