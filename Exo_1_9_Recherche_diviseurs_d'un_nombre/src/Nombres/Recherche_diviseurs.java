package Nombres;

import java.util.*;

public class Recherche_diviseurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration
		int n;
		int k; //tableau
		String Continuer = "O";
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Entrez un nombre entier pour voir tous ces diviseurs");
			n = sc.nextInt();

			//Saisie des valeurs
			for (k = 02; k < n; k++)
			{
				if (n % k == 0)
				{
					System.out.println(k);
				}
			}
			sc.nextLine();
			System.out.println("Souhaitez vous entrer un autre nombre? O/N");
			Continuer =  sc.nextLine().toUpperCase();

			if (Continuer != "O")
			{
				System.out.println("excercise terminé");
			}

		} while (Continuer == "O");
		
		sc.close();

	}

}


