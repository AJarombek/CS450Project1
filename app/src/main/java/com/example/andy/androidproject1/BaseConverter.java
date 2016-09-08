package com.example.andy.androidproject1;

/**
 * Helper class to convert decimal numbers to different bases
 * @author Andrew Jarombek
 * @since 9/6/2016
 */
public class BaseConverter implements Converter {

    @Override
    public String decimalToBinary(String decimal) {
        int num = Integer.parseInt(decimal);
        return Integer.toString(num, 2);
    }

    @Override
    public String decimalToOctal(String decimal) {
        int num = Integer.parseInt(decimal);
        return Integer.toString(num, 8);
    }

    @Override
    public String decimalToHex(String decimal) {
        int num = Integer.parseInt(decimal);
        return Integer.toString(num, 16);
    }

    @Override
    public String binaryToOctal(String binary) {
        int bin = Integer.parseInt(binary, 2);
        return Integer.toString(bin, 8);
    }

    @Override
    public String binaryToDecimal(String binary) {
        return String.valueOf(Integer.parseInt(binary, 2));
    }

    @Override
    public String binaryToHex(String binary) {
        int bin = Integer.parseInt(binary, 2);
        return Integer.toString(bin, 16);
    }

    @Override
    public String octalToBinary(String octal) {
        int oct = Integer.parseInt(octal, 8);
        return Integer.toString(oct, 2);
    }

    @Override
    public String octalToDecimal(String octal) {
        return String.valueOf(Integer.parseInt(octal, 8));
    }

    @Override
    public String octalToHex(String octal) {
        int oct = Integer.parseInt(octal, 8);
        return Integer.toString(oct, 16);
    }

    @Override
    public String hexToBinary(String hex) {
        int h = Integer.parseInt(hex, 16);
        return Integer.toString(h, 2);
    }

    @Override
    public String hexToOctal(String hex) {
        int h = Integer.parseInt(hex, 16);
        return Integer.toString(h, 8);
    }

    @Override
    public String hexToDecimal(String hex) {
        return String.valueOf(Integer.parseInt(hex, 16));
    }
}
