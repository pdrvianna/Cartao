
public class CartaoCash extends CartaoPrePago{
	
	private int tipo;

	public CartaoCash(String numerocartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		
		super(numerocartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;

	}

	public boolean Comprar(double valor, int tip) {
		tipo = tip;
		super.saldo = super.saldo-valor;
		if (valor < saldo) {
			if (tipo==1) {super.saldo =valor*0.02;}
			if (tipo==2) {super.saldo =valor*0.05;}
			if (tipo==3) {super.saldo =valor*0.08;}
			return true;
		} else { return false;}
		
	}

	@Override
	public String toString() {
		return "CartaoCash [tipo=" + tipo + ", numerocartao=" + numerocartao + ", nomeTitular=" + nomeTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + String.format("%.2f",saldo) + "]";
	}
	
	
	
	
}
