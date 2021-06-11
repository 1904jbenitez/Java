import java.util.Scanner;

public class Tri_Class_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String finchaine;
        String Phrase;
        String Palindrome;
        Scanner sc = new Scanner(System.in);
        char i;
        
        
        do
        {

            System.out.println("Veuillez saisir une  phrase  terminée par un point(.)...");
            Phrase = sc.nextLine().toLowerCase();

            finchaine = Phrase.substring(Phrase.length() - 1);
           
            
        } while (!finchaine.equals("."));
        
        		
        if (Phrase.length() == 1 && finchaine.equals("."))
        {
        	System.out.println("La chaine est vide !!");
        }
        else
        {

            Palindrome = Phrase.substring(0, Phrase.length() - 1);
            Palindrome = Palindrome.replace(" ", String.valueOf(0));

            char[] endroit = Palindrome.toCharArray();
            char[] envers = new char[Palindrome.length()];
            //remplissage du tableau envers
            for ( i = 0; i < endroit.length; i++)
            {
                envers[i] = endroit[(endroit.length - 1) - i];

            }

            //recherche de palindrome
            boolean verif = true;

            for ( i = 0; i < Palindrome.length(); i++)
            {
                if (endroit[i] != envers[i])
                {
                    verif = false;
                    System.out.print(endroit[i +' ']);
                    System.out.print(envers[i +' ']);
                    break;
                }

            }
            if (verif == true)
            {
            	System.out.println("la phrase est un palindrome");
            	
            }
            else
            {
            	System.out.println("la phrase n'est pas un palindrome");
            }
            
           

            
            

        }sc.close();

    }

	/*
	 * @SuppressWarnings("null") static void AfficherTab(char[] _tab) { String
	 * endroit = null; char [] element = endroit.toCharArray();
	 * 
	 * 
	 * System.out.print("[ ");
	 * 
	 * for (int i = 0; i < element.length; i ++)
	 * 
	 * { System.out.print( element ); } System.out.print(" ] \n"); }
	 */



	}


