package ru.mail.kievsan.jd.jpat.task31.iterator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class IntRandomsTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("IntRandoms tests started");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("\nnew IntRandoms Test started");
    }

    @AfterEach
    public void AfterEach() {
        System.out.println("IntRandoms Test complete");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("\nIntRandoms tests complete");
    }

    @Test
    public void test1_RandomsConstructor_MAX() {
        // arrange      (given)
        int min = 10, max = 20, expectedMax = 20;

        // act          (when)
        final Randoms actual = new Randoms(min, max);

        // assert       (then)
        assertEquals(expectedMax, actual.max);
    }

    @Test
    public void test2_RandomsConstructor_MAX() {
        int min = 20, max = 10, expectedMax = 20;

        final Randoms actual = new Randoms(min, max);

        assertEquals(expectedMax, actual.max);
    }

    @Test
    public void test3_Randoms_iterator() {
        int min = 20, max = 10;

        final Randoms actual = new Randoms(min, max);
        final int result = actual.iterator().next();

        assertTrue(result >= actual.min && result <= actual.max);
    }

}
