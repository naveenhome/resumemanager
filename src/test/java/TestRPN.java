package test.java;
import junit.framework.*;
import main.java.RpnCalc;
public class TestRPN extends TestCase{
	
	public void test2operatndAnd1Operator()
	{
		RpnCalc obj = new RpnCalc();
		assertEquals(5, obj.calculate("2,3,+"));
	}

}
