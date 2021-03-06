package be.faros.betaalplatform.model;

import org.joda.time.LocalDate;


public class Factuur {
	private Long id;
	private Evenement evenement;
	private Status status;
	private double bedrag;
	private Persoon deelnemer;
	private LocalDate datum;
	
	public Factuur(){
		
	}
	
	public Factuur(Long id, Evenement evenement, Status status, double bedrag, Persoon deelnemer, LocalDate datum) {
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
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	
}
