package clas;


public class testInterestRate {

	
	public static void main(String[] args) {
		ICICI icici=new ICICI();
		icici.getFixedInterestRate(15000);
		icici.getSavingInterestRate(15000);
		KotMBank  bank=new KotMBank();
		bank.getFixedInterestRate(15000);
		bank.getSavingInterestRate(15000);
		GeneralBank bank2=new ICICI();
		bank2.getFixedInterestRate(15000);
		bank2.getSavingInterestRate(15000);
		GeneralBank bank3=new KotMBank();
		bank3.getFixedInterestRate(15000);
		bank3.getSavingInterestRate(15000);


	}

}
