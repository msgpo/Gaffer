/*
 * Copyright 2016 Crown Copyright
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
package uk.gov.gchq.gaffer.spark.operation.javardd;

import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import uk.gov.gchq.gaffer.data.element.Element;
import uk.gov.gchq.gaffer.operation.graph.AbstractSeededGraphGet;
import uk.gov.gchq.gaffer.spark.operation.AbstractGetSparkRDD;
import uk.gov.gchq.gaffer.spark.serialisation.TypeReferenceSparkImpl;

public abstract class AbstractGetJavaRDD<I_ITEM> extends AbstractGetSparkRDD<I_ITEM, JavaRDD<Element>> {
    private JavaSparkContext javaSparkContext;

    public JavaSparkContext getJavaSparkContext() {
        return javaSparkContext;
    }

    public void setJavaSparkContext(final JavaSparkContext javaSparkContext) {
        this.javaSparkContext = javaSparkContext;
    }

    @Override
    protected TypeReference createOutputTypeReference() {
        return new TypeReferenceSparkImpl.JavaRDDElement();
    }

    protected abstract static class BaseBuilder<OP_TYPE extends AbstractGetJavaRDD<I_ITEM>,
            I_ITEM,
            CHILD_CLASS extends BaseBuilder<OP_TYPE, I_ITEM, ?>>
            extends AbstractSeededGraphGet.BaseBuilder<OP_TYPE, I_ITEM, JavaRDD<Element>, CHILD_CLASS> {

        public BaseBuilder(final OP_TYPE op) {
            super(op);
        }

        public CHILD_CLASS javaSparkContext(final JavaSparkContext sparkContext) {
            op.setJavaSparkContext(sparkContext);
            return self();
        }
    }

    public static final class Builder<OP_TYPE extends AbstractGetJavaRDD<I_ITEM>, I_ITEM>
            extends BaseBuilder<OP_TYPE, I_ITEM, Builder<OP_TYPE, I_ITEM>> {

        public Builder(final OP_TYPE op) {
            super(op);
        }

        @Override
        protected Builder<OP_TYPE, I_ITEM> self() {
            return this;
        }
    }
}
