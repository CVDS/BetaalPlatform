package be.faros.betaalplatform.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.dozer.Mapping;

import be.faros.betaalplatform.model.Status;

@Entity
@Table(name="evenement")
public class EvenementEntity extends Identifier{

	@Column(name="NAAM")
	private String naam;
	
	@Column(name="STATE")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name="STARTDATUM")
	private Date startDatum;

	@Column(name="EINDDATUM")
	private Date eindDatum;
	
	@ManyToOne
	@JoinColumn(name="REKENING_ID")
	private RekeningEntity rekening;
	
	
	public EvenementEntity(){
		//TODO catch not NULL restrictions
	}

	public EvenementEntity(RekeningEntity rekening, String naam, Date startDatum, Date eindDatum){
		setRekening(rekening);
		setNaam(naam);
		setStartDatum(startDatum);
		setEindDatum(eindDatum);
		setState(Status.NB);
	}

	public RekeningEntity getRekening() {
		return rekening;
	}

	public void setRekening(RekeningEntity rekening) {
		this.rekening = rekening;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Status getStatus() {
		return status;
	}

	public void setState(Status status) {
		this.status = status;
	}

	public Date getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(Date startDatum) {
		this.startDatum = startDatum;
	}

	public Date getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}
	
	
}
