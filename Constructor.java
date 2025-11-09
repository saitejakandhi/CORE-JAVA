public class Constructor {
    String name;
    int age;
    String Gender;
    String email;
    public void constructor(String name,int age,String Gender,String email){
        this.name = name;
        this.age = age;
        this.Gender = Gender;
        this.email = email;
    }
    public void display(){
        System.out.println("Name:" + name + " "+ "Age:" + age +" "+ "Gender:" + Gender +" "+ "email:" + email);
    }
    public static void main(String[] args){
        Constructor cns = new Constructor();
        cns.constructor("saileoo", 20, "male", "mani123@gmail.com");
        cns.display();

      }
    
}
