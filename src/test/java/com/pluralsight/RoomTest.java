package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        Room testRoom = new Room(true, true, 12.00, 3);
        boolean result = testRoom.isAvailable();
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        Room testCheck = new Room(true, true, 12.00, 3);
        boolean result = testCheck.isAvailable();
        assertTrue(result);
    }
    @org.junit.jupiter.api.Test
    void cleanRoom() {
        Room testCheck = new Room(true, true, 12.00, 3);
        boolean result = testCheck.isAvailable();
        assertTrue(result);
    }

}