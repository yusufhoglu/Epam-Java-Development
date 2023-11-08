import java.util.Arrays;
import java.util.List;

public class Attempt {
    public static void main(String[] args) {
        String str = "Merhaba Yusuf";
//        System.out.println(str);
        str = str.replaceAll("Yusuf","Ahmet");
//        System.out.println(str);
//        str = str.repeat(10);
//        System.out.println(str);
//        String str1 = "<script>alert</script>";
//        str1 = str1.replaceAll("</?script>","");
//        System.out.println(str1);
//
//        String str3= "ŞLasdkfd_*1234Kdsfsdf?.1d93*32";
//        String[] splits = str3.split("\\d+");
//        System.out.println(Arrays.toString(splits));
//
//
//        String str4 = String.join(":", List.of("a","3","4"));
//        System.out.println(str4);
//        String a = new String();
//        System.out.println(a.getClass());
//        System.out.println(a.hashCode());
//        System.out.println(a == null);
//        System.out.println("java"+a);
//
        var sb = new StringBuilder(2);
        sb.append("deneme");
        sb.insert(2,"çalışmas");
        System.out.println(sb.charAt(2));
        System.out.println(sb.getClass());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
