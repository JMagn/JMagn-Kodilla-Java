package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Litwo, ojczyzno moja", (string -> "***" + string + "***"));
        poemBeautifier.beautify("Ty jesteś jak zdrowie", (string -> string.toUpperCase()));
        poemBeautifier.beautify("Ile Cię trzeba cenić", (string -> "& Ile & Cię & trzeba & cenić &"));
        poemBeautifier.beautify("Ten tylko się dowie", (string -> string.concat("!!!")));
    }
}