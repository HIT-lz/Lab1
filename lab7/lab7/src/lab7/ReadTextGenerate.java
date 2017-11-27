/**
 * 
 */
package lab7;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class ReadTextGenerate {
    
    public ReadTextGenerate()
    {
        ;
    }
    
    public void showDirectedGraph(garph G)
    {
       GraphViz gv = new GraphViz();
       gv.addln(gv.start_graph());
       for(int i=0;i<G.reallen;i++)
       {
           for(int j=0;j<G.reallen;j++)
           {
               if(G.edge[i][j]>0)
               {
               gv.addlnlabel(G.words[i]+"->"+G.words[j],""+G.edge[i][j]);
               }
           }
       }
    
       
       //gv.addln("A -> C;");
       gv.addln(gv.end_graph());
       System.out.println(gv.getDotSource());
      
       
  //     String type = "gif";
//       String type = "dot";
//       String type = "fig";    // open with xfig
      // String type = "pdf";
//       String type = "ps";
//       String type = "svg";    // open with inkscape
       String type = "png";
//       String type = "plain";
  //     File out = new File("/tmp/out." + type);   // Linux
       File out = new File("E://graph1" + type);    // Windows
       gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
    }
}
