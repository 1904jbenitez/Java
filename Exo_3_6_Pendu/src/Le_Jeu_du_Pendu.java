import java.util.*;
public class Le_Jeu_du_Pendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String Mot;
		 Scanner sc = new Scanner(System.in);
		 char lettre;
         do
         {
             System.out.println("Joueur 1, veuillez saisir un mot français de 5 lettres minimum");
             Mot = sc.nextLine().toUpperCase();

         } while (String.valueOf(5) != null);

         // char[] MotRecherche = new char[Mot.Length]; declaration tableau classique;

         char[] MotRecherche = Mot.toCharArray();

         
         System.out.println("Joueur 2 voici le mot à rechercher :");
		}
		Jeu_tableau. MasqueLettre(MotRecherche) {
		}
         int Essai = 0;
         boolean gagne = false;
        		 {
        	 


         do
         {


        	 System.out.println("Veuillez choisir une lettre masquée qui compose le mot ou pas!!!");
             Object lettre = sc.nextLine().toUpperCase();
             Object MotRecherche;
			if (Jeu_tableau.Jouer(MotRecherche, lettre, Mot) == false)
             {
                 Essai++;
                 if ((6 - Essai) >= 0)
                 {
                	 System.out.printf("Raté!!Il ne vous reste que : {0} coups à jouer", 6 - Essai);
                 }
             }
             else
             {

                 gagne = true;

                 Jeu_tableau.AfficherTableau(MotRecherche);

                 for (int i = 0; i < MotRecherche.Length; i++)
                 {
                     if (MotRecherche[i] == 95)
                     {
                         gagne = false;

                     }
                 }



             }


         } while (Essai <= 6 && gagne == false);

         if (gagne == true)
         {
        	 System.out.println("Bravo vous avez gagné !! le mot est  bien :" + Mot + " avec un nombre d'erreur de :" + Essai);
             // Jeu_tableau.AfficherTableau(MotRecherche);
         }
         else
         {
        	 System.out.println("vous avez dépasser les 6 ESSAIS, vous êtes \"pendu\" :");

        	 System.out.println("le mot caché était: " + Mot);
         }

         
     }

 }
 class Jeu_tableau
 {
     public static void MasqueLettre(ref char[] _tableau)
     {
         for (int i = 1; i < _tableau.Length - 1; i++)
         {
             _tableau[i] = '_';
         }

         AfficherTableau(_tableau);

     }
     public static void AfficherTableau(Object motRecherche) {
		// TODO Auto-generated method stub
		
	}
	public static void AfficherTableau(char[] _tableauAffiche, String element)

     {
         System.out.print("[ ");
         foreach (char';' element in _tableauAffiche)
         {
        	 System.out.print(element + " ");
         }
         System.out.print(" ] \n");
     }

     private static void foreach(Class<Character> class1) {
		// TODO Auto-generated method stub
		
	}
	private static void element(char[] _tableauAffiche) {
		// TODO Auto-generated method stub
		
	
 }
 }
 }
	public static boolean Jouer(ref.char[] _tableauRecherhe, char _lettre, string _Mot)
     {
         boolean Win = false;

         for (int i = 1; i < _tableauRecherhe.Length - 1; i++)
         {
             if (_Mot[i].CompareTo(_lettre) == 0)
             {

                 _tableauRecherhe[i] = _lettre;
                 Win = true;

             }


         }sc.close();

         return Win;
     }	

 
