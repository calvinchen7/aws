package com.exceptions.m3;

import java.io.*;

public class CheckedExceptionExamples {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("file.txt")){
        } catch(IOException e){

        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
