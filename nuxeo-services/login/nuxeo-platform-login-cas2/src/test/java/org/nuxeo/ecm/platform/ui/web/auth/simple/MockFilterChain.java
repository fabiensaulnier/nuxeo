/*
 * (C) Copyright 2010 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Nuxeo - initial API and implementation
 */

package org.nuxeo.ecm.platform.ui.web.auth.simple;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.nuxeo.ecm.platform.ui.web.auth.service.PluggableAuthenticationService;
import org.nuxeo.runtime.api.Framework;

public class MockFilterChain implements FilterChain {

    PluggableAuthenticationService pas;

    protected PluggableAuthenticationService getPAS() {
        if (pas == null) {
            pas = (PluggableAuthenticationService) Framework.getRuntime().getComponent(
                    PluggableAuthenticationService.NAME);

        }
        return pas;
    }

    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {

        // for (String filterName : getPAS().getAuthChain()) {
        // NuxeoAuthenticationPlugin filter = getPAS().getPlugin(filterName);
        //
        // filter.handleLoginPrompt(httpRequest, httpResponse, baseURL)
        // }
    }

}
