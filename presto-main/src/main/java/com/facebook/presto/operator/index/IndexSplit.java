/*
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
 */
package com.facebook.presto.operator.index;

import com.facebook.presto.spi.HostAddress;
import com.facebook.presto.spi.RecordSet;
import com.facebook.presto.spi.Split;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class IndexSplit
        implements Split
{
    private final RecordSet keyRecordSet;

    public IndexSplit(RecordSet keyRecordSet)
    {
        this.keyRecordSet = checkNotNull(keyRecordSet, "keyRecordSet is null");
    }

    @Override
    public boolean isRemotelyAccessible()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<HostAddress> getAddresses()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getInfo()
    {
        return null;
    }

    public RecordSet getKeyRecordSet()
    {
        return keyRecordSet;
    }
}
