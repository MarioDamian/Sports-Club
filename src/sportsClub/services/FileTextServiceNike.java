package sportsClub.services;

import sportsClub.sponsors.SponsorNike;

import java.io.*;

public class FileTextServiceNike {
    private static FileTextServiceNike ourInstance = new FileTextServiceNike();

    private FileTextServiceNike() {
    }

    public static FileTextServiceNike getInstance() {
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

    public SponsorNike readAdidasFromFile(String fileNamePath) {
        SponsorNike nike = null;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader((fileNamePath)));
            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            nike = new SponsorNike(values[0], Integer.parseInt(values[1]), Boolean.parseBoolean(values[2]), Boolean.parseBoolean(values[3]));
            lineNumberReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return nike;
    }
}
