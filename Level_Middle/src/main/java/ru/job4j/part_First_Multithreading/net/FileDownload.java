package ru.job4j.part_First_Multithreading.net;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;


public class FileDownload {
    private final static int onesecond = 2000;

    public static void main(String[] args) throws Exception {
        String file = "https://pdfs.semanticscholar.org/3650/4bc31d3b2c5c00e5bfee28ffc5d403cc8edd.pdf";
        try (BufferedInputStream in = new BufferedInputStream(new URL(file).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("pom_tmp.pdf")) {
            LocalDateTime dStart = LocalDateTime.now();
            LocalDateTime dEnd = LocalDateTime.now();
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
                int weigth = bytesRead/onesecond-(dEnd.getNano()-dStart.getNano());
                if(weigth > 200){
                    Thread.sleep(weigth);
                }
                else{
                    Thread.sleep(0);
                }
            }
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("Errors"+" "+ e);
        }
    }
}