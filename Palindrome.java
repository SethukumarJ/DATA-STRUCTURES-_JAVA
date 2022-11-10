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
public class Palindrome {

    public static void main(String[] args) {
        String word;
        System.out.println("Enter the word to check: ");
        Scanner input = new Scanner(System.in);
        word = input.nextLine();
        Stack obj = new Stack(word.length());
        for(int i=0;i<word.length();i++){
            obj.push(word.charAt(i));
        }
        boolean flag = true;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i) != obj.peak()){
                flag = false;

            }
            obj.pop();
            
        }
        if(flag == true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
