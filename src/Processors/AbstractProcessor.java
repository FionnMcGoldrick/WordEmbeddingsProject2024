package Processors;

import Interfaces.Processor;

public abstract class AbstractProcessor implements Processor {

    /**
     * Process a line of text.
     * @param line The line of text to process.
     */
    public abstract void process(String line);


    /**
     * Process a file.
     * @param filename The name of the file to process.
     */
    public void processFile(String filename) {
        // Read the file line by line
        // For each line, call the process method
    }


}
