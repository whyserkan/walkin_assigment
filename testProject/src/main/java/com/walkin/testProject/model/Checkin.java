package com.walkin.testProject.model;

import java.sql.Timestamp;

public class Checkin {
	Timestamp checkinTime;
	String userName;
	String storeName;
	Double currentGeoLng;
	Double currentGeoLat;
	
	public Timestamp getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(Timestamp checkinTime) {
		this.checkinTime = checkinTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Double getCurrentGeoLng() {
		return currentGeoLng;
	}
	public void setCurrentGeoLng(Double currentGeoLng) {
		this.currentGeoLng = currentGeoLng;
	}
	public Double getCurrentGeoLat() {
		return currentGeoLat;
	}
	public void setCurrentGeoLat(Double currentGeoLat) {
		this.currentGeoLat = currentGeoLat;
	}
	
}
