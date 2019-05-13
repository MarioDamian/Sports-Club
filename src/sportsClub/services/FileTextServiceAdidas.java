package sportsClub.services;

import sportsClub.sponsors.SponsorAdidas;

import java.io.*;

public class FileTextServiceAdidas {
    private static FileTextServiceAdidas ourInstance = new FileTextServiceAdidas();

    private FileTextServiceAdidas() {
    }

    public static FileTextServiceAdidas getInstance() {
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

    public SponsorAdidas readAdidasFromFile(String fileNamePath) {
        SponsorAdidas adidas = null;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader((fileNamePath)));
            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            adidas = new SponsorAdidas(values[0], Integer.parseInt(values[1]), Boolean.parseBoolean(values[2]), Boolean.parseBoolean(values[3]));
            lineNumberReader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return adidas;
    }
}
