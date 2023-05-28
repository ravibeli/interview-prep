package com.interview.designpatterns.decorators.file;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
class DataSourceDecorator implements DataSource {
    private final DataSource dataSource;

    DataSourceDecorator(DataSource source) {
        this.dataSource = source;
    }

    @Override
    public void writeData(String data) {
        try {
            dataSource.writeData(data);
        } catch (IOException e) {
            log.error("Error writing data", e);
        }
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
