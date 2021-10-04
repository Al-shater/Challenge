package de.exxcellent.challenge.Reader;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * @author Yassin Alshater <mhdalshater@gmail.com>
 */
public class CsvReader extends DataReader {
    private final String path;
    private CSVReader reader;

    /**
     * @param path of csv File
     */
    protected CsvReader(String path){
        this.path = path;
    }

    /**
     *
     * @throws FileNotFoundException if the csv File not found
     */
    @Override
    protected void readData() throws FileNotFoundException {
        reader = new CSVReader( new FileReader(path));
    }

    protected CSVReader getReader(){
        return reader;
    }

}