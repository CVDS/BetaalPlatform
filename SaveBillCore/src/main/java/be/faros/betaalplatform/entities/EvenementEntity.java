package be.faros.betaalplatform.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

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
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime startDatum;

	@Column(name="EINDDATUM")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime eindDatum;
	
	@ManyToOne
	@JoinColumn(name="REKENING_ID")
	private RekeningEntity rekening;
	
	
	public EvenementEntity(){
		//TODO catch not NULL restrictions
	}

	public EvenementEntity(RekeningEntity rekening, String naam, LocalDateTime startDatum, LocalDateTime eindDatum){
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

	public LocalDateTime getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(LocalDateTime startDatum) {
		this.startDatum = startDatum;
	}

	public LocalDateTime getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(LocalDateTime eindDatum) {
		this.eindDatum = eindDatum;
	}
	
	
}
