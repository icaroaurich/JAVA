// calendário
/*
 * Planejamento
 * 31..JANEIRO
 * C...FEVEREIRO
 * 31..MARÇO
 * 30..ABRIL
 * 31..MAIO
 * 30..JUNHO
 * 31..JULHO
 * 31..AGOSTO
 * 30..SETEMBRO
 * 31..OUTRUBRO
 * 30..NOVEMBRO
 * 31..DESEMBRO 
 * 
 */
import java.util.Scanner;
public class calendario_2{
    public static void main(String agrs[]){
		Scanner input = new Scanner(System.in);
		//System.out.print("Digite o ano: ");
		
		int ano = 2022;//input.nextInt();
		input.close();
		int dia = 1;
		int mes = 1;
		
		while (mes < 2){
		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		    
    		for (dia=1;dia<31;dia++){
    		    if (dia < 10){
    		        String sdia = "0" + String.valueOf(dia);
        		    System.out.print(sdia+"/"+mes+"/"+ano+"  |  ");
              }else{
                  System.out.print(dia+"/"+mes+"/"+ano+"  |  ");
        		    if (dia == 10){
        		        System.out.println("");
            		    }else if (dia == 20){
        		        System.out.println("");
		        }}}
		    System.out.println("");
		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		    mes++;
		    }}
    }