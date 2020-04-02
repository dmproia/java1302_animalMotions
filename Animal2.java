/**
 * The Animal class is the superclass of all Animals.
 * 
 * @author Woolbright
 * @version 2008
 * 
 * 
 * Updates by Paul Watson 2012
 */
public abstract class Animal2
{
    // instance variables 
    private String name;
    private SpeakBehavior b1;
    private MoveBehavior b2;
    /**
     * Constructor for objects of class Animal2
     */
    public Animal2()
    {
        // initialise instance variables
        name = "";
        setBehavior(null, null);
    }

    /**
     * Constructor for objects of class Animal2
     */
    public Animal2(String name)
    {
        // initialise instance variables
        this.name = name;
        setBehavior(null, null);
    }

    public void sleep()
    {
        System.out.println("I am sleeping.");
    }

    public void speak()
    {
        if (b1 != null)
            b1.speak(); 
        else
            System.out.println("I can't speak ... Wha?");
    }

    public void move()
    {
        if (b2 != null)
            b2.move();
        else
            System.out.println("I can't move Help");
    }

    public void setBehavior(SpeakBehavior sb, MoveBehavior mb)
    {
        b1 = sb;
        b2 = mb;
    }   
}

