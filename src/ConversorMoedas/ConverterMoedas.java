package ConversorMoedas;
import javax.swing.JOptionPane;

public class ConverterMoedas {
	public static void main(String[] args) {
		while(true) {
			FuncaoConverter converter = new FuncaoConverter();
			
			String options = JOptionPane.showInputDialog(null, "Escolha uma opção:","Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moedas","Conversor de Temperaturas"}, "Escolha").toString();
			switch(options) {
				case "Conversor de Moedas":
					String input = JOptionPane.showInputDialog("Insira um valor em Reais");
					double valorRecebido = Double.parseDouble(input);
					converter.ConverterReaisParaDolar(valorRecebido);
			}
		}
	}
}
