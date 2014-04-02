package be.faros.betaalplatform.model;

import java.util.Date;

public class Persoon {
	
	private String naam;
	private String voornaam;
	private String email;
	private Date geboortedatum;
	private Role role;

	public Persoon(String voornaam, String naam, String mail, Role role, Date geboorteDatum) {
		setVoornaam(voornaam);
		setNaam(naam);
		setEmail(mail);
		setRole(role);
		setGeboortedatum(geboortedatum);
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

	public Date getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
