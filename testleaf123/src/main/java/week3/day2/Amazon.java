package week3.day2;

public class Amazon extends CanaraBank {



	@Override
	public void cashOnDelivery() {
		System.out.println("Am interface method 1");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Am interface method 2");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Am interface method 3");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Am interface method 4");
		
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Am abstract implemented method 1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Amazon amazon = new Amazon();
	amazon.cardPayments();
	amazon.cashOnDelivery();
	amazon.upiPayments();
	amazon.internetBanking();
	amazon.recordPaymentDetails();

}
}
