import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Attempt {
    public static void main(String[] args) throws IOException {
        var dirName = "C:\\Users\\hocao\\OneDrive\\Masaüstü\\Yazılım\\java\\Epam\\JavaIO\\The Interface Approach to Working With Files via NIO.2\\Attempt\\Yeni klasör";
        ArrayList<Path> path = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        File fileee = new File(dirName);
        if (fileee.exists()) {
            try (Stream<Path> paths = Files.walk(Paths.get(dirName))) {
                Iterator iterator = paths.iterator();
                while (iterator.hasNext()) {
                    Path currentPath = (Path) iterator.next();
                    File file = new File(String.valueOf(currentPath));
                    path.add(currentPath.getFileName());
                    size.add((int) file.length());

                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < path.size(); i++){
                stringBuilder.append(path.get(i)+" "+size.get(i)+"\n");
                stringBuilder.append(buildDirectoryTree(path.get(i).toFile()));
            }
            System.out.println(stringBuilder);
        }

    }

    public static String buildDirectoryTree(File directory){
        StringBuilder treeBuilder = new StringBuilder();

        File[] contents = directory.listFiles();
        if (contents != null) {
            Arrays.sort(contents, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
            for (File content : contents) {
                if (content.isDirectory()) {
                    treeBuilder.append("├─ ");
                } else {
                    treeBuilder.append("│  ");
                }
                treeBuilder.append(buildDirectoryTree(content));
            }
        }
        return treeBuilder.toString();
    }
}
