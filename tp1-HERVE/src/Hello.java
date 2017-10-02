import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner User = new Scanner(System.in);
		String user = User.nextLine();
		System.out.println(" Hello "+ user);
        User.close();
	}

}
