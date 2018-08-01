package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        /*PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Litwo, ojczyzno moja", (string -> "***" + string + "***"));
        poemBeautifier.beautify("Ty jesteś jak zdrowie", (string -> string.toUpperCase()));
        poemBeautifier.beautify("Ile Cię trzeba cenić", (string -> "& Ile & Cię & trzeba & cenić &"));
        poemBeautifier.beautify("Ten tylko się dowie", (string -> string.concat("!!!")));*/

        Forum forum = new Forum();

        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("Number of users: " + usersMap.size());
        usersMap.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }
}