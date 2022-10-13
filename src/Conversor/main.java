package Conversor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Conversor.ConversorMoedas.conversorMoedasAPI;
import Conversor.ConversorMoedas.regex;

public class main {

	public static void main(String[] args) {

		regex regeX = new regex();
		conversorMoedasAPI CM = new conversorMoedasAPI();
		

		while(true){
			String options = JOptionPane.showInputDialog(
			null, 
			"Escolha uma opção",
			"Menu:",
			JOptionPane.PLAIN_MESSAGE,
			null,
			new Object[]{"Conversor de moeda"},
			"Escolha" ).toString();

			switch (options) {

				case "Conversor de moeda":
				String optionsMoedas = JOptionPane.showInputDialog(
					null, 
					"Escolha uma opção",
					"Menu:",
					JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[]{"Dólares para Reais", "Reais para Dólares"},
					"Escolha" ).toString();
					
					switch (optionsMoedas) {
						case "Dólares para Reais":
							
							String inputDR = JOptionPane.showInputDialog("Insira o valor em Dólares: ", "99.99");
							double valorRecebido1 = Double.parseDouble(inputDR);
							try {
								String retornoAPIUSDToBRL = CM.conversorMOEDAS("USD", "BRL");
								double valorCotacao = Double.parseDouble(regeX.regexPrice(retornoAPIUSDToBRL));
								double valorConvertido = (double) valorRecebido1 * valorCotacao;
								DecimalFormat valorConvertidoComDecimais = new DecimalFormat("##.00");
								JOptionPane.showMessageDialog(null, "Você tem R$"+ valorConvertidoComDecimais.format(valorConvertido) + " Reais!");
							} catch (Exception e) {
								System.out.println(e);
							}
							
							break;
					
						case "Reais para Dólares":
							
							String inputRD = JOptionPane.showInputDialog("Insira o valor em Reais: ", "99.99");
							double valorRecebido2 = Double.parseDouble(inputRD);
							try {
								String retornoAPIBLRToUSD = CM.conversorMOEDAS("BRL", "USD");
								double valorCotacao = Double.parseDouble(regeX.regexPrice(retornoAPIBLRToUSD));
								double valorConvertido =  (double) valorRecebido2 * valorCotacao;
								DecimalFormat valorConvertidoComDecimais = new DecimalFormat("##.00");
								JOptionPane.showMessageDialog(null, "Você tem $"+ valorConvertidoComDecimais.format(valorConvertido) + " Dóllares!");
							} catch (Exception e) {
								System.out.println(e);
							}

							break;
					}
					break;
				default:
					break;
			}
		}	
	}

}
