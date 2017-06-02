package edu.kit.kastel.scbs.pcm2java4KeY.informationflow.annotation

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD, ElementType.TYPE)
annotation InformationFlow {
	String[] parameterSources
	DataIdentifying[] dataTargets
}