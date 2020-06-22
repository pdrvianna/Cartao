
public class CartaoPrePago {

	protected String numerocartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	public CartaoPrePago(String numerocartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		this.numerocartao = numerocartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	
	public void Credito(double valor) {
		saldo += valor;
	}
	public boolean Comprar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "CartaoPrePago [numerocartao=" + numerocartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}
	
	
}
