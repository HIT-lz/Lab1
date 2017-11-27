/**
 * 
 */
package lab7;

import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author Administrator
 *
 */
public class queryInterface {
    public queryInterface() throws IOException
    {
        garph G = new garph();
        queryBridgeWordsControl Bri = new queryBridgeWordsControl();
        String answer, word1, word2;
        word1 = JOptionPane.showInputDialog("Input word1: ");
        word2 = JOptionPane.showInputDialog("Input word2: ");
        answer = Bri.BridgeWordsControl(G, word1, word2);
        System.out.println(answer);
        if (answer.equals("error1"))
            System.out.println("No \"" + word1 +"\" and \"" + word2 + "\" in the graph!");
        else if (answer.equals("error2"))
            System.out.println("No \"" + word1 + "\" in the graph!");
        else if (answer.equals("error3"))
            System.out.println("No \"" + word2 + "\" in the graph!");
        else if (answer.equals("error4"))
            System.out.println("No bridge words from\"" + word1 + "\" to \"" + word2 + "\"in the graph!");
        else
            System.out.println("The bridge words from \"" + word1 +"\" to \"" + word2 + "\" is:"+answer);
        return ;
    }
}
