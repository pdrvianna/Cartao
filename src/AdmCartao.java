
public class AdmCartao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CartaoPrePago Cpre = new CartaoPrePago("2345","Pedro",2025,10, 500);
		CartaoCash Ccash = new CartaoCash("123","Joao",2025,2, 1000,2);
		
		System.out.println(Cpre);
		
		if (Cpre.Comprar(100)){
			System.out.println("\nCompra efetuada\n"+Cpre);	
		} else {
			System.out.println("\nSem saldo \n"+Cpre);
		}
		
		//Cpre.Comprar(600);
		if (Cpre.Comprar(600)){
			System.out.println("\nCompra efetuada\n"+Cpre);	
		} else {
			System.out.println("\nSem saldo \n"+Cpre);
		}
		
		System.out.println("\n\n\n");
		System.out.println("Compra no CashBlack");
		
		System.out.println("valor atual: \n"+Ccash);
		if (Ccash.Comprar(900,3)){
			System.out.println("\nCompra efetuada\n"+Ccash);	
		} else {
			System.out.println("\nSem saldo \n"+Ccash);
		}
		
	}

}
