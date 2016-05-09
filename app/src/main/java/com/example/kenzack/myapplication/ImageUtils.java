package com.example.kenzack.myapplication;

/**
 * Created by KenZack on 09/05/2016.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class ImageUtils {
    public static byte[] getByteArrayFromImage(String filePath) throws Exception {
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        for (int readNum; (readNum = fis.read(buf)) != -1;) {
            bos.write(buf, 0, readNum);
        }
        byte[] bytes = bos.toByteArray();
        return bytes;
    }
}