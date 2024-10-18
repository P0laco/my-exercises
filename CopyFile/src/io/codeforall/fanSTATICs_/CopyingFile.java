package io.codeforall.fanSTATICs_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {
    private FileInputStream inputStream = new FileInputStream("Move.png");

    private FileOutputStream outputStream = new FileOutputStream("Movecopy.png");

    private byte[] buffer = new byte[1024];


    public CopyingFile() throws IOException {
    }


    public void copyFile() throws IOException {
        int numBytesRead = 0;
        int num = inputStream.read(buffer);
        inputStream.close();
        while (num != -1) {
            outputStream.write(buffer, 0, num);
            numBytesRead += num;
            outputStream.close();

        }
    }

}
