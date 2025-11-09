// method overloading having same name and different parameters....
public class MethodOverloading {
    //  same name "add"
        public static int add(int a,int b){
            return a + b;
        }
        //  different parameters int and double..
        public static double add(double a, double b, double c){
            return a + b + c;
        }
    public static void main(String[] args){
        MethodOverloading method = new MethodOverloading();
        int sum1 = method.add(10, 20);
        double sum2 = method.add(20, 30, 40);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    
}
