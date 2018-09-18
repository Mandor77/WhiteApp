package org.ascotte.whiteapp.core.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoreEngineTest {

    @Test
    final void single_word_should_succeed() {

        CoreEngine engine = new CoreEngine("Prototype");

        int numberOfLetters = engine.getNumberOfLetters();

        assertEquals(numberOfLetters, 9);
    }
}
