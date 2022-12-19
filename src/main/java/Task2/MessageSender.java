package Task2;

import lombok.Setter;
import task2.adapted.Client;

import java.time.LocalDate;
import java.util.Objects;

@Setter
public class MessageSender {
    public static boolean send(String text, Client user, String country) {
        if (!Objects.equals(user.getCountry(), country)) {
            System.out.println("Wrong destination country");
            return false;
        } else if (user.getLastActiveTime() == null) {
            System.out.println("Cannot determinate last active time of the user");
            return false;
        }
        LocalDate now = LocalDate.now();
        if (!now.isEqual(user.getLastActiveTime())) {
            System.out.println("Last seen many time ago");
            return false;
        }
        System.out.printf("User (%s) get message : %s", user.getEmail(), text);
        System.out.println("Message successfully sent!");
        return true;
    }
}
