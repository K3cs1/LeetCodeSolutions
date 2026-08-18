package java_bitset;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
	static void main() {
		Scanner scan = new Scanner( System.in );
		int N = scan.nextInt();
		int M = scan.nextInt();
		BitSet set1 = new BitSet( N );
		BitSet set2 = new BitSet( N );
		for ( int i = 0; i < M; i++ ) {
			String operand = scan.next();
			int setId = scan.nextInt();
			int bitId = scan.nextInt();
			bitProcess( set1, set2, operand, setId, bitId );
			System.out.println( set1.cardinality() + " " + set2.cardinality() );
		}
	}

	static void bitProcess( BitSet set1, BitSet set2, String operand, int setId, int bitId ) {
		BitSet target = setId == 1 ? set1 : set2;
		BitSet other = setId == 1 ? set2 : set1;
		switch ( operand ) {
			case "AND" -> target.and( other );
			case "OR" -> target.or( other );
			case "XOR" -> target.xor( other );
			case "FLIP" -> target.flip( bitId );
			case "SET" -> target.set( bitId );
			default -> throw new IllegalStateException( "Unexpected value: " + operand );
		}
	}
}
