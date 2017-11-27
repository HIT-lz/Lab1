/**
 * 
 */
package lab7;

import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class Dijkstrapath {
    public String Dijkstra(garph G,String word1) throws IOException
    {  
         //  System.out.print(reallen);
           int n , degree, degree2;  
           int minweight = G.MAX_WEIGHT;  
           int minUn = 0;
           for (n = 0;n < G.words.length ; n++)
               if (G.words[n] == null)
               {
                    break;
               }
        //       else
        //           System.out.println(words[n]);
                  
           int [][] edge2 = new int[n][n];
           int[] minmatrix = new int[n];// 存放当前起始点0到其余各个顶点的距离；  
           boolean[] isS = new boolean[n];// 判断各个是否被访问过  
           String[] route = new String[n];// 每个字符串是显示对应终止顶点最短距离的路径；
           int word1_index = G.match(G.words,word1);
    //     System.out.print("word1_index  ");
    //     System.out.println(n);
           String sentence = "";
        //   Stringbuilder
           if (word1_index == -1)
               return "ERROR";
           for (int i = 0 ; i < n ;i++) 
           {
                for (int j = 0 ; j < n ; j++)
                {
                    edge2[i][j]=G.edge[i][j];
                    if((i!=j)&&(edge2[i][j]==0))
                        edge2[i][j] = G.MAX_WEIGHT;
                }       
                
            }
           for (int i = 0; i < n; i++) 
           if(i!=word1_index){// 初始化  
           //    System.out.print(word1_index);
               minmatrix[i] = edge2[word1_index][i];  
               isS[i] = false;  
               route[i] = G.words[word1_index] +"->" + G.words[i];    
           }  
           degree2 = word1_index;
           for (int i = 0; i < n; i++) 
           {             
           // 选择 当前 和起点 连通的，且值最小的顶点；  
               degree = word1_index;
               for (int k = 0; k < n; k++) 
               {                 
                   if ((!isS[degree]) &&(degree != word1_index))
                   {                 
                       if (minmatrix[degree] < minweight) 
                       {  
                           minweight = minmatrix[degree];                            
                           minUn = degree;                   
                       }             
                   }  
                   degree = (degree + 1)%n;
               }             
               isS[minUn] = true;// 将该点设置为已访问；      
               degree2 = word1_index;
               for (int j = 0; j < n; j++) 
               {     
                   if (!isS[degree2]) 
                   {// 判断：该顶点还没加入到S中/属于U-S；                      
                       if (minweight + edge2[minUn][degree2] < minmatrix[degree2]) 
                       {                     
                       // 通过当下最小值 访问到得其他顶点的距离小于原先的最小值 则进行交换值                     
                           minmatrix[degree2] = minweight + edge2[minUn][degree2];                       
                           route[degree2] = route[minUn] + "->" + G.words[degree2];            
                       }             
                   }  
                   degree2 = (degree2 + 1)%n;
               }  
               minweight = G.MAX_WEIGHT;// 因为要放到下一个循环中，所以一定要重设置一下，回到最大值            
           }         
           for (int m = 0; m < n; m++) 
           {  
               if(m!=word1_index)              
           
                    if (minmatrix[m] == G.MAX_WEIGHT) 
                    {     
                        System.out.println("没有到达该点的路径");             
                    } 
                    else 
                    {            
                            sentence=sentence+route[m]+",";     
                       //System.out.println(route[m]);                     
                    } 
                }  
             
        //   }  
        //   System.out.println(sentence);
           return sentence;
             
    }
    public String Dijkstra(garph G,String word1,String word2) throws IOException
    {  
           int n = G.reallen, degree, degree2;  
           int minweight = G.MAX_WEIGHT;  
           int minUn = 0; 
           int [][] edge2 = new int[G.reallen][G.reallen];
           int[] minmatrix = new int[G.reallen];// 存放当前起始点0到其余各个顶点的距离；  
           boolean[] isS = new boolean[n];// 判断各个是否被访问过  
           String[] route = new String[n];// 每个字符串是显示对应终止顶点最短距离的路径；    
           int word1_index = G.match(G.words,word1);
           if (word1_index == -1)
               return "ERROR";
           int word2_index = G.match(G.words,word2);
           if (word2_index == -1)
               return "ERROR";
           for (int i = 0 ; i < G.reallen ;i++) 
           {
                for (int j = 0 ; j < G.reallen ; j++)
                {
                    edge2[i][j]=G.edge[i][j];
                    if((i!=j)&&(edge2[i][j]==0))
                        edge2[i][j]=G.MAX_WEIGHT;
                }       
                    
            }
         //  System.out.print(reallen);
           for (int i = 0; i < n; i++) 
           if(i!=word1_index){// 初始化  
               minmatrix[i] = edge2[word1_index][i];  
               isS[i] = false;  
               route[i] = G.words[word1_index] +"->" + G.words[i];    
           }  
           degree2 = word1_index;
           for (int i = 0; i < n; i++) 
           {             
           // 选择 当前 和起点 连通的，且值最小的顶点；  
               degree = word1_index;
               for (int k = 0; k < n; k++) 
               {                 
                   if ((!isS[degree]) &&(degree != word1_index))
                   {                 
                       if (minmatrix[degree] < minweight) 
                       {  
                           minweight = minmatrix[degree];                            
                           minUn = degree;                   
                       }             
                   }  
                   degree = (degree + 1)%G.reallen;
               }             
               isS[minUn] = true;// 将该点设置为已访问；      
               degree2 = word1_index;
               for (int j = 0; j < n; j++) 
               {     
                   if (!isS[degree2]) 
                   {// 判断：该顶点还没加入到S中/属于U-S；                      
                       if (minweight + edge2[minUn][degree2] < minmatrix[degree2]) 
                       {                     
                       // 通过当下最小值 访问到得其他顶点的距离小于原先的最小值 则进行交换值                     
                           minmatrix[degree2] = minweight + edge2[minUn][degree2];                       
                           route[degree2] = route[minUn] + "->" + G.words[degree2];            
                       }             
                   }  
                   degree2 = (degree2 + 1)%G.reallen;
               }  
               minweight = G.MAX_WEIGHT;// 因为要放到下一个循环中，所以一定要重设置一下，回到最大值
               
           }
           G.weight_index=minmatrix[word2_index];
         return  route[word2_index];
         
             
    }  
}
