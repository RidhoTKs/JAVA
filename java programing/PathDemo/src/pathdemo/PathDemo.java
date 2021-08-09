/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathdemo;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author RTKS
 */
public class PathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //define a aray with path object type
        Path[] paths = new Path[5];
        paths[0] = Paths.get("C:\\JavaProgramming\\NIO2\\DemoFile.txt");
        paths[1] = Paths.get("C:/JavaProgramming/NIO2/DemoFile.txt");
        paths[2] = Paths.get("C:", "JavaProgramming", "NIO2", "DemoFile.txt");
        paths[3] = Paths.get("DemoFile.txt");
        paths[4] = Paths.get(URI.create("file:///~/DemoFile.txt"));

        for (int i = 0; i < paths.length; i++) {
            System.out.println("Default File Path p [" + i + "] - "
                    + paths[i]);
        }

        System.out.println(paths[0].getFileName());
        System.out.println(paths[0].getParent());
        System.out.println(paths[0].getNameCount());
        System.out.println(paths[0].isAbsolute());
        System.out.println(paths[3].toAbsolutePath());
        System.out.println(paths[0].toUri());

        Path sp
                = Paths.get("C:/JavaProgramming/IO/../NIO2//DemoFile.txt");
        System.out.println("===========================================");
        System.out.println(sp);
        System.out.println("p.subpath() [" + sp.getNameCount()
                + "][" + sp.subpath(0, 5) + "]");
        System.out.println("p.subpath() [" + sp.getNameCount()
                + "][" + (sp.normalize()).subpath(0, 3) + "]");
    }

}
