import java.util.*;
class Stack{
    private char[] arr;
    private int max=0;
    private int top=-1;
    Stack(int max){
        this.max = max;
        arr = new char[max];
    }
    public void push(char data){
        top++;
        arr[top] = data;
    }
    public void pop(){
        arr[top]=0;
        top--;
    }
    public char peak(){
        return arr[top];
    }
    public void display(){

        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public boolean isFull(){
        return (top == max -1);
    }
    public boolean isEmpty(){
        return (top ==-1);
    }

}
public class Delimitter {

    public static void main(String[] args) {
        
    }
    
}
