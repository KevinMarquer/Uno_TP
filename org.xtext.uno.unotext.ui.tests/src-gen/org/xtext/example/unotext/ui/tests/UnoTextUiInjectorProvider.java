/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.uno.unotext.ui.internal.UnotextActivator;

public class UnoTextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UnotextActivator.getInstance().getInjector("org.xtext.example.unotext.UnoText");
	}

}
