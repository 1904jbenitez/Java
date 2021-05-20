
import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aire;
		double volume;
		double R;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenue dans le calculateur de volume et d'aire. Quel est la valeur, en kilometres, du rayon de la sphere dont vous voulez connaitre son aire et volume ?");

		R = sc.nextDouble();
		aire = (4*Math.PI)*Math.pow(R,2);
		volume = (4*Math.PI*Math.pow(R,3))/3;
		System.out.println("L'aire de la sphere est: " + aire + " Km2 \n et son volume: " + volume +" km3 ");
		
		
		
		
		//Methode pour casser un chaine en fonction des espaces vides
		
		String test="premier chiffre";

		int position=  test.indexOf(" ");
		//String souschaine= test.substring(0, position);
		int fin =test.length(); 	
		String souschaine2= test.substring(position+1,fin);
 
 
		System.out.println(souschaine2);

		


	}

}
