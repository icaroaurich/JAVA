import java.util.Scanner;
class d{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome:");
        String nome = input.nextLine();

        System.out.print("Digite sua nota:");
        float nota = input.nextFloat();
        input.close();

        System.out.println(nota);
        System.out.printf("Aluno: " + nome + " ");
        System.out.format("Nota é: %.2f",nota);
    }
}
