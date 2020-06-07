package by.academy.junit;

import org.junit.runner.JUnitCore;

public class TestListener {
 
    public static void main(String[] args) {
        System.out.println("Second example in MainTest");
        JUnitCore core = new JUnitCore();
        core.addListener(new CalculatorTestListener());
        core.run(TestSuite.class);
       
    }
}
	
