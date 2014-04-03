package be.faros.betaalplatform.model;

import be.faros.betaalplatform.entities.PersoonEntity;

public class Rekening {

	private Long id;
	private String rekeningnummer;
	private String iban;
	private String bic;
	private PersoonEntity persoon;
	private String bank;
	
	public Rekening(){
		
	}
	
	public Rekening(Long id, String rekeningnummer, String iban, String bic, PersoonEntity persoon, String bank) {
		setId(id);
		setRekeningnummer(rekeningnummer);
		setIban(iban);
		setBic(bic);
		setPersoon(persoon);
		setBank(bank);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getRekeningnummer() {
		return rekeningnummer;
	}

	public void setRekeningnummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public PersoonEntity getPersoon() {
		return persoon;
	}

	public void setPersoon(PersoonEntity persoon) {
		this.persoon = persoon;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
