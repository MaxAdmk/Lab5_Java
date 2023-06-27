package ua.lviv.iot.sentencesEditor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TextEditorTest {

    private Scanner input;
    private TextEditor sentencesTextEditor;

    @BeforeEach
    public void setUp() {
        input = new Scanner(System.in);
        sentencesTextEditor = new TextEditor();
    }

    @AfterEach
    public void tearDown() {
        input.close();
    }

    @Test
    public void testEmptyStringRedacting() {
        String text = null;
        assertThrows(NullPointerException.class, () -> {
            sentencesTextEditor.removeExclamatorySentencesWithDashWords(text);
        });
    }

    @Test
    public void testTextRedacting() {
        String text = "What an amazing view from up here! Holy cow, that's a mouth-watering, finger-licking good burger!" +
                "Yikes, that was a hair-raising, spine-tingling experience!I am an apple.";
        String expectedText = "What an amazing view from up here! I am an apple.";
        sentencesTextEditor.removeExclamatorySentencesWithDashWords(text);
        assertEquals(expectedText, sentencesTextEditor.removeExclamatorySentencesWithDashWords(text));
    }
}