/**
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 * <p>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package me.snowdrop.istio.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author <a href="claprun@redhat.com">Christophe Laprun</a>
 */
public interface IstioSpec extends Serializable {
    @JsonIgnore
    default String getKind() {
        return getClass().getSimpleName();
    }
}
