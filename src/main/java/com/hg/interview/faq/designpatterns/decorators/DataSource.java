package com.hg.interview.faq.designpatterns.decorators;

import java.io.IOException;

public interface DataSource {
    void writeData(String data) throws IOException;
    String readData();
}
