import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        writeToFile(false, Arrays.toString(new byte[0]));
        File root = new File("./root");
        List<File> arr = new ArrayList<>();
        findFiles(root, arr);
        for (File file : arr) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                List<String> lists = new ArrayList<>();
                List<String> check = new ArrayList<>();
                Map<String, String> writeMap = new HashMap<>();
                writeMap.put("File", String.valueOf(file));
                check.add("License");
                check.add("Issued on");
                check.add("Issued by");
                check.add("Expires on");
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    lists.add(line);
                }
                if ((lists.size() > 6 || lists.size() < 5) ||
                        (!(Objects.equals(lists.get(0).trim(), "---") && Objects.equals(lists.get(lists.size() - 1).trim(), "---"))))
                    throw new IllegalArgumentException();
                for (String lines : lists) {
                    if (!Objects.equals(lines.trim(), "---".trim())) {
                        String[] keyValue = lines.split(":");
                        String key = keyValue[0];
                        String value = keyValue[1].trim();
                        if (Objects.equals(key, "DATE")) {
                            if (!checkDateYYYYMMDD(value)) throw new IllegalArgumentException();
                        }
                        if (!(check.contains(key))) throw new IllegalArgumentException();
                        writeMap.put(key, value);
                    }
                }
                if(writeMap.get("License") == null) throw new IllegalArgumentException();

                String row = String.format("License for %s is %s issued by %s [%s - %s]\n",
                        writeMap.get("File"),writeMap.get("License"),writeMap.get("Issued by"),
                        writeMap.get("Issued on"),writeMap.getOrDefault("Expires on","unlimited"));
                writeToFile(true, row);
            }
        }
    }

    private static void writeToFile(boolean append, String b) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt",append))) {
            if (append) {
                bufferedWriter.newLine();
            }
            bufferedWriter.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findFiles(File roots, List<File> files) {
        File[] listFiles = roots.listFiles();
        for (File file : listFiles) {
            if(file.isDirectory()){
                findFiles(file,files);
            } else if (file.isFile()) {
                files.add(file);
            }
        }
    }

    public static SimpleDateFormat YMD_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean checkDateYYYYMMDD(String param) {
        boolean bool = true;
        if (param == null || "".equals(param.trim())) {
            return false;
        }
        try {
            YMD_FORMAT.parse(param);
        } catch (ParseException e) {
            bool = false;
        }
        return bool;
    }

}
