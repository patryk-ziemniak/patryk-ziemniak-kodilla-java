package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Hello Java", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Hello IntelliJ", text -> text.toUpperCase());
        poemBeautifier.beautify("Hello Git", text -> ".:=" + text + "=:.");
        poemBeautifier.beautify("Hello Gradle", text -> "_-=" + text + "=-_");
    }
}