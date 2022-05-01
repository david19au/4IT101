import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZpracovaniSouboru {

    public static void zpracovani(File soubor) throws FileNotFoundException {
        List<LogProcessor> logy = new ArrayList<>();

        Scanner scan = new Scanner(soubor);
        int index = 0;
        while (scan.hasNextLine()) {
            String radek = scan.nextLine();
            try {
                String[] dataZRadku = radek .split(" ");
                logy.add(new LogProcessor(
                        Integer.parseInt(dataZRadku[0]),
                        Integer.parseInt(dataZRadku[1]),
                        Integer.parseInt(dataZRadku[2]),
                        Integer.parseInt(dataZRadku[3]),
                        Integer.parseInt(dataZRadku[4]),
                        dataZRadku[5],
                        dataZRadku[6]));
            } catch (Exception e) {
                System.out.println("Špatný formát řádku na " + index + " .");
                e.printStackTrace();
            }
            index++;
        }
        List<LogProcessor> vyfiltrovaneLogy = HandleLogDTOs(logy);
        System.out.println("Zpracováno bylo " + index + " řádků.");
        System.out.println("Je " + logy.stream().count() + " vyfiltrovaných logů.");
        System.out.println("Vyfiltrovaných řádků je " + vyfiltrovaneLogy.stream().count() + ".");
    }

    public static List<LogProcessor> HandleLogDTOs(List<LogProcessor> logProcessors) {
        List<LogProcessor> vyfiltrovaneLogy = logProcessors.stream().filter(logProcessor -> (logProcessor.isInHourRange(10, 14) && logProcessor.isOperation("OPTIONS"))).collect(Collectors.toList());
        vyfiltrovaneLogy.stream().forEach(logProcessor -> {
            System.out.println(logProcessor.toString());
        });

        return vyfiltrovaneLogy;

    }
}
