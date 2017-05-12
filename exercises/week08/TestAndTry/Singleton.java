public class Singleton {
	private static Singleton instance = null ;
	private Singleton () { }
	public static Singleton getInstance () {
		if( instance == null ) {
		instance = new /*Classic*/Singleton (); //@Classic"? don't know why 
		}
	return instance ;
	}
	void myMethod () {
	System . out . println ("It works ");
	}
}