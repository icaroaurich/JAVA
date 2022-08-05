import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Digite um número");
	    int PNumero = myObj.nextInt();
		System.out.println("Antecessor: "+(PNumero - 1));
		System.out.println("Número: "+PNumero);
		System.out.println("Sucessor: "+(PNumero + 1));
	}
}