package edu.kit.kastel.scbs.pcm2java4KeY.informationflow.annotation;

import edu.kit.kastel.scbs.pcm2java4KeY.informationflow.annotation.DataIdentifying;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface InformationFlow {
  public String[] parameterSources();
  public DataIdentifying[] dataTargets();
}
