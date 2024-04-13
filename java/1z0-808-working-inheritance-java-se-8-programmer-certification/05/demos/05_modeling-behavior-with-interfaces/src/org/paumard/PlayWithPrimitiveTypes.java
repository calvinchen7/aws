package org.paumard;

public class PlayWithPrimitiveTypes {

    public static void main(String[] args) {

        int i1 = 10;
        long l1 = i1;
        i1 = (int)l1;

        float f1 = 2.2f;
        double d1 = 2.2d;

        int i2 = 20;
        int i3 = (int)(l1 + i2);

        short s1 = 10;
        short s2 = 20;
        int s3 = s1 + s2;

    }
}
