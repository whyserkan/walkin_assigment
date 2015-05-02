package com.walkin.testProject.model;

public class Store {
	String storeName;
	Double storeGeoLat;
	Double storeGeoLng;
	String userName;
	
	public Store(String storeName, Double storeGeoLat, Double storeGeoLng,
			String userName) {
		super();
		this.storeName = storeName;
		this.storeGeoLat = storeGeoLat;
		this.storeGeoLng = storeGeoLng;
		this.userName = userName;
	}
	public Store() {
		super();
	}
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Double getStoreGeoLat() {
		return storeGeoLat;
	}
	public void setStoreGeoLat(Double storeGeoLat) {
		this.storeGeoLat = storeGeoLat;
	}
	public Double getStoreGeoLng() {
		return storeGeoLng;
	}
	public void setStoreGeoLng(Double storeGeoLng) {
		this.storeGeoLng = storeGeoLng;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
