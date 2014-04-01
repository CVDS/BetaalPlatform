package be.faros.betaalplatform.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Identifier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	protected Long id;

	private void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	/*
	 * public boolean isNew() {
	 * return (this.id == null);
	 * }
	*/
}
