import java.util.Scanner;

import javax.naming.NameNotFoundException;

class Student{
    private Integer rollNo;
    private String name;
    private Integer age;
    private String course;
    public Student() {
    }
    public Student(Integer rollNo, String name, Integer age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public Integer getRollNo() {
        return rollNo;
    }
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
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
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
    } 


}


public class Question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of the student:");
        System.out.println("Enter the roll Number of the student");
        int rollNo=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the name of the student");
        String name=sc.next();;
        try{ 
            if(name.matches(".*[0-9!@#$%^&*()-_=+{};:'\"|,.?`~\\\\/]+.*")){
                throw new NameNotValidException("Invalid name entered");
            }
        }catch(NameNotValidException e){
            name="Dhanush";//setting the default name;
        }
        System.out.println("Enter the age of the student:");
        int  age=sc.nextInt();
        try{
           
            if(age<15||age>21){
                throw new AgeNotWithinRangeException("Age is not within range");
            }

        }
        catch(AgeNotWithinRangeException e){
            age=16;//setting the default age;
        }
        sc.nextLine();
        System.out.println("Enter the course of the student:");
        String course=sc.nextLine();
        Student student=new Student(rollNo,name,age,course);
        System.out.println(student);
        

       

        
    }
}