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
				System.out.println("Veuillez saisir une  phrase  termin�e par un point(.)...");
				Phrase = sc.nextLine();
				int depart=Phrase.length()-1; 
				finchaine = Phrase.substring(depart,Phrase.length());
				System.out.println(finchaine);
				
			} while (!finchaine.equals("."));
			
			 if (Phrase.length() == 1 && finchaine == ".")
			 { 
				 System.out.println("La chaine est vide !!");
			 }
			 else 
			 { 
				 Phrase = Phrase.replace(" ", String.Empty);
	                Phrase = Phrase.replace("�", "e");
	                Phrase = Phrase.replace("�", "e");
	                Phrase = Phrase.replace("�", "e");
	                Phrase = Phrase.replace("�", "e");
	                Phrase = Phrase.replace("�", "a");
	                Phrase = Phrase.replace("�", "u");
	                Phrase = Phrase.replace("�", "i");
	                Phrase = Phrase.replace("�", "o");
			 }
			 
			 System.out.println("Veuillez saisir une lettre � rechercher dans la phrase!!");
			 lettre = sc.nextChar.toLowerCase();
			 
			 for (int i = 0; i < Phrase.length() - 1; i++) 
			 {
				 if (lettre.compareTo(Phrase[i]) == 0)
				 { 
				 trouve = true;
				 compteur++;
				 }
			 }
			 
			 if (trouve == false) { System.out.println("La lettre n'est pas pr�sente dansla phrase! ");
			 
			 } 
			 else 
			 { 
				 System.out.println("la lettre est pr�sente : "+ compteur+" fois dans la phrase!");
			 }
			 
			 }
			 
			 

	}


}


