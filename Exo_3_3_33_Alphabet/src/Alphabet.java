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
				
			} while (!finchaine.equals("."));
			
			 if (Phrase.length() == 1 && finchaine == ".")
			 { 
				 System.out.println("La chaine est vide !!");
			 }
			 else 
			 { 
				 Phrase = Phrase.replace(" ", String.valueOf(0));
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
			 lettre = sc.nextLine().charAt(0);
			 
			 for (int i = 0; i < Phrase.length() - 1; i++) 
			 {
				 if (lettre==Phrase.charAt(i))
				 { 
				 trouve = true;
				 compteur++;
				 }
			 }
			 
			 if (trouve == false) { System.out.println("La lettre n'est pas pr�sente dans la phrase! ");
			 
			 } 
			 else 
			 { 
				 System.out.println("la lettre est pr�sente : "+ compteur+" fois dans la phrase!");
			 }
			 sc.close();
			 }
			 
			 

	}





