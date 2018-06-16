package com.javaStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("file.dat");

        byte[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        out.write(b);
        out.close();
        
        FileInputStream in = new FileInputStream("file.dat");
        in.skip(9); // 跳过前面的9个字节
        int c = in.read();
        System.out.println(c);  // 输出为10
        in.close();
    }

}