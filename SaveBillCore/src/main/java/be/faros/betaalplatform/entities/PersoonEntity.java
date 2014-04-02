package be.faros.betaalplatform.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import be.faros.betaalplatform.model.Role;

@Entity
@Table(name="persoon")
public class PersoonEntity extends Identifier{
		
	@Column(name="NAAM")
	private String naam;
	
	@Column(name="VOORNAAM")
	private String voornaam;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="GEBOORTEDATUM")
	//@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	private Date geboortedatum;
	
	@Column(name="WACHTWOORD")
	private String wachtwoord;
	
	@Column(name="ROLE")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public PersoonEntity(){
		//TODO catch not NULL restrictions
	}
	public PersoonEntity(String naam, String voornaam, String email, Date geboortedatum, Role role){
		setNaam(naam);
		setVoornaam(voornaam);
		setEmail(email);
		setGeboortedatum(geboortedatum);
		setRole(role);
	}
	public PersoonEntity(String naam, String voornaam, String email, Date geboortedatum, Role role, String wachtwoord){
		setNaam(naam);
		setVoornaam(voornaam);
		setEmail(email);
		setGeboortedatum(geboortedatum);
		setRole(role);
		setWachtwoord(wachtwoord);
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
	
}
