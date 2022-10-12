package Conversor;

import javax.swing.JOptionPane;
import Conversor.ConversorMoedas.conversorMoedasAPI;

public class main {

	public static void main(String[] args) {

		conversorMoedasAPI cMoedas = new conversorMoedasAPI();

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
					new Object[]{"Dolars para Reais", "Reais para Dolars"},
					"Escolha" ).toString();
					
					switch (optionsMoedas) {
						case "Dolars para Reais":
							String inputDR = JOptionPane.showInputDialog("Insira o valor: ");
							double valorRecebido1 = Double.parseDouble(inputDR);

							try {
								System.out.println(cMoedas.conversorMOEDAS());
							} catch (Exception e) {
								System.out.println(e);
							}

							break;
					
						case "Reais para Dolars":
							String inputRD = JOptionPane.showInputDialog("Insira o valor: ");
							double valorRecebido2 = Double.parseDouble(inputRD);

							try {
								System.out.println(cMoedas.conversorMOEDAS());
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
		


		// conversorMoedasAPI test = new conversorMoedasAPI();
		// try {
		// 	System.out.println(test.conversorMOEDAS());
		// } catch (Exception e) {
		// 	// TODO: handle exception
		// }
		
		
	}

}
