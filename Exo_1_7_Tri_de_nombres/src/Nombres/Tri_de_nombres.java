package Nombres;

import java.util.*;

public class Tri_de_nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration 
		int note1;
		int note2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un nombre");
		note1 = sc.nextInt();

		System.out.println("Entrez un second nombre");
		note2 = sc.nextInt();

		if (note1 != 0 && note2 != 0);
		
		else
		{
			if (note1 >= note2)
			{
				System.out.println(note2 + note1);
			}
			else
			{
				System.out.println(note1 + note2);
			}
			
		}
		sc.close();
	}


}


