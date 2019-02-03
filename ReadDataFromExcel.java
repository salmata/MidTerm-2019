package datastructure;

import java.io.FileReader;

public class ReadDataFromExcel {

    /**
     * Uses MyDataReader.java API to read data from Excel
     *
     * */
    public static void main(String args [] )throws Exception {
        FileReader fr = new FileReader("/Users/salmasultana/Documents/MidTermJan2019/src/main/java/data/testData.xlsx");
        int i;
        while ((i =fr. read())!=-1);
        System.out.println((char)i);
        fr.close();


    }

}
