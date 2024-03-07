class Stack{
    int arr[]=new int[5];
    int top;
    int size;
    public Stack(){
        top=-1;
        size=arr.length;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int data){
        top++;
        if(top<size){
            arr[top]=data;
        }else{
            System.out.println("Stack Overflow");
        }
        
    }
    public int peek(){
        return arr[top];
    }
    public void printStack(){
        for(int n:arr){
            System.out.println(n);
        }
        System.out.println();
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            return arr[top--]; //return the value as well as decrease the counter
        }
        
    }
}
public class Question5 {
    public static void main(String args[]){
        Stack s=new Stack();
        System.out.println("The stack is empty:"+s.isEmpty());
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.printStack();

        System.out.println("The popped item is:"+s.pop());


    }
    
}

