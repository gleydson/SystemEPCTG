package br.org.estacaoluz.epctg.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity(name = "schoolYears")
public class SchoolYear {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private int year;
	
	@NotNull
	private String status;

	@OneToMany
	private List<SchoolClass> listSchoolClasses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<SchoolClass> getListSchoolClasses() {
		return listSchoolClasses;
	}

	public void setListSchoolClasses(List<SchoolClass> listSchoolClasses) {
		this.listSchoolClasses = listSchoolClasses;
	}
	
}
