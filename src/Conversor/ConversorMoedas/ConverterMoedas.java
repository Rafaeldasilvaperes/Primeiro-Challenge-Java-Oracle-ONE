package Conversor.ConversorMoedas;

import Conversor.ConversorAbstract;
import buscaCotacoesAtuais.ConexaoComAPIMoedas;


public class ConverterMoedas extends ConversorAbstract{
	private double valorX1;
	private String tipoOrigem;
	private String tipoSaida;
	
	public double converter(double valorX1, String tipoOrigem, String tipoSaida) {
		valorX1 = 5.4;
		tipoOrigem = "BLR";
		tipoSaida = "USD";
		ConexaoComAPIMoedas ccam = new ConexaoComAPIMoedas();
		
		return 3.4;
	}
	
	
}
