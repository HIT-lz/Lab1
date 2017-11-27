/**
 * 
 */
package lab7;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class generateNewTextControl {
    String newtext = "";
    public generateNewTextControl(String inputText) throws IOException
    {
        NewText New= new NewText();
        newtext = New.generateNewText(inputText);
    }

}
