/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dipakshbehere
 */
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PermitValidator validator = new RegexPermitValidator();
            PermitService service = new PermitService(validator);
            Permit permit = null;
            
            while (permit == null) {
                System.out.print("Enter permit number (e.g. ABC-1234): ");
                String number = scanner.nextLine().trim();
                
                System.out.println("Choose a category from:");
                for (permitCategory cat : permitCategory.values()) {
                    System.out.println("  - " + cat);
                }
                System.out.print("Enter category exactly as shown: ");
                String choice = scanner.nextLine().trim();
                
                try {
                    permitCategory category = permitCategory.valueOf(choice);
                    permit = service.createPermit(number, category);
                    System.out.println("Permit created successfully: "
                            + permit.getNumber() + " [" + permit.getCategory() + "]");
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input or format. Please try again.\n");
                }
            }
        }
    }
}

