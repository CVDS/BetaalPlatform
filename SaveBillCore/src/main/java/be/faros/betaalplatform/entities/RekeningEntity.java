package be.faros.betaalplatform.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rekening")
public class RekeningEntity extends Identifier{

	@Column(name="REKENINGNUMMER")
	private String rekeningnummer;
	
	@Column(name="IBAN")
	private String iban;
	
	@Column(name="BIC")
	private String bic;
	
	@ManyToOne
	@JoinColumn(name="PERSOON_ID")
	private PersoonEntity persoon;
	
	@Column(name="BANK")
	private String bank;

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
