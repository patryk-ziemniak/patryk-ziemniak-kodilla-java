package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCalculatorTestSuite {

    @Mock
    private Statistics statistics;

    private List<String> generateUsersList(int usersAmount) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= usersAmount; i++) {
            result.add("User " + i);
        }
        return result;
    }

    @Nested
    class TestsForPostsAmount {

        @BeforeEach
        void addWhenToMock() {
            when(statistics.usersNames()).thenReturn(generateUsersList(10));
        }

        @Test
        void when0Posts() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.postsCount()).thenReturn(0);
            when(statistics.commentsCount()).thenReturn(0);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(0, calculator.averagePostsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerPost, 0);
        }

        @Test
        void when1000Posts() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.postsCount()).thenReturn(1000);
            when(statistics.commentsCount()).thenReturn(1500);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(100, calculator.averagePostsPerUser, 0);
            assertEquals(150, calculator.averageCommentsPerUser, 0);
            assertEquals(1.5, calculator.averageCommentsPerPost, 0);
        }
    }

    @Nested
    class TestsForCommentsAmount {

        @BeforeEach
        void addWhenToMock() {
            when(statistics.usersNames()).thenReturn(generateUsersList(10));
            when(statistics.postsCount()).thenReturn(100);
        }

        @Test
        void when0Comments() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.commentsCount()).thenReturn(0);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(10, calculator.averagePostsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerPost, 0);
        }

        @Test
        void whenCommentsLessThanPosts() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.commentsCount()).thenReturn(50);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(10, calculator.averagePostsPerUser, 0);
            assertEquals(5, calculator.averageCommentsPerUser, 0);
            assertEquals(0.5, calculator.averageCommentsPerPost, 0);
            assertTrue(calculator.averageCommentsPerPost < 1);
        }

        @Test
        void whenCommentsMoreThanPosts() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.commentsCount()).thenReturn(1000);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(10, calculator.averagePostsPerUser, 0);
            assertEquals(100, calculator.averageCommentsPerUser, 0);
            assertEquals(10, calculator.averageCommentsPerPost, 0);
            assertTrue(calculator.averageCommentsPerPost > 1);
        }
    }

    @Nested
    class TestsForUsersAmount {

        @Test
        void when0Users() {
            //Given
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.usersNames()).thenReturn(generateUsersList(0));
            when(statistics.postsCount()).thenReturn(0);
            when(statistics.commentsCount()).thenReturn(0);

            //When
            calculator.calculateAdvStatistics(statistics);
            calculator.showStatistics();

            //Then
            assertEquals(0, calculator.averagePostsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerUser, 0);
            assertEquals(0, calculator.averageCommentsPerPost, 0);
        }

        @Test
        void when100Users() {
            StatisticsCalculator calculator = new StatisticsCalculator();
            when(statistics.usersNames()).thenReturn(generateUsersList(100));
            when(statistics.postsCount()).thenReturn(100);
            when(statistics.commentsCount()).thenReturn(1000);

            //When
            calculator.calculateAdvStatistics(statistics);

            //Then
            assertEquals(1, calculator.averagePostsPerUser, 0);
            assertEquals(10, calculator.averageCommentsPerUser, 0);
            assertEquals(10, calculator.averageCommentsPerPost, 0);
        }
    }
}
