package GeekTech;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpAddressTest {
    IpAddress ipAddress;

    @BeforeEach
    void setUp() {
        ipAddress=new IpAddress();
    }

    @AfterEach
    void tearDown() {
        ipAddress=null;
    }

    @Test
    void checkIpLength() {
        Assertions.assertTrue(ipAddress.checkIp("255.255.255.25444"));
    }

    @Test
    void checkIpMatchesLetters() {
        Assertions.assertTrue(ipAddress.checkIp("255.255.255.25g"));
    }

    @Test
    void checkIpWrongStart() {
        Assertions.assertTrue(ipAddress.checkIp("0.255.255.25"));
    }

    @Test
    void checkIpWrongEnd() {
        Assertions.assertTrue(ipAddress.checkIp("255.255.255.0"));
    }

    @Test
    void checkIp() {
        Assertions.assertTrue(ipAddress.checkIp("255.255.255.25"));
    }
}