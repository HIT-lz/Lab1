/**
 * 
 */
package lab7;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class queryBridgeWordsControl {

    public String BridgeWordsControl(garph G,String word1, String word2) throws IOException
    {
        BridgeWords Bri = new BridgeWords();
        return Bri.queryBridgeWords(G,word1, word2);
    }
}
