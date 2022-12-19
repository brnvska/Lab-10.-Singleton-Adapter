package Task2.fixed;

import task2.FacebookUser;

import java.time.LocalDate;

public class FacebookClient implements Client {
    private final FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return String.valueOf(user.getUserCountry());
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
