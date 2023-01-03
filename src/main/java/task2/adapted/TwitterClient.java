package task2.adapted;

import task2.TwitterUser;

import java.time.LocalDate;
import java.util.Date;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return this.user.getUserMail();
    }

    @Override
    public String getCountry() {
        return this.user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(this.user.getLastActiveTime());
    }
}