package com.company.m3;

public class _4SwitchStatementConstantExpression {

//    void doThing(String arg, final String finalArg) {
//        String localVar = "a";
//        final String finalVar = "b";
//        switch (arg) {
//            case "Test":
//                // code
//                break;
//            case localVar: // Does not compile
//                // code
//                break;
//            case finalVar:
//                // code
//                break;
//            case finalArg: // Does not compile
//                // code
//                break;
//            case 5: // Does not compile
//                // code
//                break;
//        }
//    }

    void executeCode(String arg) {
        final String finalVar = "b";
        switch (arg) {
            case "Test":
                // code
                break;
            case finalVar:
                // code
                break;
        }
    }
}
