package java_bitset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.BitSet;

class SolutionTest {

	@Test
	void testAndOnSet1() {
		BitSet set1 = new BitSet( 5 );
		set1.set( 0 );
		set1.set( 1 );
		BitSet set2 = new BitSet( 5 );
		set2.set( 1 );

		Solution.bitProcess( set1, set2, "AND", 1, 0 );

		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertTrue( set1.get( 1 ) );
		Assertions.assertEquals( 1, set2.cardinality() );
	}

	@Test
	void testAndOnSet2() {
		BitSet set1 = new BitSet( 5 );
		set1.set( 0 );
		BitSet set2 = new BitSet( 5 );
		set2.set( 0 );
		set2.set( 1 );

		Solution.bitProcess( set1, set2, "AND", 2, 0 );

		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertEquals( 1, set2.cardinality() );
		Assertions.assertTrue( set2.get( 0 ) );
	}

	@Test
	void testOr() {
		BitSet set1 = new BitSet( 5 );
		set1.set( 0 );
		BitSet set2 = new BitSet( 5 );
		set2.set( 1 );

		Solution.bitProcess( set1, set2, "OR", 2, 0 );

		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertEquals( 2, set2.cardinality() );
		Assertions.assertTrue( set2.get( 0 ) );
		Assertions.assertTrue( set2.get( 1 ) );
	}

	@Test
	void testXor() {
		BitSet set1 = new BitSet( 5 );
		set1.set( 0 );
		set1.set( 1 );
		BitSet set2 = new BitSet( 5 );
		set2.set( 1 );

		Solution.bitProcess( set1, set2, "XOR", 1, 0 );

		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertTrue( set1.get( 0 ) );
		Assertions.assertFalse( set1.get( 1 ) );
	}

	@Test
	void testFlip() {
		BitSet set1 = new BitSet( 5 );
		BitSet set2 = new BitSet( 5 );
		set2.set( 2 );

		Solution.bitProcess( set1, set2, "FLIP", 2, 2 );

		Assertions.assertEquals( 0, set2.cardinality() );
		Assertions.assertFalse( set2.get( 2 ) );
	}

	@Test
	void testSet() {
		BitSet set1 = new BitSet( 5 );
		BitSet set2 = new BitSet( 5 );

		Solution.bitProcess( set1, set2, "SET", 1, 4 );

		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertTrue( set1.get( 4 ) );
	}

	@Test
	void testUnknownOperandThrows() {
		BitSet set1 = new BitSet( 5 );
		BitSet set2 = new BitSet( 5 );

		Assertions.assertThrows( IllegalStateException.class,
				() -> Solution.bitProcess( set1, set2, "NOT", 1, 0 ) );
	}

	@Test
	void testSampleSequenceFromProblemStatement() {
		BitSet set1 = new BitSet( 5 );
		BitSet set2 = new BitSet( 5 );

		Solution.bitProcess( set1, set2, "AND", 1, 2 );
		Assertions.assertEquals( 0, set1.cardinality() );
		Assertions.assertEquals( 0, set2.cardinality() );

		Solution.bitProcess( set1, set2, "SET", 1, 4 );
		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertEquals( 0, set2.cardinality() );

		Solution.bitProcess( set1, set2, "FLIP", 2, 2 );
		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertEquals( 1, set2.cardinality() );

		Solution.bitProcess( set1, set2, "OR", 2, 1 );
		Assertions.assertEquals( 1, set1.cardinality() );
		Assertions.assertEquals( 2, set2.cardinality() );
	}
}
