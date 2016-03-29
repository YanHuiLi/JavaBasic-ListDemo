import java.util.List;
import java.util.Vector;

/**
 * Vector的使用
 * Created by Archer on 2016/3/29.
 *
 * Vector和ArrayList的差别
 *
 * ArrayList采用的是异步的处理方式，性能高属于非线程安全的。
 *
 * Vector采用的同步处理方式，性能低，线程安全。
 *
 * 关键在于要不要使用线程安全的做法。
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> mlist;
        mlist=new Vector<String>();

        mlist.add("A");
        mlist.add("B");

        mlist.forEach(System.out::println);
    }

}
