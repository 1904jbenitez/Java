package bisextile;

import java.util.*;

public class annee_bisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean continuer = true;

		do {

			Boolean b = false;

			Scanner sc = new Scanner(System.in);

			System.out.print("Entrez une ann�e pour savoir si elle est bisextile ou non : ");

			int A = sc.nextInt();

			if(A % 400 == 0)
			{
				b = true;
			}
			else if (A % 100 == 0)
			{
				b = false;
			}
			else if(A % 4 == 0)
			{
				b = true;
			}
			else
			{
				b = false;
			}
			if(b == true)
			{
				System.out.println("L'ann�e "+ A +" est une ann�e bissextile");
			}
			else
			{
				System.out.println("L'ann�e "+ A +" n'est pas une ann�e bissextile");
			}

			String rep = sc.nextLine();
			if (rep.equalsIgnoreCase("O"));
			{
				continuer = false;
				System.out.println("Programme termin�");
			}
			sc.close();	
			
			While(continuer == true);{

			}

		}while(continuer == true);

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub

	}

}


/*public boolean isLeapYear(int year) {

			    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			        return true;
			    } else {
			        return false;*/
