package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end): null;
    }

    public Boolean isValid(int start, int end) {
        return (isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end));
    }

    public Boolean isInRange(int number) {
        return (number >= 1 && number <= 1000);
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();

        for (int row = start; row <= end; row++) {
            table.append(generateLine(start, row)).append(System.lineSeparator());
        }
        return table.toString().trim();
    }

    public String generateLine(int start, int row) {
        StringBuilder line = new StringBuilder();
        for (; start <= row; start++) {
            line.append(generateSingleExpression(start, row)).append("  ");
        }
        return line.toString().trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
