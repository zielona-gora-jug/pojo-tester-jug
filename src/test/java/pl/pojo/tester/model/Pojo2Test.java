package pl.pojo.tester.model;

import org.junit.Test;
import pl.pojo.tester.api.ClassAndFieldPredicatePair;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

public class Pojo2Test {

    @Test
    public void testPojo2() {
        final ClassAndFieldPredicatePair baseClass = new ClassAndFieldPredicatePair(Pojo2.class);
        final ClassAndFieldPredicatePair compositeClass = new ClassAndFieldPredicatePair(Pojo.class);
        assertPojoMethodsFor(baseClass, compositeClass).areWellImplemented();
    }
}