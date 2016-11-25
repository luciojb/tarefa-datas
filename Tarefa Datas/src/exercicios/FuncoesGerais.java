package exercicios;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class FuncoesGerais {
	
	public static int verificaData(Calendar data){
		int tipoDia=0;
       if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            tipoDia=1;
        else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            tipoDia=2;
        else if (verificaFeriado(data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH))==true)
        	tipoDia=3;
        	
		return tipoDia;
    }
	
	public static int totalDias(Date inicio, Date fim){
        long secIn = inicio.getTime();
        long secFi = fim.getTime();
        long dif = (secFi-secIn)/1000;
        if (dif % 86400 >0)
          	return (int)((dif/86400)+1);
        else
        	return (int)(dif/86400);
    }
	
	public static boolean verificaFeriado(int dia, int mes ){
        int[][] diasFeriado = new int[2][13];
        boolean feriado=false;
        int i=0;
        diasFeriado[0][0] = 1;
        diasFeriado[1][0] = 8;
        diasFeriado[0][1] = 1;
        diasFeriado[1][1] = 9;
        diasFeriado[0][2] = 1;
        diasFeriado[1][2] = 10;
        diasFeriado[0][3] = 2;
        diasFeriado[1][3] = 25;
        diasFeriado[0][4] = 3;
        diasFeriado[1][4] = 21;
        diasFeriado[0][5] = 4;
        diasFeriado[1][5] = 1;
        diasFeriado[0][6] = 4;
        diasFeriado[1][6] = 26;
        diasFeriado[0][7] = 8;
        diasFeriado[1][7] = 7;
        diasFeriado[0][8] = 9;
        diasFeriado[1][8] = 12;
        diasFeriado[0][9] = 9;
        diasFeriado[1][9] = 28;
        diasFeriado[0][10] = 10;
        diasFeriado[1][10] = 2;
        diasFeriado[0][11] = 10;
        diasFeriado[1][11] = 15;
        diasFeriado[0][12] = 11;
        diasFeriado[1][12] = 25;
        		
        while(i<13 && feriado==false){
    		if (diasFeriado[0][i] == mes && diasFeriado[1][i]==dia)
    			feriado=true;	
    		i++;
        }
        
        return feriado;
        
    }
	
	
	public static List<Date> Parcelas(int parcelas, Calendar data){
		List<Date> listaParcelas = new ArrayList<>();
		if (parcelas>0){
			for (int i=0; i<parcelas; i++){
				data.add(Calendar.DATE, 30);
				int cont =0;
				while(verificaData(data)==1 || verificaData(data)==2 || verificaData(data)==3)
					data.add(Calendar.DATE, 1);
					cont++;
				
				Date dataParcela = data.getTime();
				listaParcelas.add(dataParcela);
				data.add(Calendar.DATE, -cont);
			}
		}
		return listaParcelas;
	}
	
	public static String FormataData(Date data) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String s = df.format(data);
        return s;
    }
	

}
