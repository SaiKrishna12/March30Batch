package day29;

public class Hsbc implements Bank{
	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTranfer();
	}
	public void debit() {
		System.out.println("Debit process in hsbc");
	}
	public void credit() {
		System.out.println("Crediting procedure");
	}
	public void moneyTranfer() {
		System.out.println("Money transfer");
	}

}
