
/**
 * Write a description of class IntTest here.
 *
 * @author Charlie Chen
 * @version 09/02/2023
 */
public class IntTest
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;
    /**
     * Constructor for objects of class IntTest
     */
    public IntTest()
    {
        // initialise instance variables
        x = 1;
        y = 2;
        System.out.println(x);
        System.out.println(y);
        
        x += 1;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        
        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        System.out.println(y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
