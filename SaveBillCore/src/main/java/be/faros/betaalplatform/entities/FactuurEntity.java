package be.faros.betaalplatform.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import be.faros.betaalplatform.model.Status;

@Entity
@Table(name="factuur")
public class FactuurEntity extends Identifier{

	@ManyToOne
	@JoinColumn(name="EVENEMENT_ID")
	private EvenementEntity evenement;
	
	@Column(name="STATE")
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name="BEDRAG")
	private double bedrag;
	
	@ManyToOne
	@JoinColumn(name="DEELNEMER_ID")
	private PersoonEntity deelnemer;

	@Column(name="DATUM")
	private Date datum;

	public FactuurEntity() {
		//TODO catch not NULL restrictions
	}
	
	public FactuurEntity(EvenementEntity evenement, Status status,
			double bedrag, PersoonEntity deelnemer, Date datum) {
		setEvenement(evenement);
		setStatus(status);
		setBedrag(bedrag);
		setDeelnemer(deelnemer);
		setDatum(datum);
	}

	public EvenementEntity getEvenement() {
		return evenement;
	}

	public void setEvenement(EvenementEntity evenement) {
		this.evenement = evenement;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getBedrag() {
		return bedrag;
	}

	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}

	public PersoonEntity getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(PersoonEntity deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	
}
