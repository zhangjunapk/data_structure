package hashmap;

public class Content {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("1","a");
        map.put("2","b");

        while(map.hasNext()){
            System.out.println(map.next().getValue());
        }


    }
}
