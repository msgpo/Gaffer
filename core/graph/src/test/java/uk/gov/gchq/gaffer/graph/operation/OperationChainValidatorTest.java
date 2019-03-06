/*
 * Copyright 2016-2019 Crown Copyright
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

package uk.gov.gchq.gaffer.graph.operation;

public class OperationChainValidatorTest {
    /*@Test
    public void shouldValidateValidOperationChain() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new ToVertices(),
                new GetAdjacentIds()
        )), true);
    }

    @Test
    public void shouldInValidateNullElementDef() {
        // Given
        final ViewValidator viewValidator = mock(ViewValidator.class);
        final OperationChainValidator validator = new OperationChainValidator(viewValidator);
        final Store store = mock(Store.class);
        Schema schema = mock(Schema.class);
        given(store.getSchema()).willReturn(schema);
        given(schema.getElement(Mockito.anyString())).willReturn(null);

        Max max = new Max();
        max.setComparators(Lists.newArrayList(new ElementPropertyComparator.Builder()
                .groups(TestGroups.ENTITY)
                .property("property")
                .build()));

        ValidationResult validationResult = new ValidationResult();

        // When
        validator.validateComparables(max, null, store, validationResult);

        // Then
        assertEquals(false, validationResult.isValid());
        Set<String> errors = validationResult.getErrors();
        assertEquals(1, errors.size());
        errors.contains(Max.class.getName()
                + " references BasicEntity group that does not exist in the schema");
    }

    @Test
    public void shouldValidateOperationChainThatCouldBeValidBasedOnGenerics() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new ToVertices(),
                new GenerateObjects.Builder<>()
                        .generator(e -> e)
                        .build(),
                new GetAdjacentIds()
        )), true);
    }

    @Test
    public void shouldValidateExportOperationChain() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new ExportToSet<>(),
                new DiscardOutput(),
                new GetElements.Builder()
                        .input(new EmptyClosableIterable<>())
                        .build(),
                new ExportToSet<>(),
                new DiscardOutput(),
                new GetExports()
        )), true);
    }

    @Test
    public void shouldValidateInvalidExportOperationChainWithoutDiscardOperation() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements(),
                new ExportToSet<>(),
                // new DiscardOutput(),
                new GetElements(),
                new ExportToSet<>(),
                // new DiscardOutput(),
                new GetExports()   // No input
        )), false);
    }

    @Test
    public void shouldValidateInvalidOperationChainIterableNotAssignableFromMap() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements(),
                new ExportToSet<>(),
                new DiscardOutput(),
                new GetElements(),
                new ExportToSet<>(),
                new DiscardOutput(),
                new GetExports(), // Output is a map
                new GetElements() // Input is an iterable
        )), false);
    }

    @Test
    public void shouldValidateInvalidOperationChain() {
        validateOperationChain(new OperationChain(Arrays.asList(
                new GetElements(),
                new GetElements(),
                new ToVertices(),
                new GetElements(),
                new Max(),          // Output is an Element
                new GetElements()   // Input is an Iterable
        )), false);
    }

    @Test
    public void shouldNotValidateInvalidOperationChain() {

        //Given
        Operation operation = Mockito.mock(Operation.class);
        given(operation.validate()).willReturn(new ValidationResult("SparkContext is required"));

        OperationChain opChain = new OperationChain(operation);

        // When
        validateOperationChain(opChain, false);

        // Then
        verify(operation).validate();
    }

    private void validateOperationChain(final OperationChain opChain, final boolean expectedResult) {
        // Given
        final ViewValidator viewValidator = mock(ViewValidator.class);
        final OperationChainValidator validator = new OperationChainValidator(viewValidator);
        final Store store = mock(Store.class);
        final User user = mock(User.class);


        given(viewValidator.validate(any(View.class), any(Schema.class), any(Set.class))).willReturn(new ValidationResult());


        // When
        final ValidationResult validationResult = validator.validate(opChain, user, store);

        // Then
        assertEquals(expectedResult, validationResult.isValid());
    }*/
}