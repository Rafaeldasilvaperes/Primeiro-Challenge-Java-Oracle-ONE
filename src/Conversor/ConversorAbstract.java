package Conversor;

public abstract class ConversorAbstract {
	private double valorX1;
	private String tipoOrigem;
	private String tipoSaida;
	
	public abstract double converter(double valorX1, String tipoOrigem, String tipoSaida);
	
	public double getValorX1() {
		return valorX1;
	}
	public void setValorX1(double valorX1) {
		this.valorX1 = valorX1;
	}
	public String getMoedaOrigem() {
		return tipoOrigem;
	}
	public void setMoedaOrigem(String tipoOrigem) {
		this.tipoOrigem = tipoOrigem;
	}
	public String getMoedaSaida() {
		return tipoSaida;
	}
	public void setMoedaSaida(String tipoSaida) {
		this.tipoSaida = tipoSaida;
	}
	
	
}
