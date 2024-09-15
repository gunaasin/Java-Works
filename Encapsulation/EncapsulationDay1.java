class Bank{
	private int accountNumber;
	private int pinNumber;

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setPinNumber(int pinNumber){
		this.pinNumber = pinNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public int  getPinNumber(){
		return pinNumber;
	}
	
	
}





public class EncapsulationDay1 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.setAccountNumber(1141324);
		bank.setPinNumber(123);
		
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getPinNumber());

	}

}
