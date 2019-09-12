package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Encapsulation: ");
        Encapsulation encapsulationClass = new Encapsulation();
        encapsulationClass.notEncapsul="Я не инкапулирована!";
    //encapsulationClass.Encapsul="Я не инкапулирована!"; Encapsul - инкапулированная переменная=> доступ к ней получить нельзя
        encapsulationClass.printAll();
        System.out.println("Inheritance: ");
            Inheritor inheritor = new Inheritor();
            System.out.print(inheritor.getIName());
            System.out.println(inheritor.getName());

        System.out.println("Polymorphism: ");
            Main main = new Main();
            P_Parent p_polimorf_1 = new P_Polimorf_1();
            P_Parent p_polimorf_2 = new P_Polimorf_2();
            main.knowLovelyProduct(p_polimorf_1);
            main.knowLovelyProduct(p_polimorf_2);
    }
    void knowLovelyProduct(P_Parent p_parent)
    {
System.out.println(p_parent.getLovelyProduct());
    }
}

