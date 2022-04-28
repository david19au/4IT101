package cz.david19au.soubory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZpracovaniSouboru {

    public static void zpracovani(File soubor) {
        List<LogProcessor> logs = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(soubor);
            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    String[] lineInputs = line.split(" ");
                    logs.add(new LogProcessor(
                            Integer.parseInt(lineInputs[1]),
                            Integer.parseInt(lineInputs[2]),
                            Integer.parseInt(lineInputs[3]),
                            Integer.parseInt(lineInputs[4]),
                            Integer.parseInt(lineInputs[5]),
                            lineInputs[6],
                            lineInputs[7]));
                }
                catch (Exception e) {
                    System.out.println("Špatný formát řádku na " + index + " .");
                    System.out.println("Ukončuji program.");
                    System.exit(1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Soubor neexistuje nebo nedokážu jej přečíst.");
            System.exit(1);
        }

        List<LogProcessor> logCount = LogsFilterDateTimeOperation(logs);
        System.out.println("Temp");
    }

    public static List<LogProcessor> LogsFilterDateTimeOperation(List<LogProcessor> logProcessors) {
        List<LogProcessor> logsProcessed = logProcessors.stream().filter(logProcessor -> LogProcessor.isInHourRange(10,14) && LogProcessor.isDefinedOperation("OPTIONS"))).collect(Collectors.toList());
        logsProcessed.stream().forEach(logProcessor -> {
            System.out.println(logProcessor.toString());});

        return logsProcessed;

    }



}
