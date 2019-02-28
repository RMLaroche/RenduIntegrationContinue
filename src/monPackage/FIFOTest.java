package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	
	FIFO fifo = new FIFO();

	@BeforeEach
	void setUp() throws Exception {
		fifo.add(0);
		fifo.add(2);
		fifo.add(3);
		fifo.add(7);
		fifo.add(-9);
		fifo.add(-7);
		fifo.add(-7);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		FIFO fifo2 = new FIFO();
		fifo2.add(-7);
		assertEquals(1, fifo2.size());
		fifo2.add(9);
		assertEquals(2, fifo2.size());
	}

	@Test
	void testFirst() {
		assertEquals((Integer)0,(Integer)this.fifo.first());
		
		FIFO fifo2 = new FIFO();
		Assertions.assertThrows(NoSuchElementException.class,()->{fifo2.first();});
		fifo2.add(-45);
		assertEquals((Integer)(-45),(Integer)fifo2.first());
	}

	@Test
	void testIsEmpty() {
		FIFO fifo2 = new FIFO();
		assertEquals(true, fifo2.isEmpty());
		fifo2.add(-7465);
		assertEquals(false, fifo2.isEmpty());
	}

	@Test
	void testRemoveFirst() {
		FIFO fifo2 = new FIFO();
		Assertions.assertThrows(NoSuchElementException.class,()->{fifo2.removeFirst();});
		fifo2.add(-7);
		fifo2.removeFirst();
		assertEquals(0, fifo2.size());
		
		fifo.removeFirst();
		assertEquals((Integer)2,(Integer)this.fifo.first());
	}

	@Test
	void testSize() {
		FIFO fifo2 = new FIFO();
		fifo2.add(-7);
		assertEquals(1, fifo2.size());
		fifo2.add(9);
		assertEquals(2, fifo2.size());
		fifo2.add(-49);
		assertEquals(3, fifo2.size());
		fifo2.add(99);
		assertEquals(4, fifo2.size());
		
		assertEquals(7,fifo.size());
	}

}
