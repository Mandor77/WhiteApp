package org.ascotte.whiteapp.core.engine;

public class CoreEngine {

    private String message;

    CoreEngine(String message) {
        this.message = message;
    }

    /**
     * Main class of CoreEngine
     *
     * @args = the input of the main class
     */
    public static void main(String[] args) {

        CoreEngine engine = new CoreEngine("Hello world");
        engine.process();
    }

    private void process() {
        message.chars().forEach(System.out::println);
        System.out.println(message + " = " + this.getNumberOfLetters());
    }

    int getNumberOfLetters() {
        return this.message.length();
    }
}