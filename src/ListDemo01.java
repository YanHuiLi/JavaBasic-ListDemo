import java.util.ArrayList;
import java.util.List;

/**
 * 使用list
 * Created by Archer on 2016/3/29.
 * Arraylist
 */
public class ListDemo01 {
    public static void main(String[] args) {

        //初始化List
        //List是一个接口，无法实例化，必须实例化其子类
        List<String> lists;
        lists= new ArrayList<>();
        lists.add("A");
        lists.add("B");
        lists.add("A");
        lists.forEach(System.out::println);
    }
}
