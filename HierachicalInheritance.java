class Vehicle{
    void pulsar(){
        System.out.println("pulsar bike speed is 120....");
    }
}
class superbike extends Vehicle{
    void ktm(){
        System.out.println("ktm speed is 150....");
    }
}
class superxbike extends Vehicle{
    void Honda(){
        System.out.println("Honda speed is 200...");
    }
}



public class HierachicalInheritance {
    public static void main(String[] args){
        superxbike sb = new superxbike();
        sb.Honda();
        sb.pulsar();
    }
    
}
