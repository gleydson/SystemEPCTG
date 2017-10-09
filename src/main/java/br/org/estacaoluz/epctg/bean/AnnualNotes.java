package br.org.estacaoluz.epctg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "annualNotes")
public class AnnualNotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private Double bim1;
	
	@NotNull
	private Double bim2;
	
	@NotNull
	private Double bim3;
	
	@NotNull
	private Double bim4;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getBim1() {
		return bim1;
	}
	
	public void setBim1(Double bim1) {
		this.bim1 = bim1;
	}
	
	public Double getBim2() {
		return bim2;
	}
	
	public void setBim2(Double bim2) {
		this.bim2 = bim2;
	}
	
	public Double getBim3() {
		return bim3;
	}
	
	public void setBim3(Double bim3) {
		this.bim3 = bim3;
	}
	
	public Double getBim4() {
		return bim4;
	}
	
	public void setBim4(Double bim4) {
		this.bim4 = bim4;
	}
	
}
