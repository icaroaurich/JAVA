import java.util.Scanner;
 public class while_test{
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("antes do laço");
        int jogar = 1;
        while (jogar == 1){
            System.out.println("inicio do laço");
            
            int i; // indice
            int tamanho_do_vetor = 3;
            int C[] = new int[tamanho_do_vetor]; // vetor com limite 50
            int maior = 0; // variável que irá guardar o maior int
    
            for (i=0;i<tamanho_do_vetor;i++){
                System.out.print("Digite um número: ");
                C[i] = input.nextInt();
                }
            for (i=0;i<tamanho_do_vetor;i++){
                if (maior < C[i]){
                    maior = C[i];
                    }
                }
            System.out.println("O maior número do vetor é: "+maior);
            System.out.print("Rodar novamente? (1 / 0) ");
            jogar = input.nextInt();
        }
        System.out.println("fim do laço");
    }
 }
