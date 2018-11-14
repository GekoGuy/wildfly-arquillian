/*
 * Copyright 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.arquillian.container.remote;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.as.arquillian.container.CommonContainerConfiguration;

/**
 * JBossAsManagedConfiguration
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author Alexander Köck
 * @version $Revision: $
 */
public class RemoteContainerConfiguration extends CommonContainerConfiguration {

    private long timeout;
    
    public RemoteContainerConfiguration () {
        super();
        timeout = 60_000L;
    }
    
    public long getTimeout() {
        return timeout;
    }
    
    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
    
    @Override
    public void validate() throws ConfigurationException {
        super.validate();
    }
}
