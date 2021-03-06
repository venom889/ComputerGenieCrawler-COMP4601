package edu.carleton.comp4601.project.dao;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Harddrive {

	private String capacity;
	private String speed;
	private String type;
	private String driveType;
	
	public Harddrive() {
		this.capacity = "";
		this.speed = "";
		this.type = "";
		this.driveType = "";
	}
	
	public String getCapacity() {
		return capacity.toLowerCase();
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getSpeed() {
		return speed.toLowerCase();
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getType() {
		return type.toLowerCase();
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDriveType() {
		return driveType.toLowerCase();
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	
}
