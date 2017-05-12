public class Driver {
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String> sStorage = new Storage<>();
		
		Class baCls = BankAccount.class;
		try {
		BankAccount myAccount = (BankAccount) baCls.newInstance();
		/**
		*The below line was replaced by the above line, tried and then '(BankAccount)' was added.
		*/
		//Object myAccount = baCls.newInstance();
		aStorage.setValue(myAccount);
		// Deposit
		myAccount.deposit(15);
		System.out.println( aStorage.getValue().showBalance() );
		if( aStorage.getClass() == sStorage.getClass() ) {
		System.out.println( "EQUAL" );
		} else {
		System.out.println( "NOT EQUAL" );
		}
		}
		catch ( InstantiationException e ) {
		// ...
		}
		catch ( IllegalAccessException e ) {
		// ...
		}
	}
}