import java.util.Scanner;

public class polynome {

	public static void main(String[] args) {
       
		double x1;
		double x2;
		double discr;
		
	    Scanner Poly = new Scanner(System.in);
	    System.out.println("Valeur de a ?");
	    long a = Poly.nextLong();
	    System.out.println("Valeur de b ?");
	    long b = Poly.nextLong();
	    System.out.println("Valeur de c ?");
	    long c = Poly.nextLong();
	    discr= (b*b)-4*a*c;
	    if (discr>0) {
	    	x1= (-b+Math.sqrt(discr))/(2*a);
	        x2= (-b-Math.sqrt(discr))/(2*a);
	    	System.out.println("les racines sont: "+ x1 + " et " + x2);
	    }
	    else if (discr==0) {
	    	x1= (-b)/2*a;
	    	System.out.println("la racine est: "+ x1 );
	    }
	    else {
	    	System.out.println("pas de racine dans R");
	    }
	    Poly.close();
	}

}
