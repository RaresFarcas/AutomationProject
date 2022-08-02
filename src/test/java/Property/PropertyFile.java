package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertyFile {
    public FileInputStream fileInputStream;
    public Properties properties;

    public void loadFile(String path){
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/data/"+path+".properties");
            properties.load(fileInputStream);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public PropertyFile(String path){
        loadFile(path);
    }

    public String getValue(String key){
        return properties.getProperty(key);

    }

    public HashMap<String,String> getAllTheValues(){
        HashMap<String,String> keyvalue = new HashMap<>();
        for (Object key: properties.keySet()){
            keyvalue.put(key.toString(),properties.getProperty(key.toString()));
        }
        return keyvalue;
    }
}
