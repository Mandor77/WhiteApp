package org.ascotte.whiteapp.core.engine;

class CoreEngine {

    private String message;

    CoreEngine(String message) {
        this.message = message;
    }

    public static void main(String[] args) {

        CoreEngine engine = new CoreEngine("Hello world");
        engine.process();
    }

    private void process() {
        System.out.println(message + " = " + this.getNumberOfLetters());
    }

    int getNumberOfLetters() {
        return this.message.length();
    }
}
