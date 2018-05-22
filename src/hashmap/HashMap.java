package hashmap;

public class HashMap<K,V> {
    Node<K,V> first=new Node<>();
    Node<K,V> last=first;
    Node<K,V> cursor=first;
    public void put(K k,V v){
        Node<K,V> node=first;
        //如果第一个节点的key和传过来的一致,那就设置值进去
        if(first.getKey()!=null&&first.getKey().equals(k)){
            first.setValue(v);
            return;
        }
        //不断遍历下一个，如果key一致，就放值进去
        while((node=node.next)!=null){
            if(node.getKey().equals(k)){
                node.setValue(v);
                return;
            }
        }
        Node<K,V> kvNode =new Node<>();
        kvNode.setKey(k);
        kvNode.setValue(v);
        last.setNext(kvNode);
        kvNode.setLast(last);
        last=kvNode;
    }

    public V get(K k){
        Node<K,V> node=first;
        if(first.getKey()!=null&&first.getKey().equals(k)){
            return first.getValue();
        }

        while((node=node.next)!=null){
            if(node.getKey().equals(k)){
                return node.getValue();
            }
        }
        return null;
    }

    public boolean hasNext(){
        return cursor!=null;
    }
    public Node<K,V> next(){
        Node<K,V> result=cursor;
        cursor=cursor.next;
        return result;
    }

}
