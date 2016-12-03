/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.keys;

import java.security.PublicKey;

import org.keycloak.provider.Provider;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public interface PublicKeyStorageProvider extends Provider {


    /**
     * Get public key to verify messages signed by particular client. Used for example during JWT client authentication
     *
     * @param modelKey
     * @param kid
     * @param loader
     * @return
     */
    PublicKey getPublicKey(String modelKey, String kid, PublicKeyLoader loader);

    /**
     * Clears all the cached public keys, so they need to be loaded again
     */
    void clearCache();

}