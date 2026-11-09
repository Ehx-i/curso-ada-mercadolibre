package modulo1.ejercicios.minibank.dao;

import modulo1.ejercicios.minibank.model.accountbank.AccountBank;
import modulo1.ejercicios.minibank.model.accountbank.model.User;

public interface IAccountBankDAO {
	
	AccountBank createAccounBank(AccountBank acc);
	AccountBank deleteAccountBanl(String id);
	AccountBank updateAccount(String id, AccountBank acc);
	AccountBank findAccount(String id);

	

}

