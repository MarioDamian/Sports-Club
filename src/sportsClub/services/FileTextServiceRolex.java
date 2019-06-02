package sportsClub.services;

import sportsClub.sponsors.SponsorRolex;

import java.io.*;

public class FileTextServiceRolex {
    private static FileTextServiceRolex ourInstance = new FileTextServiceRolex();

    private FileTextServiceRolex() {
    }

    public static FileTextServiceRolex getInstance() {
        return ourInstance;
    }

    public void writeTextToFile(String textToWrite, String fileNamePath) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileNamePath));

            printWriter.println(textToWrite);
            printWriter.flush();
            printWriter.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public SponsorRolex readRolexFromFile(String fileNamePath) {
        SponsorRolex rolex = null;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader((fileNamePath)));
            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            rolex = new SponsorRolex(values[0], Integer.parseInt(values[1]), Boolean.parseBoolean(values[2]), Boolean.parseBoolean(values[3]));
            lineNumberReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return rolex;
    }
}
