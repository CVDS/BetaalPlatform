package be.faros.betaalplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persoon")
public class PersoonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//TODO met jpa werken, niet met hibernate
	//@GenericGenerator(name="gen",strategy="increment")
	//@GeneratedValue(generator="gen")
	@Column (name="ID")
	private Long id;
	
	@Column(name="NAAM")
	private String naam;
	
	@Column(name="VOORNAAM")
	private String voornaam;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="wachtwoord")
	private String wachtwoord;
	
	@Column(name="role")
	private String role;
	
	public PersoonEntity(){
		//TODO catch not NULL restrictions
	}

	public PersoonEntity(String voornaam, String naam, String mail, String role, String wachtwoord){
		setVoornaam(voornaam);
		setNaam(naam);
		setEmail(mail);
		setRole(role);
		setWachtwoord(wachtwoord);
	}

	public Long getId() {
		return id;
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
