/*******************************************************************************
 * Copyright (c) 2018 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.broker.core.plugin;

import org.eclipse.kapua.broker.core.route.CamelRouteLoader;
import org.eclipse.kapua.broker.core.route.RouteContainer;
import org.junit.Test;

public class CamelRouteLoaderTest {

    @Test
    public void testRouteLoader() {
        RouteContainer routeContainer = CamelRouteLoader.loadRoutes("camel-route-loader.xml");
        // TODO check the consistency of the loaded object with the expected model
    }

}
