package tulipe;

import java.util.Scanner;

public class hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Reponse;
		
		System.out.println("Est ce qu'il fera beau demain ?");
		
		Scanner sc = new Scanner(System.in);
		
		Reponse = sc.nextLine().toLowerCase();
		
		System.out.println(Reponse);
		if (Reponse.equals("oui")) {
			System.out.println("J'arracherais les mauvaises herbes! ");
			System.out.println("Je planterais des tulipes");
			
		} else 
		{
			System.out.println("Je resteais sur mon canapé à la maison! ");
			
		}
		sc.close();

	}

}
