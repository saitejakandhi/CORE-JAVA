// Method overriding is used for runtime polymorphism.
// If subclass has the same method as declared in the parent class, 
// it is known as method overriding in Java.
class Vehicle{
    public void bike(){
        System.out.println("bike is going......");
    }
}
class superbike extends Vehicle{
    public void bike(){
        System.out.println("bike is going very fast....");
    }

}
public class MethodOverriding {
    public static void main(String[] args){
        superbike sb = new superbike();
        sb.bike();
    }
    
}
