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
public class routeInterface {
    public routeInterface() throws IOException
    {
        garph G = new garph();

        String[] path;
        String[] pathout;
        String pathword;
        String reg = "[^\\p{Alpha}]+";
        String inputword = JOptionPane.showInputDialog("Input words: ");
        path = inputword.split(reg);
        if(path.length==1)
        {   
            DijkstraControl D = new DijkstraControl(G,path[0]);
         //   pathword = G.Dijkstra(path[0]);
            pathword = D.route;
            pathout = pathword.split(",");
            for(int i = 0;i < pathout.length;i++)
                System.out.println(pathout[i]);
        }
        
        else if(path.length==2)
        {
    //      System.out.println(G.Dijkstra("it", "long"));
            DijkstraControl D = new DijkstraControl(G,path[0],path[1]);
            System.out.println(D.route);
            System.out.println(G.weight_index);
    //      G.noteDirectedGraph(G,path[0],path[1],G.Dijkstra(path[0], path[1]));
        }
        else
            System.out.println("Wrong!");  
    }
 
}
