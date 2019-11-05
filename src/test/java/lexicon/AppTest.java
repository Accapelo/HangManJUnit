package lexicon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void positionOfLetterInRightAnswer()
    {
        //Arrange
        char guess= 'o';
        String answer = "Pony";
        int expect = 1;

        //Act
        int result = App.compareLetter(guess,answer);

        //Assert
        assertEquals(expect,result);

        //Arrange
        char guess2= 'i';
        String answer2 = "Pony";
        int expect2 = -1;

        //Act
        int result2 = App.compareLetter(guess2,answer2);

        //Assert
        assertEquals(expect2,result2);


    }

    @Test
    public void isInputRightWord()
    {
        //Arrange
        String guess3 = "hOpE";
        String answer3 = "hope";
        //boolean expect3 = true;

        //Act
        boolean result3 = App.compareWords(guess3,answer3);

        //Assert
        assertTrue(result3);

        //Arrange
        String guess4 = "h0pE";
        String answer4 = "hope";
        //boolean expect4 = false;

        //Act
        boolean result4 = App.compareWords(guess4,answer4);

        //Assert
        assertFalse(result4);
    }

}
