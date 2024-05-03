package branch;
import root.*;

public class Plant extends Tree {
public static void main(String[] args) {
Plant t = new Plant();
t.m1(); // Answer A --- Ok, but incomplete.
t.m1(); t.m3(); // Answer B --- Ok
t.m1(); t.m3(); t.m4(); // Answer C --- Error
t.m1(); t.m4(); // Answer D --- Error
}
}