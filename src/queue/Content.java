package queue;

import java.util.LinkedList;

public class Content {
    public static void main(String[] args) {
        Queue<String> queue=new Queue<>();
        Node<String> node=new Node<>();
        node.val="a";

        queue.push(node);


        Node<String> node1=new Node<>();
        node1.val="b";
        queue.push(node1);

        String val = queue.pull().val;
        System.out.println(val);
        String val1 = queue.pull().val;
        System.out.println(val1);
        System.out.println(queue.pull().val);


        while(queue.hasNext()){
            System.out.println(queue.next().val);
        }


    }
}
