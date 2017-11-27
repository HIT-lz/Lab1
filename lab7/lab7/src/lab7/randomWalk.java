/**
 * 
 */
package lab7;

import java.util.Random;

/**
 * @author Administrator
 *
 */
public class randomWalk {
    String text = "";
    public randomWalk(garph G)
    {
        int[] adj = new int[G.reallen]; //储存点的出点
        int [][] mark_edge = new int[G.reallen][G.reallen];//标志边是否被访问
        String temptext = new String();
        int num_adj, ran, i, j, k;
        ran = new Random().nextInt(G.reallen);
        temptext = G.words[ran];
        while (true) {
            j = 0;
            for (i = 0 ; i < G.reallen ; i++)
            {
                if (G.edge[ran][i]!=0) //words[ran]->words[i]存在且未被访问
                {
                    adj[j] = i;
                    j++;
                }
            }
            num_adj = j;
            if (num_adj == 0)
                
                break;
            else
            {
                k = new Random().nextInt(num_adj);
                if (mark_edge[ran][adj[k]] == 0)
                {
                    temptext = temptext + " " + G.words[adj[k]];
                    mark_edge[ran][adj[k]] = 1;
                    ran = adj[k];
                }
            
                
                else
                {
                    temptext = temptext + " " + G.words[adj[k]];
                    break;
                }
            }
        }
        text = temptext;
    }
}
