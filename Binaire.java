import tc.TC;

public class Binaire {

  /**
   * Calcule le bit 0 de l'entier argument.
   * 
   * @param n
   *          l'entier
   * @return 0 ou 1 pour le bit correspondant
   */
  public static int b0(int n) {
	  for i in range ( )
    return 0; // MODIFIER pour la valeur de retour correcte
  }

  public static int b1(int n) {
    return 0; // MODIFIER pour la valeur de retour correcte
  }

  public static int b2(int n) {
    return 0; // MODIFIER pour la valeur de retour correcte
  }

  public static int b3(int n) {
    return 0; // MODIFIER pour la valeur de retour correcte
  }

  public static void main(String[] args) {
    for (int n = 0; n < 16; ++n)
      TC.println("" + b3(n) + b2(n) + b1(n) + b0(n) + " = " + n);
  }
}
