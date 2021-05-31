import java.util.*;

public class Alphabet {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
			String finchaine;
			String Phrase;
			char lettre;
			int compteur = 0;
			Boolean trouve = false;
			Scanner sc = new Scanner(System.in);

			do
			{
				System.out.println("Veuillez saisir une  phrase  terminée par un point(.)...");
				Phrase = sc.nextLine();
				int depart=Phrase.length()-1; 
				finchaine = Phrase.substring(depart,Phrase.length());
				
			} while (!finchaine.equals("."));
			
			 if (Phrase.length() == 1 && finchaine == ".")
			 { 
				 System.out.println("La chaine est vide !!");
			 }
			 else 
			 { 
				 Phrase = Phrase.replace(" ", String.valueOf(0));
	                Phrase = Phrase.replace("è", "e");
	                Phrase = Phrase.replace("é", "e");
	                Phrase = Phrase.replace("ê", "e");
	                Phrase = Phrase.replace("ë", "e");
	                Phrase = Phrase.replace("à", "a");
	                Phrase = Phrase.replace("ù", "u");
	                Phrase = Phrase.replace("î", "i");
	                Phrase = Phrase.replace("ô", "o");
			 }
			 
			 System.out.println("Veuillez saisir une lettre à rechercher dans la phrase!!");
			 lettre = sc.nextLine().charAt(0);
			 
			 for (int i = 0; i < Phrase.length() - 1; i++) 
			 {
				 if (lettre==Phrase.charAt(i))
				 { 
				 trouve = true;
				 compteur++;
				 }
			 }
			 
			 if (trouve == false) { System.out.println("La lettre n'est pas présente dans la phrase! ");
			 
			 } 
			 else 
			 { 
				 System.out.println("la lettre est présente : "+ compteur+" fois dans la phrase!");
			 }
			 sc.close();
			 }
			 
			 

	}





