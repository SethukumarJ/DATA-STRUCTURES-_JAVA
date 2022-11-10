import java.util.*;

public class Sample1 {
    private int[] arr;
    private int max=0;
    private int top=-1;

    Sample1(int max){
        this.max=max;
        arr=new int[max];

    }

    public void push(int data){
        top++;
        arr[top]=data;
    }

    public void pop(){
        arr[top]=0;
        top--;
    }

    public int peak(){

        return arr[top];
    }

    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(arr[i]);
        } 
    }

    public boolean isFull(){
        return (top==max-1);
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public static void main(String[] args){
        int temp;
        System.out.println("Enter the limit of stack : ");
        Scanner sc=new Scanner(System.in);
        temp=sc.nextInt();
        Sample1 obj=new Sample1(temp);
        int choice=0;
        

        while(choice !=4){
            System.out.println("1 for push  :: 2 for pop :: 3 for peak :: 4 for exit the program ");
      
        choice=sc.nextInt();
            switch(choice){
                case 1:
                int val;
                
                if(obj.isFull()){
                    System.out.println("stack is already full");
                }
                else{
                    System.out.println("ENter the value to push :");
                val=sc.nextInt();
                    obj.push(val);

                }
               
                break;

                case 2:
                if(obj.isEmpty()){
                    System.out.println("The stack is emmpty :");

                }
                else{ 
                    obj.pop();

                }
                
                break;

                case 3:
                if(obj.isEmpty()){
                    System.out.println("The stack is emmpty :");

                }
                else{
                    System.out.println(obj.peak());

                }
                break;


            }
            

        }


    }

    
}
