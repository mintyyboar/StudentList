/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dipakshbehere
 */
public class Permit {
    private final String number;
    private final permitCategory category;

    public Permit(String number, permitCategory category) {
        this.number = number;
        this.category = category;
    }

    public String getNumber() { return number; }
    public permitCategory getCategory() { return category; }
}

