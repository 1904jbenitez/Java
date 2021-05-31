import java.util.*;

public class Convertisseur_Km_Mi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BIENVENUE AU CONVERTISSEUR  MILES<-> KILOMETRES");
		System.out.println("------------------------------------------------\n");
		String saisie = " ";
		double distance;
		String rep;
		String [] montab;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("Veuillez saisir une distance à convertir avec l'indice MI pour miles et KM pour kilometres separé par un espace. Indice par default kilometres");
			saisie=sc.nextLine();

			montab = saisie.split(" ");
			distance = Double.parseDouble(montab[0]);

			String unite;
			if(montab.length<2)
			{
				unite="";
			}
			else
			{
				unite=montab[1];
			}

			/*
			 * for (int i = 0; i < montab.length; i++) {
			 * 
			 * System.out.print(montab[i]+ " ");
			 * 
			 * }
			 */

			if (unite.equals("km") || unite=="" )
			{
				double res= distance/1.609344;
				res = Convertisseur_Km_Mi.Nbarrondi2(res,2);
				System.out.println("Cela donne en miles : "+res);
			}
			else 
			{
				double res2= distance*1.609344;
				res2 = Nbarrondi2(res2, 2);
				System.out.println("Cela donne en km : "+res2);
			}
		
			System.out.println("Souhaitez vous entrer une autre distance à convertir? O/N");
			rep = sc.nextLine().toUpperCase();

			
		}while (rep.charAt(0) == 'O' && rep.length()<=1);
			{
				System.out.println("Programme terminé... Au revoir.");
			}sc.close();
			
	}
	

	
	
	public static double Nbarrondi(double _nombre)
	{
		double nbArrondi = Math.round(_nombre*100.0);
		return nbArrondi;
	}
	
	
	
	public static double Nbarrondi2(double _nombre, int chiffrevirgule)
	{
		double temp = _nombre*Math.pow(10, chiffrevirgule);
		double nbArrondi = Math.round(temp)/Math.pow(10, chiffrevirgule);
		return nbArrondi;
	}
	
		
	
}	