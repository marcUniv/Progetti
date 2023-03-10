package progetto;

public class Alunno {
	private String name;
	private String surname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Alunno(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Alunno [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
}
