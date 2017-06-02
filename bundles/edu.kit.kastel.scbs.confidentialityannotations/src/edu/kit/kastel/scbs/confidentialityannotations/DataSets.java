package edu.kit.kastel.scbs.confidentialityannotations;

public enum DataSets {
	D("DS1","d"),E("DS2","e"),F("DS3","f");
	
	private final String id;
	private final String name;
	
	DataSets(String id, String name) {
		this.id = id;
	    this.name = name;
	}
}
