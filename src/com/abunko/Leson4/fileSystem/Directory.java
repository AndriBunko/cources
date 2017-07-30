package com.abunko.Leson4.fileSystem;

import java.util.ArrayList;

/**
 * Created by Andrew on 20.07.2017.
 */
public class Directory implements FileSyst {
    private ArrayList <FileSyst> fileSystList;

    public Directory() {
        fileSystList = new ArrayList<>();
    }

    public Directory(FileSyst...fs) {
        fileSystList = new ArrayList<>();
        for ( FileSyst s: fs) {
            fileSystList.add(s);
        }
    }

    public Directory add(FileSyst fileSyst){
        fileSystList.add(fileSyst);
        return this;
    }

    public int getSize() {
        int size = 0;
        for (FileSyst s : fileSystList) {
            size += s.getSize();
        }
        return size;
    }
}
