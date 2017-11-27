/**
 * 
 */
package lab7;

import javax.swing.JOptionPane;
import java.io.*;
/**
 * @author Administrator
 *
 */
public class newTextInterface {
    public newTextInterface() throws IOException
    {
        String inputText = JOptionPane.showInputDialog("Input text: ");
        generateNewTextControl New = new generateNewTextControl(inputText);
        System.out.println(New.newtext);   
    }

}
