package edu.kit.kastel.scbs.confidentialityannotations;

public enum DataSetMapEntries {
	M_A("DSME1", DataSetMaps.M, "M[A]");
	
	private final String id;
	private final DataSetMaps dataSetMap;
	private final String name;
	
	private DataSetMapEntries(String id, DataSetMaps dataSetMap, String name) {
		this.id = id;
		this.dataSetMap = dataSetMap;
		this.name = name;
	}
}
