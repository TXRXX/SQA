package test;

import labdemo.main.Membership;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testMembership {

    Membership checkMembership;
    @BeforeEach
    void setUp() { checkMembership = new Membership(); }

    @Test
    @DisplayName("TC01: point(100, 0, 0) , Expected = Platinum")
    void testMembershipTC01() {
        int point = checkMembership.calculatePoint(100,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Platinum", status);
    }

    @Test
    @DisplayName("TC02: point(75, 0, 0) , Expected = Gold")
    void testMembershipTC02() {
        int point = checkMembership.calculatePoint(75,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Gold", status);
    }

    @Test
    @DisplayName("TC03: point(50, 0, 0) , Expected = Silver")
    void testMembershipTC03() {
        int point = checkMembership.calculatePoint(50,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Silver", status);
    }

    @Test
    @DisplayName("TC04: point(25, 0, 0) , Expected = Copper")
    void testMembershipTC04() {
        int point = checkMembership.calculatePoint(25,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Copper", status);
    }

    @Test
    @DisplayName("TC05: point(0, 0, 0) , Expected = Zinc")
    void testMembershipTC05() {
        int point = checkMembership.calculatePoint(0,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Zinc", status);
    }

    @Test
    @DisplayName("TC06: point(100, 100, 0) , Expected = Platinum")
    void testMembershipTC06() {
        int point = checkMembership.calculatePoint(100,100,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Platinum", status);
    }

    @Test
    @DisplayName("TC07: point(0, 10, 0) , Expected = Zinc")
    void testMembershipTC07() {
        int point = checkMembership.calculatePoint(0,10,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Zinc", status);
    }

    @Test
    @DisplayName("TC08: point(-1, 0, 0) , Expected = Invalid")
    void testMembershipTC08() {
        int point = checkMembership.calculatePoint(-1,0,0);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Invalid", status);
    }

    @Test
    @DisplayName("TC09: point(-100, 0, 5) , Expected = Invalid")
    void testMembershipTC09() {
        int point = checkMembership.calculatePoint(-100,0,5);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Invalid", status);
    }

    @Test
    @DisplayName("TC10: point(0, 0, 1) , Expected = Zinc")
    void testMembershipTC10() {
        int point = checkMembership.calculatePoint(0,0,1);
        String status = checkMembership.checkMembershipStatus(point);
        assertEquals("Zinc", status);
    }


}
