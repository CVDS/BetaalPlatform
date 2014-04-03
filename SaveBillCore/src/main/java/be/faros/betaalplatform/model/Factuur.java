package be.faros.betaalplatform.model;

import java.util.Date;


public class Factuur {
	private Long id;
	private Evenement evenement;
	private Status status;
	private double bedrag;
	private Persoon deelnemer;
	private Date datum;
	
	public Factuur(){
		
	}
	
	public Factuur(Long id, Evenement evenement, Status status, double bedrag, Persoon deelnemer, Date datum) {
		setId(id);
		setEvenement(evenement);
		setStatus(status);
		setBedrag(bedrag);
		setDeelnemer(deelnemer);
		setDatum(datum);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
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
	public Persoon getDeelnemer() {
		return deelnemer;
	}
	public void setDeelnemer(Persoon deelnemer) {
		this.deelnemer = deelnemer;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
}
