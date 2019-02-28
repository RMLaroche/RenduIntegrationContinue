package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() throws IOException {
		int tab[] = {1, 5, 6, 8, 4, 6, -95};
		TriTableau.trier(tab); 
		
		
		
		
	}

	@Test
	void testTriCroissant() {
		int tab[] = {1, 5, 6, 8, 4, 6, -95};
		TriTableau.triCroissant(tab); 
		assertEquals(-95, tab[0]);
		assertEquals(1, tab[1]);
		assertEquals(4, tab[2]);
		assertEquals(5, tab[3]);
		assertEquals(6, tab[4]);
		assertEquals(6, tab[5]);
		assertEquals(8, tab[6]);
		
		int tab2[] = {};
		TriTableau.triCroissant(tab2); //Pas d'exception
		
	}

	@Test
	void testTriDecroissant() {
		int tab[] = {1, 5, 6, 8, 4, 6, -95};
		TriTableau.triDecroissant(tab); 
		assertEquals(-95, tab[6]);
		assertEquals(1, tab[5]);
		assertEquals(4, tab[4]);
		assertEquals(5, tab[3]);
		assertEquals(6, tab[2]);
		assertEquals(6, tab[1]);
		assertEquals(8, tab[0]);
		int tab2[] = {};
		TriTableau.triDecroissant(tab2); //Pas d'exception
	}

}
