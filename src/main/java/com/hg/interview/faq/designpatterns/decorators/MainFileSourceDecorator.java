package com.hg.interview.faq.designpatterns.decorators;

public class MainFileSourceDecorator {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
/*        FileDataSource = new FileDataSource("out/OutputDemo.txt");
        fileDataSource.writeData(salaryRecords);*/
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
