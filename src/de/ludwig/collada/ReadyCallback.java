package de.ludwig.collada;

import de.ludwig.collada.structures.ParserResult;

public interface ReadyCallback {
	public void onReady(final ParserResult result);
}
