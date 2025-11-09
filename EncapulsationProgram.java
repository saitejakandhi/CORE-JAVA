public class EncapulsationProgram{
    private int acc_no;
    private String AccHolder;
    private int age;
    private String gender;
    private int amount;
    private int withdrawal;
        public int getacc_no(){
            return acc_no;
        }
        public void setacc_no(int acc_no){
            this.acc_no = acc_no;
        }
        public String getAccHolder(){
            return AccHolder;
        }
        public void setAccHolder(String AccHolder){
            this.AccHolder = AccHolder;
        }
        public int getage(){
            return age;
        }
        public void setage(int age){
            this.age = age;
        }
        public String getgender(){
            return gender;
        }
        public void setgender(String gender){
            this.gender = gender;
        }
        public int getamount(){
            return amount;
        }
        public void setamount(int amount){
            this.amount = amount;
        }
        public int getwithdrawal(){
            return withdrawal;
        }
        public void setwithdrawal(int withdrawal){
            this.withdrawal = withdrawal;
        }
    public static void main(String[] args){
        EncapulsationProgram ep = new EncapulsationProgram();
        ep.setacc_no(125465);
        ep.setAccHolder("saileoo");
        ep.setage(20);
        ep.setgender("male");
        ep.setamount(20000);
        ep.setwithdrawal(15000);
        System.out.println("acc_no:" + ep.getacc_no());
        System.out.println("AccHolder:" + ep.getAccHolder());
        System.out.println("age :" +ep.getage());
        System.out.println("gender:" + ep.getgender());
        System.out.println("amount:" + ep.getamount());
        System.out.println("withdrawal:" + ep.getwithdrawal());

    }
}
