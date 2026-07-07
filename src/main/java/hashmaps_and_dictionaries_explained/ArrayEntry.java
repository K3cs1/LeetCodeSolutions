package hashmaps_and_dictionaries_explained;

public class ArrayEntry {
	private String userName;
	private int index;

	public ArrayEntry() {
	}

	public ArrayEntry( String userName, int index ) {
		this.userName = userName;
		this.index = index;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName( String userName ) {
		this.userName = userName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex( int index ) {
		this.index = index;
	}

	public boolean isEmpty() {
		return index == 0;
	}
}
