public class Test {
        public static void main(String[] args) {
            String opt = "true";
            
            switch (opt) {
                case "true":
                System.out.print("True");
                break;
                default:
                System.out.print("***");
                
            }
            System.out.println("Done");
        
            boolean bTest = false;
            switch (bTest) {
                case ture:
                    break;
            
                default:
                    break;
            }
        }
    
    
    }

/* 
PS C:\Users\Calvin\Documents\GitHub\aws\java\q24-compilation-error-string-integer> javac *.java
Test.java:6: error: incompatible types: int cannot be converted to String
        String s3 = (String) (s1 + s2); // line n1
                             ^
1 error
*/