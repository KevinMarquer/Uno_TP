/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.unotext.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.uno.unotext.ui.internal.UnotextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UnoTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(UnotextActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		UnotextActivator activator = UnotextActivator.getInstance();
		return activator != null ? activator.getInjector(UnotextActivator.ORG_XTEXT_EXAMPLE_UNOTEXT_UNOTEXT) : null;
	}

}
