import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * This will read the file and parse through the different methods.
 * 
 * @author James Park Sam Larsen
 * @version 03/19/2019
 *
 */
public class FileParser {
    File inputToScan;
    Scanner fileScanner;
    RandomAccessFile raf;
   


    /**
     * This will create a new DNATreeStructure that holds the nodes
     * @throws FileNotFoundException 
     */
    public FileParser() throws FileNotFoundException {
        raf = new RandomAccessFile("replacement.bin", "rw");
        
    }


    /**
     * This will create the file being
     * read and read each line until the end of the
     * file
     * 
     * @param input
     *            The file name
     * @throws FileNotFoundException
     *             If there is no file
     */
    public void startParseProcess(String input) throws FileNotFoundException {
        inputToScan = new File(input); // Makes file object
        fileScanner = new Scanner(inputToScan); // Creates scanner
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            parseInformation(line);
        }
        fileScanner.close();

    }


    /**
     * This method is responsible
     * for parsing through the information and deciding
     * which command to execute
     * 
     * @param input
     *            is the name of the file
     */
    private void parseInformation(String input) {
        String[] token = new String[6];
        input = input.trim();
        token = input.split("\\s+");
        switch (token[0]) {
            case "insert": {
                String dNASequence = token[1];
                String length = token[2];
                String nextLine = fileScanner.nextLine();
                //move to the bin file using first fit
                break;
                
            }
            case "remove": {
                String dNASequence = token[1];
                break;
            }
            case "print": {
               
                break;
            }
            case "search": {
                String dnaSequence = token[1];
                break;
            }

            default:
                break;
            // Not possible, no syntax errors in project
        }
    }

}
