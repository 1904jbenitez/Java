import java.text.*;
import java.util.*;

public class Convertisseur_Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CONVERTISSEUR DEGR? CELCIUS ET DEGR? FAHRENHEIT");
		System.out.println("----------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		String test = "";
		Boolean b = true;
		String rep = "O";

		do {

			System.out.println("veillez entrer une temperature a convertir avec l'unite de mesure correspondante C/F");
			test = sc.nextLine().toUpperCase();
			String unit = test.substring( test.length()-1);

			int longueur = test.length()-1;


			DecimalFormat modele = new DecimalFormat("0.00");
			if (unit.equals("C") == true) {
				String nb = test.substring(0,longueur);
				double temp = Double.parseDouble(nb);

				double s = (temp * 9) / 5 + 32;

				String result = modele.format(s);
				System.out.println("Temperature equivalente en fahrenheit : " + result);
			}

			if (unit.equals("F") == true) {
				String nb1 = test.substring(0,longueur);
				double temp1 = Double.parseDouble(nb1);

				double m = (temp1 - 32)* 5/9;

				String result = modele.format(m);
				System.out.println("Temperature equivalente en celsius : " + result);
			}
		
		System.out.println("Voulez vous convertir une autre temperature ? O/N");

		rep = sc.nextLine().toUpperCase();


		} while (rep.charAt(0) == 'O' && rep.length()<=1);

		System.out.println("Programme termin?... Au revoir.");

		sc.close();

		
	}	
		
	
}


	





