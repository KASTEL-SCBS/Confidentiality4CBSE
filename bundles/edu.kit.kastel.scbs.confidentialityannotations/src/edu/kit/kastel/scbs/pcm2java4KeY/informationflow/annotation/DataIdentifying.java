package edu.kit.kastel.scbs.pcm2java4KeY.informationflow.annotation;

public enum DataIdentifying {
	
	DATA_SET(),
	DATA_SET_MAP_ENTRY();
	
	private DataSet dataSet; 
	private DataSetMapEntry dataSetMapEntry;
	
	DataIdentifying(DataSet dataSet, DataSetMapEntry dataSetMapEntry) {
		this.dataSet = dataSet;
		this.dataSetMapEntry = dataSetMapEntry;
	}
}
