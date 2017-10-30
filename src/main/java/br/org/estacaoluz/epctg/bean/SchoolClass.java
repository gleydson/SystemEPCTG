package br.org.estacaoluz.epctg.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity(name = "schoolClasses")
public class SchoolClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private int numberOfStudents;
	
	@OneToMany
	private List<Discipline> listDisciplines;
	
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
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public List<Discipline> getListDisciplines() {
		return listDisciplines;
	}

	public void setListDisciplines(List<Discipline> listDisciplines) {
		this.listDisciplines = listDisciplines;
	}
	
}
