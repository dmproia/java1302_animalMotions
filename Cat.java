/** 
 * @author Paul watson
 * @version 2012
 */
public class Cat extends Animal2
{
    /**
     * Constructor for objects of class Cat
     */
    public Cat()
    {
        super();
        setBehavior(new Meowing(), new Walk());
    }

    /**
     * Constructor for objects of class Cat
     */
    public Cat(String name)
    {
        super(name);
        setBehavior(new Meowing(), new Walk());
    }
}

