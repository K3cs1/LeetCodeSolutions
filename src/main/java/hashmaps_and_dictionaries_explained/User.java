package hashmaps_and_dictionaries_explained;

public class User {
	private int age;
	private String name;
	private boolean magic;

	public void scream() {
		System.out.println( "argh!" );
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age ) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public boolean isMagic() {
		return magic;
	}

	public void setMagic( boolean magic ) {
		this.magic = magic;
	}
}
