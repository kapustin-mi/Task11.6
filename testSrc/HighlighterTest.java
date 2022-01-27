import cs.vsu.ru.kapustin.Highlighter;
import cs.vsu.ru.kapustin.Utils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class HighlighterTest {
    File inputFile;
    File outputFile;
    Highlighter highlighter = new Highlighter();

    @Test
    public void highlightTextWithOnePairOfBrackets() throws FileNotFoundException {
        inputFile = new File("testSrc/testFiles/answerForHighlighterTestWithOnePairOfBrackets.txt");
        String text = Utils.readTextFromFile(inputFile);
        String actualText = highlighter.highlightText(text);

        outputFile = new File("testSrc/testFiles/answerForHighlighterTestWithOnePairOfBrackets.txt");
        String expectedText = Utils.readTextFromFile(outputFile);
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void highlightTextWithTwoPairsOfBrackets() throws FileNotFoundException {
        inputFile = new File("testSrc/testFiles/inputForHighlighterTestWithTwoBrackets.txt");
        String text = Utils.readTextFromFile(inputFile);
        String actualText = highlighter.highlightText(text);

        outputFile = new File("testSrc/testFiles/answerForHighlighterTestWithTwoBrackets.txt");
        String expectedText = Utils.readTextFromFile(outputFile);
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void highlightTextWithBracketsWithBrackets() throws FileNotFoundException {
        inputFile = new File("testSrc/testFiles/inputForHighlighterTestWithBracketsWithBrackets.txt");
        String text = Utils.readTextFromFile(inputFile);
        String actualText = highlighter.highlightText(text);

        outputFile = new File("testSrc/testFiles/answerForHighlighterTestWithBracketsWithBrackets.txt");
        String expectedText = Utils.readTextFromFile(outputFile);
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void highlightTextWithThreePairsOfBrackets() throws FileNotFoundException {
        inputFile = new File("testSrc/testFiles/inputForHighlighterTestWithThreePairsOfBrackets.txt");
        String text = Utils.readTextFromFile(inputFile);
        String actualText = highlighter.highlightText(text);

        outputFile = new File("testSrc/testFiles/answerForHighlighterTestWithThreePairsOfBrackets.txt");
        String expectedText = Utils.readTextFromFile(outputFile);
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void highlightTextWithFourPairsOfBrackets() throws FileNotFoundException {
        inputFile = new File("testSrc/testFiles/inputForHighlighterTestWithFourPairsOfBrackets.txt");
        String text = Utils.readTextFromFile(inputFile);
        String actualText = highlighter.highlightText(text);

        outputFile = new File("testSrc/testFiles/answerForHighlighterTestWithFourPairsOfBrackets.txt");
        String expectedText = Utils.readTextFromFile(outputFile);
        Assert.assertEquals(expectedText, actualText);
    }
}