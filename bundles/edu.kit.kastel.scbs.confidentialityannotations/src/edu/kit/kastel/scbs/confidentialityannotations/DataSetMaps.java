package edu.kit.kastel.scbs.confidentialityannotations;

public enum DataSetMaps {
	M("DSM1","m");
	
	private final String id;
	private final String name;
	
	DataSetMaps(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
