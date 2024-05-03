public class Test {

    public static void main(String[] args) {
        String[] strings = new String[2];
        int idx = 0;
        for(String s : strings){
            strings[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strings.length; idx++){
            System.out.println(strings[idx]);
        }
    }

}
