package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {
        users.add(new ForumUser(7429, "Alicja96", 'F', LocalDate.of(1996, 12, 7), 5));
        users.add(new ForumUser(1839, "Geralttt", 'M', LocalDate.of(2007, 4, 30), 42));
        users.add(new ForumUser(924, "HenryJonesJr", 'M', LocalDate.of(1971, 6, 1), 1));
        users.add(new ForumUser(6326, "Eunice", 'F', LocalDate.of(1991, 9, 2), 10));
        users.add(new ForumUser(4402, "MaxiKaz", 'M', LocalDate.of(1996, 12, 16), 2));
        users.add(new ForumUser(5199, "Jan_Kowalski", 'M', LocalDate.of(1980, 3, 22), 0));
        users.add(new ForumUser(7300, "Lukasz89", 'M', LocalDate.of(1989, 9, 9), 17));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
    }
}
