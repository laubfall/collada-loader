package de.ludwig.collada;

import java.util.Set;

import com.khronos.collada.COLLADA;

public class UnmarshallResult {
	private final COLLADA doc;
	
	/**
	 * Collada Types that needs to be refined afer unmarshalling.
	 * Types that want to be refined have to implement a method
	 * public void refined (RefineContext ctx)
	 * 
	 * Refining means some additional initilization after instantiation
	 * when the whole collada structure has to be present.
	 */
	private Set<Object> refiningRequired;

	public UnmarshallResult(COLLADA doc) {
		super();
		this.doc = doc;
	}
	
	public Set<Object> getRefiningRequired() {
		return refiningRequired;
	}

	public void setRefiningRequired(Set<Object> refiningRequired) {
		this.refiningRequired = refiningRequired;
	}

	public COLLADA getDoc() {
		return doc;
	}

}
