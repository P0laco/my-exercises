package io.codeforall.fanSTATICs_;

import java.io.IOException;

public class Sandbox {
    public static void main(String[] args) {

        try {
            CopyingFile isto = new CopyingFile();
            isto.copyFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
