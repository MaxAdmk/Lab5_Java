package ua.lviv.iot.sentencesEditor;

import java.util.Scanner;

public final class Main {

    private Main() {

    }

    /**
     * The {@code Main} class is the entry point of the program.
     * It allows the user to input a text and uses
     * a {@link TextEditor}
     * object to remove exclamatory sentences with dash words from the text.
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text for redacting: ");
        String text = input.nextLine();

        TextEditor sentencesTextEditor = new TextEditor();
        System.out.println("Updated text: ");
        sentencesTextEditor.
                removeExclamatorySentencesWithDashWords(text);
        input.close();
    }
}
