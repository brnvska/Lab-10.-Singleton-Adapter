import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.Country;
import task2.FacebookUser;
import task2.TwitterUser;

import java.time.LocalDate;

public class FacebookUserTest {
    static FacebookUser user;

    @BeforeEach
    void setUp() {
        user = new FacebookUser("email@gmail.com", Country.Poland, LocalDate.now());
    }

    @Test
    void getEmailTest() {
        Assertions.assertEquals(user.getEmail(), "email@gmail.com");
    }


    @Test
    void getUserCountryTest() {
        Assertions.assertEquals(user.getUserCountry(), Country.Poland);
    }

    @Test
    void getGetUserActiveTimeTest() {
        Assertions.assertNotNull(user.getGetUserActiveTime());
    }
}

