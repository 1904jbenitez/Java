package Surface_secteur_circulaire;

import java.util.*;

public class Surfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aire;
		double R;
		double angle;
		String lecture;
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir la longueur du rayon(en metres) et l'angle du secteur circulaire(en degr�s), separ�s par un espace.");
		lecture = sc.nextLine();
		
		int position = lecture.indexOf(" ");
		String souschaine1 = lecture.substring(0, position);
		int fin = lecture.length(); 	
		String souschaine2 = lecture.substring(position,fin);
		
		double val = Integer.parseInt(souschaine1);
		double val2 = Integer.parseInt(souschaine2);
		
		R= val;
		angle= val2;
		
		aire = (Math.PI*Math.pow(R,2)*angle)/360;
		
		System.out.println("L'aire du secteur circulaire concern� est: " + aire + " m2 ");
		
		sc.close();

	}

}
