import java.util.Scanner;
public class TestScanner {

	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		long entierLu = scan.nextLong();
		double doubleLu = scan.nextDouble();
		String test = scan.nextLine();
		
		System.out.println("j'ai lu :" + entierLu + " et " + doubleLu +" et " + test + " !");
        scan.close();
	}

}
