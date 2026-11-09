package modulo2.agenda;
import java.security.SecureRandom;
import java.util.Scanner;

public class Utils {
	static Scanner sc = new Scanner(System.in);
	private static boolean enable = true;
	private static int option;
	private static String dataContacto = "";
	private static SecureRandom random = new SecureRandom();
	private static int counterFavorite = 0;

	private static AddressBook addressBook;

	public Utils(AddressBook book) {
		this.addressBook = book;
	}

	public static void showMenu() {
		do {
			System.out.println();
			System.out.println("---------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------");
			System.out.println("----------                                     ----------------");
			System.out.println("----------     [--------* MENÚ *-------]       ----------------");
			System.out.println("----------                                     ----------------");
			System.out.println("----------      1. Añadir contacto             ----------------");
			System.out.println("----------      2. Buscar contacto             ----------------");
			System.out.println("----------      3. Eliminar contacto           ----------------");
			System.out.println("----------      4. Ver lista de contactos      ----------------");
			System.out.println("----------      5. Agregar a favoritos         ----------------");
			System.out.println("----------      6. Ver lista de favoritos      ----------------");
			System.out.println("----------      7. Salir                       ----------------");
			System.out.println("----------                                     ----------------");
			System.out.print("----------      Opción: __");
			System.out.println();

			if (!sc.hasNextInt()) {
				System.out.println("Por favor, ingresa un número válido.");
				sc.next();
				continue;
			}
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				System.out.println("\n\t[ -REGISTRO DE CONTACTO- ]\n");
				Person contact = new Person();

				System.out.print("Escribe el NOMBRE del contacto: ");
				dataContacto = sc.nextLine();
				contact.setName(dataContacto);

				System.out.print("Escribe el EMAIL del contacto: ");
				dataContacto = sc.next();
				contact.setEmail(dataContacto);

				System.out.print("Escribe el TÉLEFONO del contacto: ");
				dataContacto = sc.next();
				contact.setPhone(dataContacto);

				String idGenerated = String.valueOf(random.nextInt(100) + 1);
				contact.setIdPerson(idGenerated);

				boolean isRegister = addressBook.addContact(contact);
				System.out.printf("%nRegistro: %s (ID asignado: %s)%n",
						(isRegister ? "Exitoso." : "NO Exitoso (Agenda llena o datos nulos)."), idGenerated);
				break;

			case 2:
				System.out.println("\n\t[ -BÚSQUEDA DE CONTACTO- ]\n");
				System.out.print("Escribe el NOMBRE del contacto: ");
				dataContacto = sc.nextLine();
				Person temp = addressBook.findContact(dataContacto);
				if (temp != null) {
					System.out.println("Se ha encontrado: ");
					System.out.println(temp);
				} else {
					System.out.println("No se encontró el contacto. Asegúrate de que el nombre esté bien escrito.\n");
				}
				break;

			case 3:
				System.out.println("\n\t[ -ELIMINAR DE CONTACTO- ]\n");
				System.out.print("Escribe el NOMBRE del contacto a eliminar: ");
				dataContacto = sc.nextLine();
				Person contactToDelete = addressBook.findContact(dataContacto);

				if (contactToDelete != null) {
					boolean deleted = addressBook.deleteContact(contactToDelete);
					System.out.printf("%nResultado: %s%n",
							(deleted ? "Se ha eliminado exitosamente." : "NO se ha podido eliminar."));
				} else {
					System.out.println("No se encontró ningún contacto con ese nombre.");
				}
				break;

			case 4:
				addressBook.showList();
				break;

			case 5:
				System.out.println("\t** AGREGANDO A FAVORITOS **");
				String[] favoritesList = addressBook.getFavorite();
				if (counterFavorite >= favoritesList.length) {
					System.out.println("No se puede añadir a favoritos, la lista de FAVORITOS está llena.");
					break;
				}

				System.out.print("Escribe el EMAIL del contacto para añadirlo a favoritos: ");
				dataContacto = sc.next();

				String validatedEmail = addressBook.emailValidate(dataContacto);

				if (validatedEmail != null) {
					favoritesList[counterFavorite] = validatedEmail;
					counterFavorite++;
					System.out.println("¡Añadido a favoritos correctamente!");
				} else {
					System.out.println(
							"Error: El correo no existe en la agenda o el dominio no es válido (@gmail, @outlook, etc.).");
				}
				break;

			case 6:
				addressBook.showListFavorite();
				break;

			case 7:
				System.out.println("\nSaliendo del sistema...");
				enable = false;
				break;

			default:
				System.out.println("Opción incorrecta. Debes escribir un número que corresponda a las opciones.");
				break;
			}

		} while (enable);
		System.out.println("Fin del programa.");
	}
}