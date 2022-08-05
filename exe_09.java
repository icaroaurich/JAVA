import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
	    // Declarar variaveis
	    System.out.println("Digite um número");
	    int PNumero = myObj.nextInt();
	    
	    
	    // início do calculo
		System.out.println(PNumero+" X 1 = "+(PNumero * 1));
		System.out.println(PNumero+" X 2 = "+(PNumero * 2));
		System.out.println(PNumero+" X 3 = "+(PNumero * 3));
		System.out.println(PNumero+" X 4 = "+(PNumero * 4));
		System.out.println(PNumero+" X 5 = "+(PNumero * 5));
		System.out.println(PNumero+" X 6 = "+(PNumero * 6));
		System.out.println(PNumero+" X 7 = "+(PNumero * 7));
		System.out.println(PNumero+" X 8 = "+(PNumero * 8));
		System.out.println(PNumero+" X 9 = "+(PNumero * 9));
		System.out.println(PNumero+" X 10 = "+(PNumero * 10));
	}
}