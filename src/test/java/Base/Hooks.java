package Base;

import Property.PropertyFile;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends BaseTest{

    public HashMap<String, String> inputData;

    @Before
    public void setUp(){
        setupMethod();
        String testName = this.getClass().getSimpleName();
        PropertyFile testData = new PropertyFile("inputData/"+testName+"Resource");
        inputData = testData.getAllTheValues();
    }

    @After
    public void clear(){

    }
}
