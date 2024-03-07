import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String days[]=new String[7];
        Scanner sc=new Scanner(System.in);
        //trying to store the array elements
        for(int i=0;i<days.length;i++)
        {
            System.out.println("Enter day "+(i+1));
            days[i]=sc.nextLine();
        }
        for(int i=0;i<=days.length;i++)//Intentionally i<=days.length inorder to handle the error
        {
            try{
                System.out.println(days[i]);
            }catch(Exception e){
                System.out.println("The seven days of the week is printed");
                System.out.println("The error:"+e);
            }
            
        }
    }
    
}
