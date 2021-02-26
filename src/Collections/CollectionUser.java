package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/23 19:09
 */
public class CollectionUser {
    public static void main(String[] args){
        Collection<String> collection = new ArrayList();
        collection.add("wuyang1");
        collection.add("wuyang2");
        collection.add("wuyang3");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
