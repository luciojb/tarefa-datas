package exercicios;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class ExecutaData4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a data, no formato \"dd/mm/aaaa\": ");
		String data = ler.next();
		int dia = Integer.parseInt(data.substring(0,2));
	    int mes = Integer.parseInt(data.substring(3, 5));
	    int ano = Integer.parseInt(data.substring(6));
		while (data.charAt(2)!='/' && data.charAt(5)!='/'){
			System.out.print("\n\nData inválida. Digite a data, no formato \"dd/mm/aaaa\": ");
			data = ler.next();
		}
		
		try {
		       
		       Calendar cal = Calendar.getInstance();
		       cal.set(Calendar.DAY_OF_MONTH, dia);
		       cal.set(Calendar.MONTH, mes-1);
		       cal.set(Calendar.YEAR, ano);
		       Date day = cal.getTime();
		       String diaSemana;
		       
		       switch (cal.get(Calendar.DAY_OF_WEEK)){
		    	   case 1:
		    		   diaSemana="Domingo";
		    		   break;
		    	   case 2:
		    		   diaSemana="Segunda-Feira";
		    		   break;
		    	   case 3:
		    		   diaSemana="Terça-Feira";
		    		   break;
		    	   case 4:
		    		   diaSemana="Quarta-Feira";
		    		   break;
		    	   case 5:
		    		   diaSemana="Quinta-Feira";
		    		   break;
		    	   case 6:
		    		   diaSemana="Sexta-Feira";
		    		   break;
		    	   case 7:
		    		   diaSemana="Sábado";
		    		   break;
	    		   default:
	    			   diaSemana="Inválido";
	    			   break;
		       }
		       System.out.println("O dia "+FuncoesGerais.FormataData(day)+" cai em "+diaSemana);
		       
		} catch (NumberFormatException e) {
		  System.out.println("Formato errado!");
		} finally {
		  ler.close();
		}

	}

}
