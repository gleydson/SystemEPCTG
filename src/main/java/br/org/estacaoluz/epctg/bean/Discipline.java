package br.org.estacaoluz.epctg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "disciplines")
public class Discipline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String name;
	
	@OneToOne
	@NotNull
	private AnnualNotes notes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnnualNotes getNotes() {
		return notes;
	}

	public void setNotes(AnnualNotes notes) {
		this.notes = notes;
	}
	
}
