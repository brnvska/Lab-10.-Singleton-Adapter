import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.TwitterUser;

public class TwitterUserTest {
    static TwitterUser user;

    @BeforeEach
    void setUp() {
        user = new TwitterUser("email@gmail.com", "UAE", "2022-11-27");
    }

    @Test
    void getUserMailTest() {
        Assertions.assertEquals(user.getUserMail(), "email@gmail.com");
    }


    @Test
    void getCountryTest() {
        Assertions.assertEquals(user.getCountry(), "UAE");
    }

    @Test
    void getLastActiveTimeTest() {
        Assertions.assertNotNull(user.getLastActiveTime());
    }
}
