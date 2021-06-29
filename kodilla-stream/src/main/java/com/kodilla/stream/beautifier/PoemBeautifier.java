package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator decorator) {
        System.out.println(decorator.decorate(text));
    }
}
