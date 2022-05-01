package cz.david19au.soubory;

public class LogProcessor {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private String ipAddress;
    private String operation;

    public LogProcessor(int day, int month, int year, int hour, int minute, String ipAddress, String operation) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.ipAddress = ipAddress;
        this.operation = operation;

    }

    public boolean isInHourRange(int upperRange, int lowerRange) {
        return ((lowerRange * 60) <= (hour * 60 + minute) && (upperRange * 60) >= (hour * 60 + minute)); // *60 cuz z hodin počítám minuty
    }

    public boolean isDefinedOperation(String definedOperation) {
        return operation.equals(definedOperation);
    }

    @Override
    public String toString() {
        return day + " " + month + " " + year + " " + hour + " " + minute + " " + ipAddress + " " + operation;
    }

}
