package com.abunko.Leson4.fileSystem;

/**
 * Created by Andrew on 20.07.2017.
 */
public class FsRunner {
    public static void main(String[] args) {
        Directory root = new Directory();

        Directory d1 = new Directory(
                new File(10),
                new File(20)
        );
        Directory d2 = new Directory(
                new Directory(
                        new File(30)
                ),
                new File(40)
        );

        root.add(d1).add(d2).add(new File(50));

        System.out.println(root.getSize());
    }
}
