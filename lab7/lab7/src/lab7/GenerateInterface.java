/**
 * 
 */
package lab7;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class GenerateInterface {
    public GenerateInterface() throws IOException
    {
        garph G = new garph();
        ReadTextGenerateGraphControl Read = new ReadTextGenerateGraphControl(G); 
    }

}
