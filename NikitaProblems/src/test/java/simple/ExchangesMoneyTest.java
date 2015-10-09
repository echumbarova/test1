package simple;

import static org.junit.Assert.assertEquals;
import main.Problem;

import org.junit.Before;
import org.junit.Test;

public class ExchangesMoneyTest {
	Problem problem;

	@Before
	public void setUp() throws Exception {
		problem = new ExchangesMoney();
	}

	@Test
	public void zeroTest() {
		assertEquals("Incorrect results for 0.", "Nan",
				problem.run("0"));
	}
	
	@Test
    public void impossibleTest() {
        assertEquals("Incorrect results for 7.", "Impossible",
                problem.run("7"));
    }
	
	@Test
	public void singleDigitTest1() {
		assertEquals("Incorrect results for 5.", "5",
				problem.run("5"));
	}
	
	@Test
    public void singleDigitTest2() {
        assertEquals("Incorrect results for 3.", "3*1 + 5*0",
                problem.run("3"));
    }
	
	@Test
    public void singleDigitTest3() {
        assertEquals("Incorrect results for 8.", "3*1 + 5*1",
                problem.run("8"));
    }
	
	@Test
	public void longResultListTest() {
	  String expected = "3*0 + 5*73\n" + 
	      "3*5 + 5*70\n" + 
	      "3*10 + 5*67\n" + 
	      "3*15 + 5*64\n" + 
	      "3*20 + 5*61\n" + 
	      "3*25 + 5*58\n" + 
	      "3*30 + 5*55\n" + 
	      "3*35 + 5*52\n" + 
	      "3*40 + 5*49\n" + 
	      "3*45 + 5*46\n" + 
	      "3*50 + 5*43\n" + 
	      "3*55 + 5*40\n" + 
	      "3*60 + 5*37\n" + 
	      "3*65 + 5*34\n" + 
	      "3*70 + 5*31\n" + 
	      "3*75 + 5*28\n" + 
	      "3*80 + 5*25\n" + 
	      "3*85 + 5*22\n" + 
	      "3*90 + 5*19\n" + 
	      "3*95 + 5*16\n" + 
	      "3*100 + 5*13\n" + 
	      "3*105 + 5*10\n" + 
	      "3*110 + 5*7\n" + 
	      "3*115 + 5*4\n" + 
	      "3*120 + 5*1";
	  assertEquals("Incorrect results for 365.", expected,
          problem.run("365"));
	}
}
