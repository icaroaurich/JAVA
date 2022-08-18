import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class calendario_7{
    public static void main(String agrs[]){
		Scanner input = new Scanner(System.in);
		
		// DECLARAR VARIAVEIS
		int ano = 2022;//input.nextInt();
		input.close();
		int dia = 1;
		int mes = 1;
		int limite = 1;
		List lista_de_eventos = new ArrayList();

		// printar_calendario(dia,mes,ano,limite);
		lista_de_eventos.add( "teste" );
        }
	    
	public static void printar_calendario(int dia,int mes,int ano,int limite){
	    while (mes < 13){
		    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){limite = 31;}
		    else if (mes == 2){limite = definir_bisexto(ano);}
		    else{limite = 30;}
		    
		    for (int i=0;i<140;i++){System.out.print("-");}
		    System.out.println("");
		    
    		for (dia=1;dia<limite+1;dia++){
        	    System.out.printf((String.format("%02d", dia))+"/"+(String.format("%02d", mes))+"/"+ano+" | ");
        		if (dia == 10){System.out.println("");}
            	else if (dia == 20){System.out.println("");}
		        }
		        
		    System.out.println("");
		    for (int i=0;i<140;i++){System.out.print("-");}
		    mes++;
		    }
	    }
		    
    public static int definir_bisexto(int ano){
	    if (ano % 4 == 0){return 29;}
	    else{return 28;}
	    }

	public static void agendar(String args[]){
	    Scanner input = new Scanner(System.in);
	    agenda obj_date = new agenda();	
	    obj_date.dia = 12; //input.nextInt();
	    obj_date.mes = 12; //input.nextInt();
	    obj_date.ano = 2022; //input.nextInt();

		System.out.println(obj_date);
		System.out.println(obj_date.dia);
		System.out.println(obj_date.mes);
		System.out.println(obj_date.ano);
	    
	    }
    }
