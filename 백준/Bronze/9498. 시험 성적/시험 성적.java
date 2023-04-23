import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int test_result = scanner.nextInt();
		
		if (test_result>=90)	{
			System.out.println("A");
		}
		else if (test_result>=80)	{
			System.out.println("B");
		}
		else if (test_result>=70)	{
			System.out.println("C");
		}
		else if (test_result >= 60)	{
			System.out.println("D");
		}
		else	{
			System.out.println("F");
		}
		
		
	}
}
