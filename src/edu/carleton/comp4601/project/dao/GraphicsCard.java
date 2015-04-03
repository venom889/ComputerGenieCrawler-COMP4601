package edu.carleton.comp4601.project.dao;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class GraphicsCard {

	private String manufacturer;
	private String model;
	private String memoryType;
	private String memoryCap;
	
	public GraphicsCard() {
		this.manufacturer = "";
		this.model = "";
		this.memoryType = "";
		this.setMemoryCap("");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	public String getMemoryCap() {
		return memoryCap;
	}

	public void setMemoryCap(String memoryCap) {
		this.memoryCap = memoryCap;
	}
}