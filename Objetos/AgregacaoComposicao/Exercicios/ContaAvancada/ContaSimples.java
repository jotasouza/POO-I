package AgregacaoComposicao.Exercicios.ContaAvancada;

public class ContaSimples extends ContaBancaria {

	private double saldoPoupan�a;

	public double getSaldoPoupan�a() {
		return saldoPoupan�a;
	}

	public void setSaldoPoupan�a(double saldoPoupan�a) {
		this.saldoPoupan�a = saldoPoupan�a;
	}
	
	public boolean depositoPoupan�a(double valor){
		return false;
	}
	public boolean sequePoupan�a(double valor){
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupan�a=");
		builder.append(saldoPoupan�a);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}