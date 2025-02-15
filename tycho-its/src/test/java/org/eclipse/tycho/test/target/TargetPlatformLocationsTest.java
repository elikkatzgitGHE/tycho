/*******************************************************************************
 * Copyright (c) 2020, 2021 Christoph Läubrich and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Christoph Läubrich - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.test.target;

import org.apache.maven.it.Verifier;
import org.eclipse.tycho.test.AbstractTychoIntegrationTest;
import org.junit.Ignore;
import org.junit.Test;

public class TargetPlatformLocationsTest extends AbstractTychoIntegrationTest {

    @Test
    public void testMavenLocation() throws Exception {
        Verifier verifier = getVerifier("target.maven", false, true);
        verifier.executeGoal("verify");
        verifier.verifyErrorFreeLog();
    }

    @Test
    public void testMavenLocationMulti() throws Exception {
        Verifier verifier = getVerifier("target.mavenMulti", false, true);
        verifier.executeGoal("verify");
        verifier.verifyErrorFreeLog();
    }

    @Test
    @Ignore(value = "This test is flaky on the buildserver")
    public void testMavenLocationRepositories() throws Exception {
        Verifier verifier = getVerifier("target.mavenRepos", false, true);
        verifier.executeGoal("verify");
        verifier.verifyErrorFreeLog();
    }

    public void testDirectoryLocation() throws Exception {
        Verifier verifier = getVerifier("target.directory", false, true);
        verifier.executeGoal("verify");
        verifier.verifyErrorFreeLog();
    }

}
