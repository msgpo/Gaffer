/*
 * Copyright 2016-2017 Crown Copyright
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
 */

package uk.gov.gchq.gaffer.operation.impl.export.set;

import uk.gov.gchq.gaffer.operation.Input;
import uk.gov.gchq.gaffer.operation.Operation;

/**
 * An <code>GetSetExport</code> GetExport operation gets exported Set results.
 * The Set export is maintained per single Job or {@link uk.gov.gchq.gaffer.operation.OperationChain} only.
 * It cannot be used across multiple separate operation requests.
 * So ExportToSet and GetSetExport must be used inside a single operation chain.
 */
public class GetSetExport implements
        Operation,
        GetExport,
        Input<String> {
    private String jobId;
    private String key;
    private int start = 0;
    private Integer end = null;

    public int getStart() {
        return start;
    }

    public void setStart(final int start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(final Integer end) {
        this.end = end;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public String getInput() {
        return jobId;
    }

    @Override
    public void setInput(final String jobId) {
        this.jobId = jobId;
    }

    public static class Builder
            extends Operation.BaseBuilder<GetSetExport, Builder>
            implements GetExport.Builder<GetSetExport, Builder>,
            Input.Builder<GetSetExport, String, Builder> {
        public Builder() {
            super(new GetSetExport());
        }

        public Builder start(final int start) {
            _getOp().setStart(start);
            return _self();
        }

        public Builder end(final Integer end) {
            _getOp().setEnd(end);
            return _self();
        }
    }
}
