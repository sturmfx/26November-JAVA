package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main
{
    static String mainPath = "src/test1.txt";
    public static void main(String[] args) throws IOException
    {
	    //Game g = new Game();
        Path path = Paths.get(mainPath);
        String result = "ldrg;ldjlsdjrg;l";
        byte[] bytes = result.getBytes();
        Files.write(path, bytes);

        Point p = new Point(10, 20);
        System.out.println(p.getX());
    }
}
