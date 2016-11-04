package exercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class ExecutaData3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,10);
        cal.set(Calendar.MONTH, 9);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 17);
        Date hj = cal.getTime();
        
        //---1 parcela = 30 dias!!!
		List<Date> ListaPagamentos = FuncoesGerais.Parcelas(5, cal);
		
		if (ListaPagamentos.isEmpty())
			System.out.println("Não há parcelas! Pagamento à vista ou parcela indefinida...");
		else {
			System.out.println("As datas de vencimento de suas parcelas, a partir de "+FuncoesGerais.FormataData(hj)+" são:\n\n");
			for (Iterator<Date> i = ListaPagamentos.iterator(); i.hasNext();){
	            Date parcela = (Date) i.next();
	            System.out.println(FuncoesGerais.FormataData(parcela));
			}
		}
        
	}

}
