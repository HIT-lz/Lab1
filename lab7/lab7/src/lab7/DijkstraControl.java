/**
 * 
 */
package lab7;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class DijkstraControl {
    String route = "";
    public DijkstraControl(garph G,String word1) throws IOException
    {
        Dijkstrapath D = new Dijkstrapath();
        route = D.Dijkstra(G, word1);
    }
    public DijkstraControl(garph G,String word1,String word2) throws IOException
    {
        Dijkstrapath D = new Dijkstrapath();
        route = D.Dijkstra(G, word1,word2);
    }
    

}
