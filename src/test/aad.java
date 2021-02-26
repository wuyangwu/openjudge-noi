package test;


public class aad {
	
	private static aad aad = null;
	
	public static aad getInstance() {
		if (aad == null) {
			aad = new aad();
		}
		return aad;
	}
}
