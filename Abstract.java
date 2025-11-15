// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.
abstract class vehicle{
abstract void run();
}
class superbike extends vehicle{
    void run(){
        System.out.println("superbike is running...");
    }
}
public class Abstract {
    public static void main(String[] args){
        superbike vh = new superbike();
        vh.run();

    }
    
}
