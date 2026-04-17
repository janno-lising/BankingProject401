
abstract class User {
	private int userID;
	private String pin;
	private boolean isLoggedIn;
	public static int userIDCounter = 0;
	//will need a method to set this counter to the current highest ID number
	
	public User(String pin) {
		userID = userIDCounter++;
		isLoggedIn = false;
		this.pin = pin;
	}
	
	public int getUserID() {
		return userID;
	}
	public boolean getIsLoggedIn() {
		return isLoggedIn;
	}
	public boolean checkPin(String Pin) {// May have this function built into the server later 
		if (pin.equals(Pin)) {			 // (meaning: may not need it here)
			return true;
		}
		else {
			return false;
		}
	}
	public void setIsLoggedIn(boolean bool) {
		isLoggedIn = bool;
	}
	public void setPin(String newPin) {
		pin = newPin;
	}
	
}
