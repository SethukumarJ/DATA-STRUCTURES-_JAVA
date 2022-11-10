public class MarkList {
    static class Node {
        int data;
        String name;
        Node left, right;

        Node(int data, String name) {
            this.data = data;
            this.name = name;
        }
    }

    Node root;

    public void insert(String name,int data) {
        Node currentNode = root;

        if (currentNode == null) {
            root = new Node(data,name);
            return;
        }

        while (true) {
            if (data < currentNode.data) {

                if (currentNode.right == null) {
                    currentNode.right = new Node(data,name);
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            } else {
                if (currentNode.left == null) {
                    currentNode.left = new Node(data,name);
                    break;
                } else {
                    currentNode = currentNode.left;
                }

            }
        }
    }

    public void inorder() {
        inorderHelper(root,0);

    }

    public int inorderHelper(Node node, int i) {

        if(node != null){
            

           i= inorderHelper(node.left,i);
            
            i++;
            System.out.println(i+" : "+  node.name  + node.data);
          
           i= inorderHelper(node.right,i);
          


        }
        return i;

    }
    public void markSearch(String name) {
        searchHelper(root,name);

    }

    public void searchHelper(Node node, String name) {

        if(node != null){

            searchHelper(node.left,name);
            if(name == node.name){
                System.out.println(name +" : " + node.data);
            }else{
                searchHelper(node.right,name);
            }
                
           


        }

    }


    public static void main(String[] args) {

        MarkList list = new MarkList();

        list.insert("sethu",40);
        list.insert("rahul",80);
        list.insert("dolu",100);
        list.insert("bolu",50);
        list.insert("pathlu",60);

        list.inorder();
        // list.markSearch("rahul");
    }
}
