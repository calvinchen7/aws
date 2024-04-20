public class Test {

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}//main int

	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}//main Object

	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
	}//main String
}