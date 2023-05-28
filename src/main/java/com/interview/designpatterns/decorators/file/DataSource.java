package com.interview.designpatterns.decorators.file;

import java.io.IOException;

interface DataSource {
    void writeData(String data) throws IOException;

    String readData();
}
