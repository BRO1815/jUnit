package by.academy.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorMultipleTest.class, CalculatorDivideTest.class, CalculatorSumTest.class})
public class TestSuite {}