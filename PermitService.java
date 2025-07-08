/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dipakshbehere
 */
public class PermitService {
    private final PermitValidator validator;

    public PermitService(PermitValidator validator) {
        this.validator = validator;
    }

    public Permit createPermit(String number, permitCategory category) {
        if (!validator.isValidFormat(number)) {
            throw new IllegalArgumentException("Invalid permit format");
        }
        return new Permit(number, category);
    }}



