package test.java;

import main.java.ua.lviv.iot.sentencesEditor.Editor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SentenceEditorTest {

    private Scanner input;
    private Editor sentencesEditor;

    @BeforeEach
    public void setUp(){
        input = new Scanner(System.in);
        sentencesEditor = new Editor();
    }

    @AfterEach
    public void tearDown(){
        input.close();
    }

    @Test
    public void testEmptyStringRedactoring(){
        String text = null;
        assertThrows(NullPointerException.class, () -> {sentencesEditor.removeExclamatorySentencesWithDashWords(text);});
    }

    @Test
    public void testTextRedacting(){
        String text = "What an amazing view from up here! Holy cow, that's a mouth-watering, finger-licking good burger!" +
                "Yikes, that was a hair-raising, spine-tingling experience!I am an apple.";
        String expcectedText = "What an amazing view from up here! I am an apple.";
        sentencesEditor.removeExclamatorySentencesWithDashWords(text);
        assertEquals(expcectedText, sentencesEditor.removeExclamatorySentencesWithDashWords(text));
    }

}