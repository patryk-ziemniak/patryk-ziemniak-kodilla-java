package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userM = new Millenials("Millenial");
        User userY = new YGeneration("Y");
        User userZ = new ZGeneration("Z");

        //When
        String socialM = userM.sharePost();
        String socialY = userY.sharePost();
        String socialZ = userZ.sharePost();

        //Then
        assertEquals("Publishing to Facebook...", socialM);
        assertEquals("Publishing to Twitter...", socialY);
        assertEquals("Publishing to Snapchat...", socialZ);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Millenial");

        //When
        user.setSocialPublisher(new SnapchatPublisher());
        String userSocial = user.sharePost();

        //Then
        assertEquals("Publishing to Snapchat...", userSocial);
    }
}
