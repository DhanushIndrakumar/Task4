import java.util.Scanner;

class Voter{
    private String voterId;
    private String name;
    private Integer age;
    
    
    public Voter() {
    }
    public Voter(String voterId, String name, Integer age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
        try{
            if(this.age<18){
                throw new AgeNotValidException("Age must be atleast 18");
            }
        }catch(AgeNotValidException e){
            System.out.println("Setting the default age to 18");
            this.age=18;//setting the default age to 18
        }
    }
    public String getVoterId() {
        return voterId;
    }
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
    }
    
}


public class Question2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the voter id");
        String voterId=sc.nextLine();
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        Integer age=sc.nextInt();
        Voter voter =new Voter(voterId, name, age);
        System.out.println(voter);

    }
    
}
