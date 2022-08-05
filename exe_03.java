import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Digite um número");
	    int PNumero = myObj.nextInt();
	    System.out.println("Digite outro número");
		int SNumero = myObj.nextInt();
		System.out.println("A soma entre "+PNumero+ " E "+SNumero+" É: "+(PNumero+SNumero));
	}
}