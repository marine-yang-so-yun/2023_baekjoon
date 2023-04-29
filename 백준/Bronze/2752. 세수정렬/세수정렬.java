import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] input = new int[3];
		
		for (int i = 0; i < 3; i++)	{
			input[i] = scanner.nextInt();
		}
		
		int max = input[0];
		
		for (int i = 0; i < 3; i++)	{
			if (max < input[i])	{
				max = input[i];
			}
		}
		
		int min = input[0];
		for (int i = 0; i < 3; i++)	{
			if (min >= input[i])	{
				min = input[i];
			}
		}
		
		int mid = input[0];
		for (int i = 0; i < 3; i++)	{
			if (max>input[i] && min<input[i])	{
				mid = input[i];
			}
		}
		
		System.out.print(min + " ");
		System.out.print(mid + " ");
		System.out.println(max);
	}
}