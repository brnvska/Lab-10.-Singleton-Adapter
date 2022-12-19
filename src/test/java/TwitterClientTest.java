import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.TwitterUser;
import task2.adapted.TwitterClient;

public class TwitterClientTest {
    static TwitterClient client;

    @BeforeEach
    void setUp() {
        client = new TwitterClient(new TwitterUser("email@gmail.com", "Ukraine", "2022-11-27"));
    }

    @Test
    void getEmailTest() {
        Assertions.assertEquals(client.getEmail(), "email@gmail.com");
    }


    @Test
    void getCountryTest() {
        Assertions.assertEquals(client.getCountry(), "Ukraine");
    }

    @Test
    void getLastActiveTimeTest() {
        Assertions.assertNotNull(client.getLastActiveTime());
    }
}
