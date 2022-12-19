import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.Country;
import task2.FacebookUser;
import task2.adapted.FacebookClient;


import java.time.LocalDate;

public class FacebookClientTest {
    static FacebookClient client;

    @BeforeEach
    void setUp() {
        client = new FacebookClient(new FacebookUser("email@gmail.com", Country.Ukraine, LocalDate.now()));
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
