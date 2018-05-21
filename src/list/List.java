package list;

/**
 * ArrayList简单模拟
 * @author 张君
 */
public class List<T> {
    private Object[] list=new Object[2];
    private int lastIndex=0;

    /**
     * 添加元素，如果超出容量就扩容，然后放进去
     * @param t
     */
    public void add(T t){
        if(!checkSize()){
            capacity();
        }
        list[lastIndex++]=t;
        System.out.println(lastIndex);
    }


    /**
     * 容量检测
     * @return
     */
    public boolean checkSize(){
        if(lastIndex>=list.length){
            return false;
        }
        return true;
    }

    /**
     * 扩容
     * @return
     */
    public boolean capacity(){
        Object[] result=new Object[lastIndex+lastIndex/2];
        copy(list,result);
        return true;
    }

    /**
     * 扩容放到新数组中
     * @param list
     * @param result
     */
    private void copy(Object[] list, Object[] result) {
        for(int i=0;i<list.length;i++){
            result[i]=list[i];
        }
        this.list=result;
    }

    /**
     * 得到元素
     * @param i
     * @return
     */
    public T get(int i){
        if(i>=0&&i<list.length){
            return (T) list[i];
        }
        try {
            throw new Exception(new IndexOutOfBoundsException());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
