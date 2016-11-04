package exercicios;

import java.util.Calendar;
import java.util.Date;

public class ExecutaData2 {
	public static void main (String[] args){
		int diasUteis=0;
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 17);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.DAY_OF_MONTH,30);
        cal2.set(Calendar.MONTH, 10);
        cal2.set(Calendar.YEAR, 2016);
        cal2.set(Calendar.HOUR_OF_DAY, 1);
        
        Date in = cal.getTime();
        Date fim = cal2.getTime();
        
        /*
         * Só não consegui fazer a tempo a questão de validação.
         * Se, por acaso, for passado 31 para novembro, ele vai para 1 de dezembro, mas não quero isso.
         * Então teria de haver alguma forma de validação, por parte de entrada.
         * Não acredito haver necessidade aqui neste momento.
         */
        
        for(int i=0; i<=FuncoesGerais.totalDias(in, fim);i++){
        	if (FuncoesGerais.verificaData(cal)!=1 && FuncoesGerais.verificaData(cal)!=2 && FuncoesGerais.verificaData(cal)!=3)
        		diasUteis++;
        	
        	cal.add(Calendar.DATE, 1);
        }
        
        System.out.println("A quantidade de dias úteis entre "+FuncoesGerais.FormataData(in)+" e "+FuncoesGerais.FormataData(fim)+" é: "+diasUteis+".");

	}
}
