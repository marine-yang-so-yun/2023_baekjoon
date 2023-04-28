import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total_pay = scanner.nextInt();
		int number_item = scanner.nextInt();
		int [] temp = new int[number_item*2];
		
		for (int i = 0; i < number_item*2; i++)	{
			temp[i] = scanner.nextInt();
		}
		
		int sum_temp = 0;
		
		for (int i = 0; i < number_item*2-1; i = i+2)	{
			sum_temp = sum_temp + temp[i]*temp[i+1];
		}
		
		if (sum_temp == total_pay)	{
			System.out.println("Yes");
		}
		else	{
			System.out.println("No");
		}
		
	}
}