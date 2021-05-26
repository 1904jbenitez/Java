import java.util.*;

public class Jeu_papier_pierre_ciseaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random aleas = new Random();
		int nbMachine, nbUser;
		int compteur1, compteur2;
		String rep = "O";

		do
		{	nbMachine = aleas.nextInt(3);
			compteur1 = 0;
			compteur2 = 0;
		do
		{

			System.out.println("Veuillez choisir le chiffre 0 - 1 ou 2 pour jouer ; ou un nombre negatif pour quitter le jeu");
			nbUser = sc.nextInt();
			if (nbUser >= 3)
				System.out.println("Erreur utilisateur");

			else if (nbUser > (nbMachine + 2))
			{
				System.out.println("Vous avez gagn�, votre compteur a �t� increment� d'un point!");
				compteur1++;
			}
			else if (nbUser < (nbMachine - 1))
			{
				System.out.println("Vous avez gagn�, votre compteur a �t� increment� d'un point!");
				compteur1++;
			}
			else if (nbUser > (nbMachine + 1))
			{
				System.out.println("Vous avez perdue, le compteur de l'ordinateur a �t� increment� d'un point!");
				compteur2++;
			}
			else if (nbUser < (nbMachine - 2))
			{
				System.out.println("Vous avez perdue, le compteur de l'ordinateur a �t� increment� d'un point!");
				compteur2++;
			}
			else if (nbUser == nbMachine)
			{
				System.out.println("Score nul, recommencez");
			}
			else
			{
				System.out.println("Vous avez abandonn� la partie. Au revoir.");
			}

		} while (compteur1 < 10 && compteur2 < 10);

		sc.nextLine();

		System.out.println("Voulez vous rejouer O/N ?");
		rep = sc.nextLine().toUpperCase();

		} while (rep.charAt(0) == 'O' && rep.length()<=1);

		System.out.println("Programme termin�... Au revoir.");


		sc.close();
	}

}

