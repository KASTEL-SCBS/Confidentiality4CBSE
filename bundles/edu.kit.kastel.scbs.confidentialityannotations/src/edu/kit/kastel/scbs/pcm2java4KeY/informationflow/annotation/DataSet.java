package edu.kit.kastel.scbs.pcm2java4KeY.informationflow.annotation;

public enum DataSet {
	D("1","d"),E("2","e"),F("3","f");
	
	private String id;
	private String name;
	
	DataSet(String id, String name) {
		this.id = id;
	    this.name = name;
	}
}
