package task2.adapted;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveTime();
}
