package com.example.javasession;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoStream {

    public static void main(String[] args) throws Exception {

        IoStream io = new IoStream();
        io.fileInputStream();
        io.fileoutputStream();
    }

    public void fileInputStream() throws Exception
    {
        FileInputStream fis = new FileInputStream("/Users/mrajputt/Documents/Munnam_Rajputt_Backcountry_JavaSession/src/main/java/abc.txt");
        int content;
        while((content=fis.read())!=-1)
        {
            System.out.println((char) content);
        }
        fis.close();
    }

    public void fileoutputStream() throws Exception{
        FileInputStream fis = new FileInputStream("/Users/mrajputt/Documents/Munnam_Rajputt_Backcountry_JavaSession/src/main/java/abc.txt");
        FileOutputStream fos = new FileOutputStream("/Users/mrajputt/Documents/Munnam_Rajputt_Backcountry_JavaSession/src/main/java/def.txt");

        int content;
        while((content=fis.read())!=-1)
        {
            fos.write(content);
            System.out.println((char) content);
        }
        fis.close();
        fos.close();

    }
}
