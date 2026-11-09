package modulo1.ejercicios.minibank.model.accountbank;

import modulo1.ejercicios.minibank.model.accountbank.model.User;

public class AccountBank {
	private String idAccount;
	private User user;
	private double balance;
	private Enum TypeAccountBank;
	
	public AccountBank(String idAccount, User user, double balance) {
		super();
		this.idAccount = idAccount;
		this.user = user;
		this.balance = balance;
	}

	public AccountBank() {
		super();
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Enum getTypeAccountBank() {
		return TypeAccountBank;
	}

	public void setTypeAccountBank(Enum typeAccountBank) {
		TypeAccountBank = typeAccountBank;
	}
	
	
}
