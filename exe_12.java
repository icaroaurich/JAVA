import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
	    // Declarar variaveis
	    System.out.println("Digite um número");
	    float PNumero = myObj.nextFloat();
	    
	    
	    // início do calculo
		System.out.println("O novo preço com 10% de desconto será: "+(PNumero * 0.90));

	}
}