import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();

//        try {
//            props.setProperty("db.driver", "com.mysql.cj.jdbc.Driver");
//            //props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
//            props.setProperty("user", "root");
//            props.setProperty("password", "pass");
//            props.setProperty("poolsize", "5");
//            props.store(new FileWriter("./base.properties"), "No Comment’s");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            props.load(new FileReader(".\\base.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dbUrl = props.getProperty("db.driver");
        String maxIdle = props.getProperty("db.url", "20");
        String maxActive = props.getProperty("user");
        System.out.println("dbUrl: " + dbUrl);
        System.out.println("maxIdle: " + maxIdle );
        System.out.println("maxActive: " + maxActive);
    }
}
package com.epam.rd.autocode.map;

        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Properties;

public class Config {
    private Properties config;
    public Config() {
        config = new Properties();
        reset();
    }

    public void reset() {
        try{
            config = new Properties();
            config.load(new FileReader(".\\config.properties"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String get(String key) throws IOException {
        if(config.getProperty(key)!=null && !config.getProperty(key).isEmpty() ) return config.getProperty(key);
        String  s = config.getProperty("default.filenames");
        if(s == null)return null;
        String[] ss = s.split(",");
        for(int i = 0;i<ss.length;i++){
            config.load(new FileReader(".\\"+ss[i]+".properties"));
            if(config.getProperty(key)!=null){
                String re = config.getProperty(key);
                return re;
            }
        }
        return null;
    }

    public void remove(String key) throws IOException {
        if(config.remove(key) != null) return;
        String  s = config.getProperty("default.filenames");
        String[] ss = s.split(",");
        for(int i = ss.length-1;i>=0;i--){
            config.load(new FileReader(".\\"+ss[i]+".properties"));
            if(config.remove(key) != null) return;
        }

    }

    public void save() {
        try {
            set("key1","");
            set("key2","");
            config.store(new FileWriter("./config.properties"),"comment");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void set(String key, String value) {
        config.setProperty(key,value);
    }
}
