package fr.istic.sir.tp2.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Heater {
   
	private Long id;
	private String heaterDescription;

	
	public Heater() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHeaterDescription() {
		return heaterDescription;
	}
	public void setHeaterDescription(String heaterDescription) {
		this.heaterDescription = heaterDescription;
	}
	

}
