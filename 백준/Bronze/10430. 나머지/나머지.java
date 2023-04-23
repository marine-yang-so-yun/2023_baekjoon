import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num_1 = scanner.nextInt();
		int num_2 = scanner.nextInt();
		int num_3 = scanner.nextInt();
		
		System.out.println((num_1+num_2)%num_3);
		System.out.println(((num_1%num_3)+(num_2%num_3))%num_3);
		System.out.println((num_1*num_2)%num_3);
		System.out.println(((num_1%num_3)*(num_2%num_3))%num_3);
		
	}
}
