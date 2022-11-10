import java.util.*;


// public class Stack {
//     private char[] arr;
//     private int top = -1;
//     private int max;

//     Stack(int max) {
//         this.max = max;
//         arr = new char[max];

//     }

//     public void push(char data) {

//         top++;
//         arr[top] = data;

//     }

//     public void pop() {
//         arr[top] = 0;
//         top--;
//     }

//     public char peak() {
//         return arr[top];
//     }

//     public boolean isFull() {
//         return top == max - 1;
//     }

//     public boolean isEmpty() {
//         return top == -1;
//     }

//     public void display() {
//         for (int i = 0; i < top; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

public class Paliondrome3 {

   

    public static void main(String[] args) {

        String word;
        System.out.println("enter the word to check whether paliondrome or not");
        Scanner in = new Scanner(System.in);
        word = in.nextLine();

        Stack stack = new Stack(word.length());
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean flag = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.peak()) {
                flag = false;
            }
            stack.pop();
        }

        if (flag == true) {
            System.out.println("paliondrome");

        } else {
            System.out.println("not paliondrome");
        }

    }

}
