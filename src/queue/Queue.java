package queue;

/**
 * 队列简单模拟 先进先出
 * @author 张君
 */
public class Queue<T> {
    public Node<T> first=new Node<>();
    private Node<T> last=first;
    private Node<T> cursor=first;

    /**
     * 弹出节点，让他们线断掉
     * @return
     */
    public Node<T> pull(){
        //保存下结果
        Node<T> result=first;

        //如果第一个节点有下一个
        if(first.getNext()!=null){
            //那就将下一个节点的上一个节点地址消失
            first.getNext().setLast(null);
            //然后将第一个节点的连接到下一个
            first=first.next;
            //然后设置上一个节点为空(因为这个节点要作为第一个)
            first.setLast(null);
        }
        return result;
    }

    /**
     * 推进去，连线
     * @param t
     * @return
     */
    public Node<T> push(Node<T> t){
        last.next=t;
        t.last=last;
        last=t;
        return t;
    }

    /**
     * 判断是否有下一个
     * @return
     */
    public boolean hasNext(){
        return cursor!=null;
    }

    /**
     * 获得下一个
     * @return
     */
    public Node<T> next(){
        Node<T> resuslt=cursor;
        cursor=cursor.next;
        return resuslt;
    }

}
