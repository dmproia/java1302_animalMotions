/**
 * The Animal class is the superclass of all Animals.
 * 
 * @author Woolbright
 * @version 2008
 * 
 * 
 * Updates by Paul Watson 2012
 */
public class AnimalRunner
{
    public static void main(String[] args)
    {
        Cow myCow = new Cow();
        myCow.setBehavior(new Mooing(), new Run());

        Doggy myDoggy = new Doggy();
        myDoggy.setBehavior(new Barking(), new Run());

        System.out.println("Tell my cow to speak and move:");
        myCow.speak();
        myCow.move();
System.out.println();

        System.out.println("Tell my doggy to speak and move:");
        myDoggy.speak();
        myDoggy.move();
System.out.println();
        
        myCow.setBehavior(new Barking(), new Fly());
        System.out.println("Tell my weird cow to speak and move:");
        myCow.speak();
        myCow.move();
System.out.println();
        
        Cat myCat = new Cat();
        myCat.setBehavior(new Meowing(), new Walk());

        System.out.println("Ask my cat to speak and move:");
        myCat.speak();
        myCat.move(); 
        System.out.println();
    }      
}
