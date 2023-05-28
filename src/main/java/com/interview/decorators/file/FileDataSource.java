package com.interview.decorators.file;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

@Slf4j
class FileDataSource implements DataSource {
    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        boolean isFileCreated;
        try {
            isFileCreated = file.createNewFile();
            OutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            log.error("Error while byte array write", e);
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            log.error("Error writing data", e);
        }
        assert buffer != null;
        return new String(buffer);
    }
}
