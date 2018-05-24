package hashmap;

import java.util.Arrays;

/**
 * 数组＋单链表(hashmap)
 * @author 张君
 */
public class HashMap<K,V> {
    Node<K,V>[] bucket=new Node[2];
    int size=1;
    Node<K,V> cursor=bucket[0];

    public void put(K k,V v){

        //先检测大小是否足够
        //如果大小不够就扩容
        if(!checkSize()){
            capacity();
        }
        //先判断计算出来的索引位置是否有数据

        //如果没有数据直接填进去,然后返回
        if(bucket[indexFor(k)]==null){
            bucket[indexFor(k)]=new Node<>(k,v);
            size++;
            return;
        }

        //走到这里说明指定索引有数据，然后就往指定位置的链表中填入数据
        for(Node<K,V> node=bucket[indexFor(k)];node!=null;node=node.next){
            //如果链表中有节点的key和我们放进去的一致，那就直接替换掉值
            if(k.hashCode()==node.getKey().hashCode()&&k.equals(node.getKey())){
                node.setValue(v);
                return;
            }
            //走到这里说明链表没有key和传递过去的key一致，那就添加节点到末端
            if(node.next==null){
                //那就加入到节点中
                Node<K,V> newNode=new Node<>(k,v);
                newNode.setLast(node);
                node.setNext(newNode);
                return;
            }
        }
    }

    public V get(K k){
        System.out.println(Arrays.toString(bucket));
        //如果指定索引的对象的key与我们传递过来的一致，那这个就是我们想要的
        if(bucket[indexFor(k)]!=null&&bucket[indexFor(k)].getKey().hashCode()==k.hashCode()&&k.equals(bucket[indexFor(k)].getKey())){
            return bucket[indexFor(k)].getValue();
        }

        //走到这里了就说明数组中没有我们想要的，那我们就在指定索引下的链表中遍历查找
        for(Node<K,V> node=bucket[indexFor(k)];node!=null;node=node.next){
            if(k.hashCode()==node.getKey().hashCode()&&k.equals(node.getKey())){
                return node.getValue();
            }
        }
        return null;
    }

    //计算索引
    public int indexFor(K k){
        return k.hashCode()&(bucket.length-1);
    }

    //扩容方法
    public void capacity(){
        Node<K,V>[] newBucket=new Node[bucket.length*2];

        for(int i=0;i<size;i++){
            newBucket[i]=bucket[i];
        }
        bucket=newBucket;
    }
    //检测容量是否足够
    public boolean checkSize(){
        return size<bucket.length;
    }

    //判断是否有下一个
    public boolean hasNext(){
        return cursor.next!=null;
    }
    //你懂得
    public V next(){
        Node<K,V> result=cursor;
        cursor=cursor.next;
        return result.getValue();
    }

}
