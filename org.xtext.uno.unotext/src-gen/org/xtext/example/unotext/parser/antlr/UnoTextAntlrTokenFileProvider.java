/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UnoTextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/unotext/parser/antlr/internal/InternalUnoText.tokens");
	}
}