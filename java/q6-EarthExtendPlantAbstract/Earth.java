abstract class Plant {
	protected void revolve() {
	}

	abstract void rotate();
}


class Earth extends Plant {
//	void revolve() {
//Earth.java:10: error: revolve() in Earth cannot override revolve() in Plant
//        void revolve() {
//             ^
//  attempting to assign weaker access privileges; was protected 
// 1 error
	// void revolve() {}
	protected void revolve() { }
	// public void revolve() { }

	protected void rotate() {
	}
}