package be.faros.betaalplatform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persoon {
	
	private Long id;
	private String naam;
	private String voornaam;
	private String email;
	private Date geboortedatum;
	private Role role;
	private List<Rekening> rekeningen;
	
	public Persoon(){
		
	}
	public Persoon(Long id, String voornaam, String naam, String mail, Role role, Date geboorteDatum) {
		setId(id);
		setVoornaam(voornaam);
		setNaam(naam);
		setEmail(mail);
		setRole(role);
		setGeboortedatum(geboortedatum);
		rekeningen = new ArrayList<Rekening>();
	}
	
	public void addRekening(Rekening rekening){
		rekeningen.add(rekening);
	}
	
	public void removeRekening(Rekening rekening){
		rekeningen.remove(rekening);
	}
	
	public Rekening getRekening(int index){
		return rekeningen.get(index);
	}
	
	public List<Rekening> getAlleRekeningen(){
		return rekeningen;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
