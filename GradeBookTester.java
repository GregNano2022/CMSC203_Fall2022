import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	private GradeBook g1;
	private GradeBook g2;
	private GradeBook g3;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(93);
		g1.addScore(85);
		g1.addScore(67);
		
		g2= new GradeBook(5);
		g2.addScore(40);
		g2.addScore(64);
		g2.addScore(98);
		g2.addScore(87);
		g2.addScore(70);
		
		g3= new GradeBook(5);
		g3.addScore(35);
		g3.addScore(88);
		g3.addScore(77);
		g3.addScore(65);
		g3.addScore(93);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		g3 = null;
	}
	

	@Test
	void testSum(){
		//fail("Not yet implemented");
			assertEquals(370, g1.sum(), .0001);
			assertEquals(359, g2.sum(), .0001);
			assertEquals(358, g3.sum(), .0001);
	}
	@Test
	void testMinimum() {
			  assertEquals(50, g1.minimum(), .001);
			  assertEquals(40, g2.minimum(), .001);
			  assertEquals(35, g3.minimum(), .001);
			  
	}
	@Test
	void testaddScore() {
				assertTrue(g1.toString().equals(" 50.0 75.0 93.0 85.0 67.0 "));
				assertTrue(g2.toString().equals(" 40.0 64.0 98.0 87.0 70.0 "));
				assertTrue(g3.toString().equals(" 35.0 88.0 77.0 65.0 93.0 "));
	}   
	@Test
	void testfinalScore() {     
				assertEquals(320, g1.finalScore(), .001);
				assertEquals(319, g2.finalScore(), .001);
				assertEquals(323, g3.finalScore(), .001);
}

	}


