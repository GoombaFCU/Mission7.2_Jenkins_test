package mission_7_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PoolTest {

    Pool P = new Pool();
	
	@Test
	void Test_01_Weak_Cover() throws Exception {
		assertEquals(100, P.cashCheck("Member", "Mon", 40, 10));
	}
	@Test
	void Test_02_Weak_Cover() throws Exception {
		assertEquals(125, P.cashCheck("Member", "Sat", 40, 10));
	}
	@Test
	void Test_03_Weak_Cover() throws Exception {
		assertEquals(140, P.cashCheck("Group", "Mon", 40, 10));
	}
	
	@Test
	void Test_04_Weak_Cover() throws Exception {
		assertEquals(160, P.cashCheck("Normal", "Mon", 11, 6));
	}
	@Test
	void Test_05_Weak_Cover() throws Exception {
		assertEquals(200, P.cashCheck("Normal", "Mon", 40, 10));
	}

	@Test
	void Test_06_Weak_Cover() throws Exception {
		assertEquals(250, P.cashCheck("Normal", "Sat", 40, 6));
	}
	@Test
	void Test_07_Weak_Cover() throws Exception {
		Exception e = assertThrows(Exception.class, ()->P.cashCheck("Normal", "Mon", 2, 4));
		assertEquals("The swimming pool is close now.", e.getMessage());
	}
	@Test
	void Test_08_For_Coverage() throws Exception {
		Exception e = assertThrows(Exception.class, ()->P.cashCheck("Normal", "Mon", 2, 23));
		assertEquals("The swimming pool is close now.", e.getMessage());
	}
	@Test
	void Test_09_For_Coverage() throws Exception {
		Exception e = assertThrows(Exception.class, ()->P.cashCheck("Normal", "Mon", 2, 10));
		assertEquals("This age is not alow to enter the swimming pool.", e.getMessage());
	}
	@Test
	void Test_10_For_Coverage() throws Exception {
		Exception e = assertThrows(Exception.class, ()->P.cashCheck("Normal", "Mon", 76, 10));
		assertEquals("This age is not alow to enter the swimming pool.", e.getMessage());
	}
	@Test
	void Test_11_For_Coverage() throws Exception {
		assertEquals(250, P.cashCheck("Normal", "Sun", 40, 6));
	}
	@Test
	void Test_12_For_Coverage() throws Exception {
		assertEquals(160, P.cashCheck("Normal", "Mon", 11, 8));
	}
	@Test
	void Test_13_For_Coverage() throws Exception {
		assertEquals(160, P.cashCheck("Normal", "Mon", 60, 8));
	}
}