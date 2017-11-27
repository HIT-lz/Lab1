/**
 * 
 */
package lab7;

import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class NewText {
    String generateNewText(String inputText) throws IOException
    {
        String[] temp, Bridge_word;
        String newText,  result;
        garph G = new garph();
        int i, ran;
        String reg = "[^\\p{Alpha}]+";
        temp = inputText.split(reg);
        if (temp.length == 0)
            return "error!";
        newText = temp[0];
        for (i = 1 ; i < temp.length ; i++)
        {
            result = G.queryBridgeWords(temp[i-1], temp[i]);
            Bridge_word = result.split(reg);
            if (result.equals("error1")||result.equals("error2")||result.equals("error3")||result.equals("error4"))
                newText = newText + " " + temp[i];
            else if(Bridge_word.length == 1)
                newText = newText + " " + Bridge_word[0] + " " + temp[i];
            else
            {
                ran = new Random().nextInt(Bridge_word.length);
                newText = newText + " " + Bridge_word[ran] + " " + temp[i];
            }
        }
        return newText;
    }
}
