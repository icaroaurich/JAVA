import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Digite seu nome");
	    String userName = myObj.nextLine();
		System.out.println("Olá "+ userName);
	}
}
