package stack;

public class Account {
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	
	public Account(int i, String string, int j) {
		
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int id) {
		accountId=id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
    public void setAccountHolderName(String name) {
    	accountHolderName=name;
    }
    public double getAccountBalance() {
    	return accountBalance;
    }
    public void setAccountBalance(double balance) {
    	accountBalance=balance;
    }
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}


}
