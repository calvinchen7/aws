class Caller{
	//public void init() {
	private void init() {
		System.out.println("Initialized");
	}

	//public void start(){
	private void start(){
		init();
		System.out.println("Started");
	}
}

class TestCall{
	public static void main(String[] args){
		Caller c = new Caller();
		c.start();
		c.init();
	}
}
/*
TestCall.java:17: error: start() has private access in Caller
                c.start();
                 ^
TestCall.java:18: error: init() has private access in Caller
                c.init();
                 ^
2 errors
*/