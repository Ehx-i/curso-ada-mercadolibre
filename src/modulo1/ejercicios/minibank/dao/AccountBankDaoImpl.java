package modulo1.ejercicios.minibank.dao;

import modulo1.ejercicios.minibank.model.accountbank.AccountBank;
import modulo1.ejercicios.minibank.model.accountbank.model.User;

public class AccountBankDaoImpl implements IAccountBankDAO {

	AccountBank[] accounts = new AccountBank[10];
	AccountBank accountBank = new AccountBank();
	int cont = 0;

	@Override
	public AccountBank createAccounBank(AccountBank acc) {
		if (this.cont >= 10) {
			return null;
		}
		this.accounts[cont] = acc;
		int i = cont;
		cont++;
		return this.accounts[i];

	}

	@Override
	public AccountBank deleteAccountBanl(String id) {
		for (int i = 0; i < accounts.length; i++) {
			if ((this.accounts[i] != null) && this.accounts[i].getIdAccount().equalsIgnoreCase(id)) {
				accountBank = this.accounts[i];

				for (int j = i; j < cont - 1; j++) {
					accounts[j] = accounts[j + 1];
				}

				accounts[cont - 1] = null;
				cont--;

				return accountBank;
			}

		}
		return null;
	}

	@Override
	public AccountBank updateAccount(String id, AccountBank acc) {

		for (int i = 0; i < accounts.length; i++) {
			if ((this.accounts[i] != null) && this.accounts[i].getIdAccount().equalsIgnoreCase(id)) {
				this.accounts[i] = acc;

				return this.accounts[i] ;
			}
		}
		return null;
	}

	@Override
	public AccountBank findAccount(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
