package seminar1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();


        Human relative1 = new Human("Дарья", "Синицына", Gender.valueOf("Female"), null,
                LocalDate.of(1990,01,12), null,
                "Актау", "Санкт-Петербург");
        Human relative2 = new Human("Иван", "Иванов", Gender.valueOf("Male"), null,
                LocalDate.of(1990,05,18), null,
                "Санкт-Петербург", "Санкт-Петербург");


        familyTree.addPerson(relative1);
        familyTree.addPerson(relative2);

//        System.out.println(familyTree);
        System.out.println(familyTree.findByNameAndSurname("Дарья", "Син"));
        familyTree.getInfo("Дарья", "Синицына");
        familyTree.getInfo("Иван", "Иванов");
        System.out.println(relative1.getAge());


    }



}
