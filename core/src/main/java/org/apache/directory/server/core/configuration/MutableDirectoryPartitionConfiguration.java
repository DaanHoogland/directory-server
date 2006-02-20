/*
 *   @(#) $Id$
 *
 *   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.directory.server.core.configuration;


import java.util.Set;

import javax.naming.directory.Attributes;

import org.apache.directory.server.core.partition.DirectoryPartition;


/**
 * A mutable version of {@link DirectoryPartitionConfiguration}.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$, $Date$
 */
public class MutableDirectoryPartitionConfiguration extends DirectoryPartitionConfiguration
{
    /**
     * Creates a new instance.
     */
    public MutableDirectoryPartitionConfiguration()
    {
    }


    public void setName( String name )
    {
        super.setName( name );
    }


    public void setIndexedAttributes( Set indexedAttributes )
    {
        super.setIndexedAttributes( indexedAttributes );
    }


    public void setContextPartition( DirectoryPartition partition )
    {
        super.setContextPartition( partition );
    }


    public void setContextEntry( Attributes rootEntry )
    {
        super.setContextEntry( rootEntry );
    }


    public void setSuffix( String suffix )
    {
        super.setSuffix( suffix );
    }
}
