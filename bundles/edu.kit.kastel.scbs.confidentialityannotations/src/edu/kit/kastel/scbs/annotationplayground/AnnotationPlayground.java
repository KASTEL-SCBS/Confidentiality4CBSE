package edu.kit.kastel.scbs.annotationplayground;

import edu.kit.kastel.scbs.confidentialityannotations.DataSets;
import edu.kit.kastel.scbs.confidentialityannotations.DataSetMapEntries;
import edu.kit.kastel.scbs.confidentialityannotations.InformationFlow;

public class AnnotationPlayground {
	@InformationFlow(parameterSources = { "p" }, dataSets = { DataSets.D}, dataSetMapEntries = {DataSetMapEntries.M_A})
	void m(int p) {
		
	}
}
