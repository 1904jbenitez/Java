import java.util.Random;
import java.util.Scanner;

public class fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, max, nbUser, nbMachine;
		int compteur = 0;
		Scanner sc = new Scanner(System.in);
		Random aleas = new Random();
		String rep = "O";

		do {
			nbMachine = aleas.nextInt(101);
			compteur = 0;
			min = 0;
			max = 100;
			
			do
			{
				System.out.println("Bonjour et bienvenue au jeu de la fourchette. Pour commencer entrer un nombre entre " + min + " et " + max);
				nbUser = sc.nextInt();
				if (nbUser > nbMachine)
				{
					System.out.println("le nombre est  trop grand!");
					max = nbUser;
					compteur++;
				}
				else if (nbUser < nbMachine)
				{
					System.out.println("le nombre est trop petit!");
					min = nbUser;
					compteur++;
				}
				else {
					compteur++;
				}

			} while (nbMachine != nbUser);
			System.out.println(" Bravo vous avez trouvez le  nombre machine : " + nbUser + " en " + compteur + " coups");

			sc.nextLine();

			System.out.println("Voulez vous rejouer une partie O/N ?");

			rep = sc.nextLine().toUpperCase();


		} while (rep.charAt(0) == 'O' && rep.length()<=1);

		System.out.println("Programme termin�... Au revoir.");

		sc.close();
	}
	}


