import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class garpTest {

    /**
     * Test method for {@link garph#queryBridgeWords(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testQueryBridgeWords() throws IOException {
        garph G = new garph();
        
       //用例一
        assertSame("error2",G.queryBridgeWords("bad","way"));
        //用例二
        assertSame("error3",G.queryBridgeWords("it","good"));
        //用例三
        assertSame("error4",G.queryBridgeWords("it","has"));
        //用例四
        assertEquals("has ,",G.queryBridgeWords("it","been"));
    }

}
