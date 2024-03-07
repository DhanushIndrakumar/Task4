import java.util.HashMap;
import java.util.Scanner;

class Student{
    private String name;
    private Integer marks;;
    private HashMap<String ,Integer> reportCards;

    public Student(){
        reportCards=new HashMap<>();
    }
    public void addRecord(String name,Integer marks){
        System.out.println("Adding record");
        reportCards.put(name,marks);
    }
    public void deleteRecord(String name){
        reportCards.remove(name);
    }
    public void displayMarksByName(String name){
        System.out.println(reportCards.get(name));
    }
    public void display(){
        System.out.println(reportCards);
    }
}





public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        //suppose if I want to add 3 records first

        for(int i=0;i<3;i++){
            System.out.println("Enter the name of student "+(i+1));
            String name=sc.nextLine();
            System.out.println("Enter the marks of student "+(i+1));
            Integer marks=sc.nextInt();
            sc.nextLine();
            s.addRecord(name, marks);
        }
        //to delete a record
        System.out.println("Enter the name of student to be deleted:");
        String name=sc.nextLine();
        s.deleteRecord(name);
       
        //to display all records
        s.display();

        //to display a particular student
        System.out.println("Enter the name of student whose marks need to be displayed");
        name=sc.nextLine();
        s.displayMarksByName(name);
        

        
    }
    
}
