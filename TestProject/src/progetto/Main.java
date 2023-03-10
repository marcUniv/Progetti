package progetto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Nuovo Alunno");
		
		System.out.println("nome:");
		String name = in.nextLine();
		System.out.println("cognome:");
		String surname = in.nextLine();

		Alunno alumn1 = new Alunno(name,surname);
		System.out.println(alumn1);
	}

}
