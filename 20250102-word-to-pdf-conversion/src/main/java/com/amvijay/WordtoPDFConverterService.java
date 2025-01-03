package com.amvijay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordtoPDFConverterService {

    public void convert(String wordDocumentName) {

        List<String> commands = new ArrayList<String>();
        commands.add("libreoffice");
        commands.add("--headless");
        commands.add("--convert-to");
        commands.add("pdf");
        commands.add(wordDocumentName);

        ProcessBuilder processBuilder = new ProcessBuilder(commands);
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Exit Code ::" + exitCode);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}