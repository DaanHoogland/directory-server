/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.directory.server.core.integ;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.directory.shared.ldap.name.LdapDN;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( FrameworkRunner.class )
@ApplyLdifs(
    {
        "dn: cn=testClassC,ou=system\n" + 
        "objectClass: person\n" + 
        "cn: testClassC\n" + 
        "sn: sn_testClassC\n"
    })
public class TestClassC extends AbstractTestUnit
{
    @Test
    public void testWithoutMethodOrClassLevelFactory() throws Exception
    {
        if ( isRunInSuite )
        {
            assertTrue( service.getAdminSession().exists( new LdapDN( "cn=testSuite,ou=system" ) ) );
        }

        assertTrue( service.getAdminSession().exists( new LdapDN( "cn=testClassC,ou=system" ) ) );
        
        // the below DN will be injected in TestClassB when ran as suite, but that DN
        // shouldn't be present in the suite level DS cause of revert operation
        assertFalse( service.getAdminSession().exists( new LdapDN( "cn=testClassB,ou=system" ) ) );
    }
    
}
