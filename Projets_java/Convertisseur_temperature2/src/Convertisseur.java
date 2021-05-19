
public class Convertisseur {
// TODO Auto-generated method stub
	public static void main(String[] args)
	{
		boolean state = true;
		System.out.println("CONVERTISSEUR DEGREE CELCIUS - DEGREE FAHRENHEIT");
		System.out.println("------------------------------------------------\n");
		
		while (state) {
				System.out.println("Choisissez le mode de conversion :\n");
			int choix = Terminal.askInt("1. Celcius en Fahrenheit.\n2. Fahrenheit en Celcius.\n3. Quitter.\n");
			switch (choix) {
			case 1 :
				choixUn();
				break;
			case 2 :
				choixDeux();
				break;
			case 3 :
				state = false;
				System.out.println("Au revoir !\n");
				break;
				
			default :
				System.out.println("Choix Invalid. Réessayer.\n");
			}
		}
	}
	/**
	 * Convertit la température de celcius en fahrenheit.
	 * 
	 * @param celcius La température a convertir.
	 * @return	La température en fahrenheit.
	 */
	private static double celciusFahrenheit(double celcius) {
		double fahrenheit = 0;
		fahrenheit = ((celcius * 9) / 5) + 32;
		return fahrenheit;
	}
	/**
	 * convertit la température de fahrenheit en celcius.
	 * 
	 * @param fahrenheit La température a convertir.
	 * @return	la température en celcius.
	 */
	private static double fahrenheitCelcius(double fahrenheit) {
		double celcius = 0;
		celcius = ((fahrenheit - 32) * 5) / 9;
		return celcius;
	}
	
	private static void choixUn() {
		double celcius = Terminal.askDouble("Température à convertir :\n");
		double fahrenheit = celciusFahrenheit(celcius);
		System.out.println(celcius + " °C <=> " + fahrenheit + " °F .\n");
	}
	private static void choixDeux() {
		double fahrenheit = Terminal.askDouble("Température à convertir :\n");
		double celcius = fahrenheitCelcius(fahrenheit);
		System.out.println(fahrenheit + " °F <=> " + celcius + " °C .\n");
	
		

	}

}
