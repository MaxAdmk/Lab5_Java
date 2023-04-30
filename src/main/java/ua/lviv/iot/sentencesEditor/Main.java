package ua.lviv.iot.sentencesEditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter text for redacting: ");
    String text = input.nextLine();

    Editor sentencesEditor = new Editor();
    System.out.println("Updated text: ");
    System.out.println(sentencesEditor.removeExclamatorySentencesWithDashWords(text));
    input.close();
    }
}