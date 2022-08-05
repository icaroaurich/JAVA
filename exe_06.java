import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Digite um número");
	    /* int PNumero = myObj.nextInt(); */
	    int PNumero = 144;
	    
		System.out.println("Dobro: "+(PNumero * 2));
		System.out.println("Triplo: "+(PNumero * 3));
		System.out.println("Razi: "+(Math.sqrt(PNumero)));
	}
}