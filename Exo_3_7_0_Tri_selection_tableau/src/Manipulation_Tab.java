import java.util.*;
public class Manipulation_Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int dim[] = new int[0];

		System.out.println("Veuillez entrer le, nombre d'éléments du tableau");
		dim = sc.nextInt();

		 tabNombre[] = new int[dim];
		for (int i = 0; i < tabNombre.Length; i++)
		{
			System.out.println(" Veuillez entre le nombre numero {0}/{1} dans le tableau", (i + 1), dim);
			tabNombre[i] = int.Parse(Console.ReadLine());
		}

		System.out.println("votre tableau est rempli, voulez le trier?");
		//affichage tableau non trié
		ManipulationTab.AfficheTableau(tabNombre);
		ManipulationTab.TriTableau(ref tabNombre);
		//affichage tableau trié
		ManipulationTab.AfficheTableau(tabNombre);


	}
	class ManipulationTab
	{
		public static void TriTableau(ref int[] _monTab)
		{
			int mini;
			int temp;
			for (int i = 0; i < _monTab.Length - 1; i++)
			{
				mini = _monTab[i];
				for (int j = i + 1; j < _monTab.Length; j++)
				{
					if (_monTab[j] < mini)
					{

						temp = _monTab[i];
						_monTab[i] = _monTab[j];
						_monTab[j] = temp;

					}

				}
			}

			Console.WriteLine("Voici le  tableau trié");



		}
		public static void AfficheTableau(int[] _tab)
		{
			System.out.print("[ ");
			foreach (int element in _tab)
			{
				System.out.print(element + " ");
			}


			System.out.print(" ]");
		}
		private static void foreach(Class<Integer> class1) {
			// TODO Auto-generated method stub

		}
	}






