package com.abunko.Leson4.fileSystem;

/**
 * Created by Andrew on 20.07.2017.
 */
public class File implements FileSyst {
    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
