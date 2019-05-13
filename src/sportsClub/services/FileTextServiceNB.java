package sportsClub.services;

import sportsClub.sponsors.SponsorNB;

import java.io.*;

public class FileTextServiceNB {
    private static FileTextServiceNB ourInstance = new FileTextServiceNB();

    private FileTextServiceNB() {
    }

    public static FileTextServiceNB getInstance() {
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

    public SponsorNB readAdidasFromFile(String fileNamePath) {
        SponsorNB nb = null;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader((fileNamePath)));
            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            nb = new SponsorNB(values[0], Integer.parseInt(values[1]), Boolean.parseBoolean(values[2]), Boolean.parseBoolean(values[3]));
            lineNumberReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return nb;
    }
}
