package com.interview.designpatterns.decorators.file;

public class Demo {
    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("\n- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("\n- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("\n- Decoded --------------");
        System.out.println(encoded.readData());


        DataSource dataSource = new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt"));
        performMyAction(salaryRecords, dataSource);


    }

    private static void performMyAction(String salaryRecords, DataSource dataSource) {
        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(dataSource);
        dataSourceDecorator.writeData(salaryRecords);
        System.out.println(dataSourceDecorator.readData());
    }
}


