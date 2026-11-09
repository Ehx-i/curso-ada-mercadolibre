package modulo2.agenda;
import java.util.Arrays;

public class AddressBook implements IAddressBookDTO {

	private Person[] contactList;
	private String[] favorite;
	private int capacity = 5;
	private int counter = 0;

	public AddressBook(int capacity) {
		super();
		this.capacity = capacity;
		this.contactList = new Person[capacity];
		this.favorite = new String[capacity];
	}

	public AddressBook() {
		super();
		this.contactList = new Person[capacity];
		this.favorite = new String[capacity];
	}

	public Person[] getContactList() {
		return contactList;
	}

	public void setContactList(Person[] contactList) {
		this.contactList = contactList;
	}

	public String[] getFavorite() {
		return favorite;
	}

	public void setFavorite(String[] favorite) {
		this.favorite = favorite;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean isFullList() {
		return counter >= capacity;
	}

	public boolean addContact(Person person) {
		if (person == null || isFullList()) {
			return false;
		}
		contactList[counter] = person;
		counter++;
		return true;
	}

	public boolean deleteContact(Person person) {
		if (person == null) {
			return false;
		}

		int index = -1;

		for (int i = 0; i < counter; i++) {
			if (contactList[i].getIdPerson().equals(person.getIdPerson())) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			return false;
		}

		for (int i = index; i < counter - 1; i++) {
			contactList[i] = contactList[i + 1];
		}

		contactList[counter - 1] = null;
		counter--;
		return true;
	}

	public Person findContact(String name) {
		for (int i = 0; i < counter; i++) {
			if (contactList[i].getName() != null && contactList[i].getName().equalsIgnoreCase(name)) {
				return contactList[i];
			}
		}
		return null;
	}

	public void showList() {
		if (counter == 0) {
			System.out.println("La agenda está vacía.");
			return;
		}
		System.out.println("\n\t* LISTA DE CONTACTOS *");
		for (int i = 0; i < counter; i++) {
			System.out.println(contactList[i]);
		}
	}

	public void showListFavorite() {
		if (favorite == null || counter == 0) {
			System.out.println("\nNo hay favoritos registrados o la agenda está vacía.");
			return;
		}

		System.out.println("\n*** |CONTACTOS FAVORITOS| ***");
		boolean found = false;
		for (int i = 0; i < counter; i++) {
			for (String emailContact : favorite) {
				if (emailContact != null && contactList[i].getEmail().equals(emailContact)) {
					System.out.println(contactList[i]);
					found = true;
					break;
				}
			}
		}

		if (!found) {
			System.out.println("\nNo se encontraron contactos marcados como favoritos.");
		}
	}

	public String emailValidate(String e) {
		if (e == null)
			return null;
		String email = e.toLowerCase();

		boolean validDomain = email.endsWith("@gmail.com") 
				|| email.endsWith("@outlook.com")
				|| email.endsWith("@hotmail.com") 
				|| email.endsWith("@yahoo.com") 
				|| email.endsWith("@icloud.com");

		if (!validDomain)
			return null;

		return java.util.Arrays.stream(contactList, 0, counter)
				.filter(c -> c != null && c.getEmail() != null && c.getEmail().equalsIgnoreCase(email))
				.map(Person::getEmail).findFirst().orElse(null);
	}
}