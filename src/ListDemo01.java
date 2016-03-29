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
        lists.add("C");
        lists.forEach(System.out::println);


        lists.remove(0);
        //当数组中的a0被溢出后，B的下标即为0，C的即为1；

        System.out.println("删除以后的");
        lists.forEach(System.out::println);



        System.out.println(lists.isEmpty());
        //B是否存在
        System.out.println(lists.indexOf("A"));
    }
}
