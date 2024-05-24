package seminar1;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    /**
     *  найти человека +
     *  выдать его детей
     *  выдать его родителей
     *  выдать информацию о человеке в формате имя фамилия, пол, девичья фамилия, возраст, семейное положение +
     */


    private List<Human> familyList;

    public FamilyTree(){
        familyList = new ArrayList<>();
    }

    public void addPerson(Human person){
        familyList.add(person);
    }

    public Human findByNameAndSurname(String personName, String personSurname){
        for(Human person: familyList){
            if(person.getName().equalsIgnoreCase(personName) && person.getSurname().equalsIgnoreCase(personSurname)){
                return person;
            }
        }
        System.out.println("Такого родственника в семейном дереве нет!");
        return null;
    }

    public void getInfo(String personName, String personSurname){
        for(Human person: familyList){
            if(person.getName().equalsIgnoreCase(personName) && person.getSurname().equalsIgnoreCase(personSurname)){
                System.out.println(person);
            }
            }
    }

    @Override
    public String toString() {

        StringBuilder listOfRelatives = new StringBuilder();
        listOfRelatives.append("Семейное дерево\n");
        for(Human person: familyList){
            listOfRelatives.append(person);
            listOfRelatives.append("\n");
        }
        return listOfRelatives.toString();
    }
}
