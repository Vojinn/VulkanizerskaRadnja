/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dusan
 *
 */
public class AutoGumaTest {
	private AutoGuma g;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		g = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		g = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		g.setMarkaModel("Tigar R15");
		assertEquals("Tigar R15", g.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		g.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelEmptyString() {
		g.setMarkaModel("");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		g.setPrecnik(15);
		assertEquals(15, g.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOd13() {
		g.setPrecnik(12);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOd22() {
		g.setPrecnik(23);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		g.setSirina(150);
		assertEquals(150, g.getSirina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOd135() {
		g.setSirina(130);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOd355() {
		g.setSirina(400);
	}
	

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		g.setVisina(50);
		assertEquals(50, g.getVisina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOd25() {
		g.setVisina(20);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOd95() {
		g.setVisina(125);
	}
	
	

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		g.setMarkaModel("Tigar R15");
		g.setPrecnik(15);
		g.setSirina(150);
		g.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=Tigar R15, precnik=15, sirina=150, visina=50]", g.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectTrue() {
		AutoGuma g1 = new AutoGuma();
		
		g1.setMarkaModel("Tigar R15");
		g1.setPrecnik(15);
		g1.setSirina(150);
		g1.setVisina(50);
		
		AutoGuma g2 = new AutoGuma();
		
		g2.setMarkaModel("Tigar R15");
		g2.setPrecnik(15);
		g2.setSirina(150);
		g2.setVisina(50);
		
		assertTrue(g1.equals(g2));
		
	}
	
	@Test
	public void testEqualsObjectFalse() {
		
		AutoGuma g1 = new AutoGuma();
		
		g1.setMarkaModel("Tigar R15");
		g1.setPrecnik(15);
		g1.setSirina(150);
		g1.setVisina(50);
		
		AutoGuma g2 = new AutoGuma();
		
		g2.setMarkaModel("Tigar R15");
		g2.setPrecnik(15);
		g2.setSirina(170);
		g2.setVisina(50);
		
		assertFalse(g1.equals(g2));
	}

}
