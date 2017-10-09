package defaut;

public class Prof {
	private String name;
	private String surname;
	private String cours;
	public Prof(String name, String surname, String cours) {
		super();
		this.name = name;
		this.surname = surname;
		this.cours = cours;
	}
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
	public String getCours() {
		return cours;
	}
	public void setCours(String cours) {
		this.cours = cours;
	}
	@Override
	public String toString() {
		return "Prof [name=" + name + ", surname=" + surname + ", cours=" + cours + "]";
	}
	

}
