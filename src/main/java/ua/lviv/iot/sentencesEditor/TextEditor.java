package ua.lviv.iot.sentencesEditor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

    /**
     * Removes exclamatory sentences with dash words from the given text.
     *
     * @param text the text to remove sentences from
     * @return the text with exclamatory sentences removed
     * @throws NullPointerException if the input text is null or empty
     */
    public String removeExclamatorySentencesWithDashWords(String text) {
        String regex = "[A-Z][^!.?]*(\\b\\w+-\\w+\\b[^!.?]*){2,}!";

        if (text == "" || text == null) {
            throw new NullPointerException("Input string is empty");
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String sentence = matcher.group();
                //System.out.println(sentence);
                text = text.replace(sentence, "");
            }
            System.out.println(text);
            return text;
        }
    }
}
