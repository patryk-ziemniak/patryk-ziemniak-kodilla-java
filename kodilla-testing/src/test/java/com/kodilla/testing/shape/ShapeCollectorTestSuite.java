package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests when collector is empty")
    class TestsForEmptyCollector {

        @DisplayName("When collector is empty and adding figure to it, " +
                "then collector should have 1 element")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1);

            //When
            collector.addFigure(shape);

            //Then
            assertEquals(1, collector.shapes.size());
        }

        @DisplayName("When added figure to empty collector and remove it, " +
                "then collector should be empty and method should retrieve true value")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1);
            collector.addFigure(shape);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertTrue(collector.shapes.isEmpty());
            assertTrue(result);
        }

        @DisplayName("When trying to remove figure not existing in empty collector, " +
                "then method should retrieve false value")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertFalse(result);
        }

        @DisplayName("When added figure to empty collector, " +
                "then figure retrieved with index 0 should be the same")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape shape = new Circle(1);
            collector.addFigure(shape);

            //When
            Shape result = collector.getFigure(0);

            //Then
            assertEquals(shape, result);
        }

        @DisplayName("When trying to get figure with negative index '-1'," +
                "then figure retrieved should be null value")
        @Test
        void testGetFigureWithNegativeIndex() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            Shape result = collector.getFigure(-1);

            //Then
            assertNull(result);
        }

        @DisplayName("When collector is empty and trying to get all figures, " +
                "then should retrieve null")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            String result = collector.showFigures();

            //Then
            assertNull(result);
        }
    }

    @Nested
    @DisplayName("Tests when collector is filled")
    class TestsForFilledCollector {

        @DisplayName("When collector has 2 elements and adding figure to it, " +
                "then collector should have 3 elements")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);
            Shape shape = new Circle(1);

            //When
            collector.addFigure(shape);

            //Then
            assertEquals(3, collector.shapes.size());
        }

        @DisplayName("When added figure to collector with 2 elements and remove it, " +
                "then collector should have 2 elements again and method should retrieve true value")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);
            Shape shape = new Circle(1);
            collector.addFigure(shape);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertEquals(2, collector.shapes.size());
            assertTrue(result);
        }

        @DisplayName("When trying to remove figure not existing in collector with 2 elements, " +
                "then method should retrieve false value")
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);
            Shape shape = new Circle(1);

            //When
            boolean result = collector.removeFigure(shape);

            //Then
            assertFalse(result);
        }

        @DisplayName("When added figure to collector with 2 figures, " +
                "then figure retrieved with index 2 should be the same")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);
            Shape shape = new Circle(1);
            collector.addFigure(shape);

            //When
            Shape result = collector.getFigure(2);

            //Then
            assertEquals(shape, result);
        }

        @DisplayName("When trying to get figure with index bigger (3) than index of last element (1) of collection," +
                "then figure retrieved should be null value")
        @Test
        void testGetFigureWithNegativeIndex() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);

            //When
            Shape result = collector.getFigure(3);

            //Then
            assertNull(result);
        }

        @DisplayName("When collector has 2 elements and trying to get all figures, " +
                "then should retrieve them")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape e1 = new Triangle(2.0, 1.0);
            Shape e2 = new Square(2.0);
            collector.addFigure(e1);
            collector.addFigure(e2);

            //When
            String result = collector.showFigures();

            //Then
            assertNotNull(result);
        }
    }
}
