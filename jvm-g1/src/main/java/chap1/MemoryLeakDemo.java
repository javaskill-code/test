package chap1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjy on 18-3-2.
 * 内存泄漏示例
 */
public class MemoryLeakDemo {
    static class Key{
        Integer id;

        public Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

    public static void main(String[] args) {
        Map m = new HashMap();
        while (true){
            for (int i = 0; i < 10000; i++) {
                if (!m.containsKey(new Key(i))){
                    m.put(new Key(i),"Number:"+i);
                }
            }
        }
    }

}
