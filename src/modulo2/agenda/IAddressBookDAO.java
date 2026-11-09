package modulo2.agenda;

public interface IAddressBookDAO {

	
	public boolean addContact(Person person);
	public boolean deleteContact(Person person);
	public Person findContact(String name);
	public void showList();
	public void showListFavorite();
	public boolean isFullList();
	
}
