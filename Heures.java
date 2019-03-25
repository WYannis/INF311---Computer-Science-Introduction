import tc.TC;

public class Heures {
  /**
   * Renvoie une chaine de la forme "H : M : S", pour un affichage digital.
   * 
   * A COMPLETER. Vous devez expliciter le calcul des valeurs des heures,
   * minutes et secondes.
   * 
   * @param secondes
   *          nombre total de secondes indiquant l'heure que l'on doit convertir
   * @return la chaine Java correspondante (type String)
   */
  public static String chaineDe(int secondes) {
    int heures = secondes/3600;
    int minutes = (secondes%3600)/60;
    secondes = (secondes%3600)%60;
    return heures + " : " + minutes + " : " + secondes; // ceci utilise la surcharge de +
  }
public static int lireEntier(String invite) {
		TC.print(invite);
		int a = TC.lireInt();
		return a;
	}
public static int lireHMS(String invite) {
	TC.print(invite);
	int a = TC.lireInt(); int b = TC.lireInt() ;int c = TC.lireInt() ;
	int d = a*3600 + b*60 + c ;
	return d;
}

  public static void main(String[] args) {
    // test exercice 2
    TC.println(chaineDe(0));
    TC.println(chaineDe(1));
    TC.println(chaineDe(59));
    TC.println(chaineDe(60));
    TC.println(chaineDe(119));
    TC.println(chaineDe(120));
    TC.println(chaineDe(3599));
    TC.println(chaineDe(3600));
    TC.println(chaineDe(3601));
    TC.println(chaineDe(4000));
    TC.println(chaineDe(24 * 3600 - 1));
    int secondes_1 = lireHMS("entrer heures minutes secondes : ");
    int secondes_2 = lireHMS("entrer heures minutes secondes : ");
    TC.print("total = ");
    TC.println(chaineDe(secondes_1+secondes_2));

int[] t = new int[] { 1, 2, 3, 4 };
t[1] = 6;
int[] u = t;
u[0] = 5;
System.out.println(t[0]+" "+u[1]);
  }
	
}
