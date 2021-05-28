package Mission_7_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PoolTest {

    Pool P = new Pool();
	
	@Test
	void Test_01_Weak_Cover() throws Exception {
		assertEquals(100, P.Cash_check("Member", "Mon", 40, 10));
	}
	@Test
	void Test_02_Weak_Cover() throws Exception {
		assertEquals(125, P.Cash_check("Member", "Sat", 40, 10));
	}
	@Test
	void Test_03_Weak_Cover() throws Exception {
		assertEquals(140, P.Cash_check("Group", "Mon", 40, 10));
	}
	@Test
	void Test_04_Weak_Cover() throws Exception {
		assertEquals(160, P.Cash_check("Normal", "Mon", 11, 6));
	}
	@Test
	void Test_05_Weak_Cover() throws Exception {
		assertEquals(200, P.Cash_check("Normal", "Mon", 40, 10));
	}
	@Test
	void Test_06_Weak_Cover() throws Exception {
		assertEquals(250, P.Cash_check("Normal", "Sat", 40, 6));
	}
	@Test
	void Test_07_Weak_Cover() throws Exception {
		Exception e = assertThrows(Exception.class, ()->P.Cash_check("Normal", "Mon", 2, 4));
		assertEquals("The swimming pool is close now.", e.getMessage());
	}
	
	
}