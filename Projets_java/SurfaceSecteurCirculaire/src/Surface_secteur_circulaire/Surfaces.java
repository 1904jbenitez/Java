package Surface_secteur_circulaire;

import java.util.Scanner;

public class Surfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aire;
		double R;
		double angle;
		String lecture;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez noter la valeur(en metres) du rayon et (en degrés) de l'angle du secteur circulaire concerné, separés par un espace?");
		
		lecture = sc.next();
		int position=  lecture.indexOf(" ");
		String souschaine= lecture.substring(0, position);
		int fin =lecture.length(); 	
		String souschaine2= lecture.substring(position,fin);
		
		double val = Integer.parseInt(souschaine);
		double val2 = Integer.parseInt(souschaine2);
		
		R= val;
		angle= val2;
		
		aire = (Math.PI*Math.pow(R,2)*angle)/360;
		
		System.out.println("L'aire du secteur circulaire concerné est: " + aire + " m2 ");

	}

}
