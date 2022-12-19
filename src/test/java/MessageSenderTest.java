import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2.Country;
import task2.FacebookUser;
import task2.MessageSender;
import task2.TwitterUser;
import task2.adapted.FacebookClient;
import task2.adapted.TwitterClient;

import java.time.LocalDate;

public class MessageSenderTest {
    @Test
    void sendTest() {
        String message = "HELLO WORLD";
        FacebookClient clientF = new FacebookClient(new FacebookUser("email@gmail.com", Country.Ukraine,
                LocalDate.now()));
        Assertions.assertTrue(MessageSender.send(message, clientF, "Ukraine"));
        Assertions.assertFalse(MessageSender.send(message, clientF, "Afghanistan"));

        TwitterClient clientT = new TwitterClient(new TwitterUser("email@gmail.com", "Ukraine",
                LocalDate.now().toString()));
        Assertions.assertTrue(MessageSender.send(message, clientT, "Ukraine"));
        Assertions.assertFalse(MessageSender.send(message, clientT, "Madagascar"));
    }
}
