/** 
 * @author Woolbright
 * @version 2008
 */
public class Doggy extends Animal2
{
    /**
     * Constructor for objects of class Doggy
     */
    public Doggy()
    {
        super();
        setBehavior(new Barking(), new Run());
    }

    /**
     * Constructor for objects of class Doggy
     */
    public Doggy(String name)
    {
        super(name);
        setBehavior(new Barking(), new Run());
    }
}

