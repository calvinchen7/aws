public class ForLoopIteration  {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        //shirts[3][1] = "red"; //java.lang.ArrayIndexOutOfBoundsException
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        for(String[] c : shirts){ //red:blue:small:medium:
            for(String s : c){
            System.out.println(s + ":");
            }
        }
    }
}