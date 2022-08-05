import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
	    // Declarar variaveis
	    System.out.println("Digite a primeira nota");
	    float PNumero = myObj.nextFloat();
	    System.out.println("Digite a segunda nota");
	    float SNumero = myObj.nextFloat();
	    
	    // início do calculo
		System.out.println("Media: "+((PNumero + SNumero) / 2));
	}
}