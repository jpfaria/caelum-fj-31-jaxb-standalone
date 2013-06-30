package br.com.caelum.correios.ws;

import java.math.BigDecimal;
import java.util.List;

public class ConsumidorServicoCorreios {

	public static void main(String[] args) {

		CalcPrecoPrazoWSSoap servico = new CalcPrecoPrazoWS()
				.getCalcPrecoPrazoWSSoap();

		CResultado resultado = servico.calcPrecoPrazo("", "", "40010,41106",
				"24220301", "20040030", "20", 2, new BigDecimal(19),
				new BigDecimal(10), new BigDecimal(15), new BigDecimal(10),
				"S", BigDecimal.ZERO, "S");

		List<CServico> servicosPesquisados = resultado.getServicos()
				.getCServico();

		for (CServico s : servicosPesquisados) {
			
			System.out.println(s.getCodigo());
			System.out.println(s.getValor());
			
		}
		
	}
}
