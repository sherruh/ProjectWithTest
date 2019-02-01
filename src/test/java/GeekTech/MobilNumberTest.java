package GeekTech;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilNumberTest {

    MobilNumber mobilNumber;

    @BeforeEach
    void setUp() {
        mobilNumber=new MobilNumber();
    }

    @AfterEach
    void tearDown() {
        mobilNumber=null;
    }

    @Test
    void checkNumberFirstDigit() {
        Assertions.assertTrue(mobilNumber.checkNumber("1700000995"));
    }

    @Test
    void checkNumberMatchLetter() {
        Assertions.assertTrue(mobilNumber.checkNumber("07i0000995"));
    }

    @Test
    void checkNumberLength() {
        Assertions.assertTrue(mobilNumber.checkNumber("07000009950"));
    }

    @Test
    void checkNumber() {
        Assertions.assertTrue(mobilNumber.checkNumber("0700000995"));
    }
}