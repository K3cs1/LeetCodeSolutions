package hashmaps_and_dictionaries_explained;

public class Solution {

	static void main() {
		String value = "boblaney";
		ArrayEntry[] arrayEntries = new ArrayEntry[ 20000 ];
		System.out.println( hasIndex( value, arrayEntries ) );
	}

	private static boolean hasIndex( String value, ArrayEntry[] arrayEntries ) {
		int hash = value.hashCode();
		System.out.println( "HashCode of " + value + ": " + hash );
		int index = hash % arrayEntries.length;
		System.out.println( "Index is: " + index );
		for ( int i = index; i < arrayEntries.length; i++ ) {
			if ( arrayEntries[ index ] == null ) {
				return false;
			} else if ( arrayEntries[ index ].getUserName().equals( value ) ) {
				return true;
			}
		}
		return false;
	}
}
