/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dipakshbehere
 */
public class RegexPermitValidator implements PermitValidator {
    @Override
    public boolean isValidFormat(String permitNumber) {
        // Example pattern: three uppercase letters, dash, four digits
        return permitNumber.matches("[A-Z]{3}-\\d{4}");
    }
}
