import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class A {
    public static void main(String[] args) {
        Collection<String> st = new ArrayList<>();
        st.add("a");
        st.add("e");
        Object[] arr1 = st.toArray();
        Collection arr2 = new ArrayList<String>();
        arr2.add(new StringBuilder("aaskd"));

        for(Object o:arr1){
            System.out.println(o.getClass());
        }

        for(Object s:arr2){
            System.out.println(s.getClass());
        }
    }

}
