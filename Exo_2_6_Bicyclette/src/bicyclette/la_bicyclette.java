package bicyclette;

import java.util.Scanner;

public class la_bicyclette {   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rep1;
		String rep2;
		String rep3;
		String rep4;

		System.out.println("Est ce qu'il fera beau demain : 0ui ou Non?");

		Scanner s = new Scanner(System.in);

		rep1 = s.nextLine().toLowerCase();

		if (!rep1.equalsIgnoreCase("non"))
		{
			System.out.println(
					"Est ce que le velo est en bonnes conditions de fonctionnement : 0ui ou Non");
			rep2 = s.nextLine().toLowerCase();

			if (!rep2.equalsIgnoreCase("oui")) {
				System.out.println(
						"Je passe chez le garagiste et lui demande: Est ce qu'il peut remetre en etat mon velo immediatement?. Il me repond  : oui ou non");

				rep3 = s.nextLine().toLowerCase();

				if (!rep3.equalsIgnoreCase("oui")) {
					System.out.println(
							"Comme je veux profiter du beau temps, j'irai � pied jusqu'� l'�tang pour cueillir les joncs.");

				} else

				{
					System.out.println("j'irai faire une balade � bicyclette");
				}

				}
			else {
				System.out.println("j'irai faire une balade � bicyclette");
			}

		}
		else
		{
			System.out.println("Est-ce que j'ai le 1er tome de 'Game of Thrones' � la maison ? : ");
			
			rep4 = s.nextLine().toLowerCase();

			if (!rep4.equalsIgnoreCase("oui")) 
			{System.out.println("J'irai emprunter 'Game of Thrones 1er tome' � la biblioth�que municipale, pour le lire sur mon canap� ");


			}
			else 
			{
				System.out.println("Je resteais sur mon canap� � la maison! ");
			}

			s.close();

		}

	}

}

