package e2e.utils;

import java.io.FileInputStream;
import java.util.Properties;

import static e2e.utils.Constants.Configuration_FilePath;

public class ConfigReader {

    private static Properties configFile;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(Configuration_FilePath);
            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Failed to read Properties");
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        return configFile.getProperty(key);
    }
}
