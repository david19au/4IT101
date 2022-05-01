package cz.david19au.soubory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZpracovaniSouboru {

    public static void zpracovani(File soubor) throws FileNotFoundException {
        List<LogProcessor> logs = new ArrayList<>();
        Scanner scanner1 = new Scanner(soubor);
        int index = 0;
        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine();
            try {
                String[] lineInputs = line.split(" ");
                logs.add(new LogProcessor(
                        Integer.parseInt(lineInputs[0]),
                        Integer.parseInt(lineInputs[1]),
                        Integer.parseInt(lineInputs[2]),
                        Integer.parseInt(lineInputs[3]),
                        Integer.parseInt(lineInputs[4]),
                        lineInputs[5],
                        lineInputs[6]));
            } catch (Exception e) {
                System.out.println("Špatný formát řádku na " + index + " .");
                System.out.println("Ukončuji program.");
                System.exit(1);
            }
            index++;
        }
        List<LogProcessor> logCount = LogsFilterDateTimeOperation(logs);
        System.out.println("Zpracováno bylo " + index + " řádků.");
        System.out.println("Je " + logCount.stream().count() + " vyfiltrovaných logů.");
    }

    public static List<LogProcessor> LogsFilterDateTimeOperation(List<LogProcessor> logProcessors) {
        List<LogProcessor> logCount = logProcessors.stream().filter(logProcessor -> (logProcessor.isInHourRange(10, 14) && logProcessor.isDefinedOperation("OPTIONS"))).collect(Collectors.toList());
        logCount.stream().forEach(logProcessor -> {
            System.out.println(logProcessor.toString());
        });

        return logCount;

    }
}
