import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> ts = new ArrayList<>();
//        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("yusuf",64));
        ts.add(new Person("uğur",53));
        ts.add(new Person("enes",31));
        ts.add(new Person("müco",53));
        //ArrayList Collection.sort ile sıralanabilir person classındaki compareTo metodunu kullanıyor ayrıca comparator ile
            //kendim yeni bir sıralama oluşturabilrim!
        Collections.sort(ts/*, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                String p1 = o1.getName();
                String p2 = o2.getName();
                return p1.compareTo(p2);
            }
        }*/);
        System.out.println(ts);
    }
}

class Person implements Comparable<Person>{
    Person(String name,int id){
        this.name = name;
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    @Override
    public int compareTo(Person o) {
        int currentId = this.id;
        int otherId = o.id;
        if (otherId > currentId)
            return 1;
        return -1;
    }

    @Override
    public String toString(){
        return "{"+this.name+","+this.id+"}";
    }
}


