/**
 * 
 */
package lab7;

/**
 * @author Administrator
 *
 */
public class randomWalkControl {
    String text = "";
    public randomWalkControl(garph G)
    {
        randomWalk walkpath= new randomWalk(G);
        text = walkpath.text;
    }

}
