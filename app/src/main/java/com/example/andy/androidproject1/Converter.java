package com.example.andy.androidproject1;

/**
 * Interface for numeric conversions
 * @author Andrew Jarombek
 * @since 9/6/2016
 */
interface Converter {

    Object decimalToBinary(String decimal);
    Object decimalToOctal(String decimal);
    Object decimalToHex(String decimal);

    Object binaryToOctal(String binary);
    Object binaryToDecimal(String binary);
    Object binaryToHex(String binary);

    Object octalToBinary(String octal);
    Object octalToDecimal(String octal);
    Object octalToHex(String octal);

    Object hexToBinary(String hex);
    Object hexToOctal(String hex);
    Object hexToDecimal(String hex);

}
