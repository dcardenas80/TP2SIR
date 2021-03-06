package fr.istic.sir.tp2.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ElectronicDevice {

	private Long id;
	private String name;
	
	public ElectronicDevice() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Electronic Device [id=" + id + ", name=" + name + "]";
	}
}
