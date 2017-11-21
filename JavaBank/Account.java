

/**
 * Ini adalah class untuk membuat object account. class ini ..........
 * @author RizqiAr
 */
public class Account {

	// class variables
	String accountname;
	int accountnum;
	int balance;

	// default constructor for Account
	Account() {
//		this.accountname = "EMPTY";
//		this.accountnum = 0;
//		this.balance = 0;
		this("EMPTY",0,0);
	}

	// overloaded constructor for Account
	Account(String name, int num, int amt) {
		accountname = name;
		accountnum = num;
		balance = amt;
	}

	/**
	 * Ini adalah method untuk menabung
	 * @param amt berapa besaran yang akan ditabung
	 */
	public void deposit(int amt) {
		balance = balance + amt;
	}

	// make a withdrawal from the balance
	public void withdraw(int amt) {
		balance = balance - amt;
	}

	// modifier to set the accountname
	public void setaccountname(String name) {
		accountname = name;
	}

	// modifier to set the accountnumber
	public void setaccountnum(int num) {
		accountnum = num;
	}

	// modifier to set the balance
	public void setbalance(int num) {
		balance = num;
	}

	// accessor to get the accountname
	public String getaccountname() {

		return accountname;
	}

	// accessor to get the accountnumber
	public int getaccountnum() {

		return accountnum;
	}

	// accessor to get the account balance
	public int getbalance() {

		return balance;
	}

	// print method
	public void print() {
		System.out.println(accountname + " " + accountnum + " " + balance);
	}
}
