import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		double VolumeTot;
		Scanner Vol = new Scanner(System.in);
		 System.out.println("Quelle longueur?");
		 double Longueur = Vol.nextDouble();
		 System.out.println("Quelle largeur");
		 double Largeur = Vol.nextDouble();
		 System.out.println("Quelle hauteur?");
		 double Hauteur = Vol.nextDouble();
         VolumeTot= Longueur*Largeur*Hauteur;
       System.out.println("Le volume du solide est: "+ VolumeTot);
       Vol.close();
	}

}
