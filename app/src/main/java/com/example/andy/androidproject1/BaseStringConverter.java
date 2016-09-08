package com.example.andy.androidproject1;

/**
 * Helper class that returns a string formatted result of a base conversion
 * @author Andrew Jarombek
 * @since 9/6/2016
 */
public class BaseStringConverter implements Converter {

    BaseConverter baseConverter;

    public BaseStringConverter() {
        baseConverter = new BaseConverter();
    }

    /**
     * Main logic for the base conversions
     * @param number The number to be converted
     * @param inputBase The base of the number to be converted
     * @param outputBase The base to be converted to
     * @return The converted number
     */
    public String convertBase(String number, String inputBase, String outputBase) {
        switch (inputBase) {
            case "Base 2":
                switch (outputBase) {
                    case "Base 8":
                        return binaryToOctal(number);
                    case "Base 10":
                        return binaryToDecimal(number);
                    case "Base 16":
                        return binaryToHex(number);
                    default:
                        return  "Matching Bases, Number is still " + number;
                }
            case "Base 8":
                switch (outputBase) {
                    case "Base 2":
                        return octalToBinary(number);
                    case "Base 10":
                        return octalToDecimal(number);
                    case "Base 16":
                        return octalToHex(number);
                    default:
                        return  "Matching Bases, Number is still " + number;
                }
            case "Base 10":
                switch (outputBase) {
                    case "Base 2":
                        return decimalToBinary(number);
                    case "Base 8":
                        return decimalToOctal(number);
                    case "Base 16":
                        return decimalToHex(number);
                    default:
                        return  "Matching Bases, Number is still " + number;
                }
            case "Base 16":
                switch (outputBase) {
                    case "Base 2":
                        return hexToBinary(number);
                    case "Base 8":
                        return hexToOctal(number);
                    case "Base 10":
                        return hexToDecimal(number);
                    default:
                        return  "Matching Bases, Number is still " + number;
                }
            default:
                return "Matching Bases, Number is still " + number;
        }
    }

    @Override
    public String decimalToBinary(String decimal) {
        return "The Decimal Number " + decimal + " in Binary is: " +
                baseConverter.decimalToBinary(decimal);
    }

    @Override
    public String decimalToOctal(String decimal) {
        return "The Decimal Number " + decimal + " in Octal is: " +
                baseConverter.decimalToOctal(decimal);
    }

    @Override
    public String decimalToHex(String decimal) {
        return "The Decimal Number " + decimal + " in Hexadecimal is: " +
                baseConverter.decimalToHex(decimal);
    }

    @Override
    public String binaryToOctal(String binary) {
        return "The Binary Number " + binary + " in Octal is: " +
                baseConverter.binaryToOctal(binary);
    }

    @Override
    public String binaryToDecimal(String binary) {
        return "The Binary Number " + binary + " in Decimal is: " +
                baseConverter.binaryToDecimal(binary);
    }

    @Override
    public String binaryToHex(String binary) {
        return "The Binary Number " + binary + " in Hexadecimal is: " +
                baseConverter.binaryToHex(binary);
    }

    @Override
    public String octalToBinary(String octal) {
        return "The Octal Number " + octal + " in Binary is: " +
                baseConverter.octalToBinary(octal);
    }

    @Override
    public String octalToDecimal(String octal) {
        return "The Octal Number " + octal + " in Decimal is: " +
                baseConverter.octalToDecimal(octal);
    }

    @Override
    public String octalToHex(String octal) {
        return "The Octal Number " + octal + " in Hexadecimal is: " +
                baseConverter.octalToHex(octal);
    }

    @Override
    public String hexToBinary(String hex) {
        return "The Hexadecimal Number " + hex + " in Binary is: " +
                baseConverter.hexToBinary(hex);
    }

    @Override
    public String hexToOctal(String hex) {
        return "The Hexadecimal Number " + hex + " in Octal is: " +
                baseConverter.hexToOctal(hex);
    }

    @Override
    public String hexToDecimal(String hex) {
        return "The Hexadecimal Number " + hex + " in Decimal is: " +
                baseConverter.hexToDecimal(hex);
    }
}

