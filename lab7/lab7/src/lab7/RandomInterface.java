/**
 * 
 */
package lab7;

/**
 * @author Administrator
 *
 */
public class RandomInterface {
    public RandomInterface(garph G)
    {
        randomWalkControl walkcon = new randomWalkControl(G);
        System.out.println(walkcon.text);
    }
}
