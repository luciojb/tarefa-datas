package exercicios;

import java.util.Calendar;
import java.util.Date;

public class ExecutaData {

	public static void main(String[] args) {
		int qSab=0, qDom=0;
		
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 17);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.DAY_OF_MONTH,3);
        cal2.set(Calendar.MONTH, 10);
        cal2.set(Calendar.YEAR, 2016);
        cal2.set(Calendar.HOUR_OF_DAY, 1);
        
        Date in = cal.getTime();
        Date fim = cal2.getTime();
        
        for(int i=0; i<=FuncoesGerais.totalDias(in, fim);i++){
        	if (FuncoesGerais.verificaData(cal)==2)
        		qSab++;
        	else if (FuncoesGerais.verificaData(cal)==1)
        		qDom++;
        	cal.add(Calendar.DATE, 1);
        }
        
        System.out.println("A quantidade de sábados entre "+FuncoesGerais.FormataData(in)+" e "+FuncoesGerais.FormataData(fim)+" é: "+qSab+".\nA de domingos é : "+qDom+".");

	}

}
