package travisexample;

import static org.junit.Assert.assertEquals;
import myapp.MyController;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyAppTest {
    @Test
    public void testTest(){
    	assertEquals("{\"id\":}", (new MyController()).test(""));
    }
    
    
    
}