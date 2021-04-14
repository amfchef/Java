import java.util.Scanner;

public class övning_7_13_verson2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		System.out.println("Please enter numbers: ");
		while(scan.hasNextDouble()) {
			sum += scan.nextDouble();
		}
		String reset = scan.next();
		System.out.println("Wrong number \nplease try one last time: ");
		
		while(scan.hasNextDouble()) {
			sum += scan.nextDouble();
		}
		scan.close();
		System.out.println("Sum " + sum);
	}

}
