/** 
 * @author Woolbright
 * @version 2008
 */
public class Cow extends Animal2
{
    /**
     * Constructor for objects of class Cow
     */
    public Cow()
    {
        super();
        setBehavior(new Mooing(), new Fly());
    }

    /**
     * Constructor for objects of class Cow
     */
    public Cow(String name)
    {
        super(name);
        setBehavior(new Mooing(), new Fly());
    }
}

