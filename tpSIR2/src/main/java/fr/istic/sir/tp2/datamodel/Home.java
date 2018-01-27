package fr.istic.sir.tp2.datamodel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Home {
	private Long id;
	private String name;
	private List<ElectronicDevice> electronicDevice = new ArrayList<ElectronicDevice>();
	private List<Heater> heater = new ArrayList<Heater>();
	
	public Home() {
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
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "person_id")
	public List<ElectronicDevice> getElectronicDevice() {
		return electronicDevice;
	}
	public void addElectronicDevice(ElectronicDevice electronicDeviceid) {
		electronicDevice.add(electronicDeviceid);
	}

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "home_id")
	public List<Heater> getHeater() {
		return heater;
	}
	public void addHeater(Heater heaterid) {
	heater.add(heaterid);
	}
	public void setHeater(List<Heater> heater) {
		this.heater = heater;
	}
	public void setElectronicDevice(List<ElectronicDevice> electronicDevice) {
		this.electronicDevice = electronicDevice;
	}
	
	
	
}
