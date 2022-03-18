package com.garage.model;

public enum Condition {
	NEW("New"),
	FUNCTIONING("Functioning"),
	DISREPAIR("In Disrepair");
	
	private String text;
	
	private Condition(String text) {
		this.text = text;
	}
	
	public String toString() {
		return this.text;
	}
}
