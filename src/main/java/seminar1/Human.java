package seminar1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Human {

    /**
     * добавить члена семьи
     * редактировать информацию о члене семьи
     * изменить девичью фамилию
     * изменить место проживание - (город - год)
     * посчитать возраст
     *
     */

    /**
     * name          - имя
     * surname       - фамилия
     * maidenName    - девичья фамилия
     * dateOfBirth   - дата рождения
     * dateOfDeath   - дата смерти
     * placeOfLiving - место проживания
     * placeOfBirth  - место рождения
     */

    private String name;
    private String surname;
    private Gender gender;
    private String maidenName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    private String placeOfLiving;
    private String placeOfBirth;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Gender getGender() {
        return gender;
    }


    public Human(String name, String surname, Gender gender, String maidenName,
                 LocalDate dateOfBirth, LocalDate dateOfDeath,
                 String placeOfLiving, String placeOfBirth){

        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.maidenName = maidenName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.placeOfLiving = placeOfLiving;
        this.placeOfBirth = placeOfBirth;

    }


    public int getAge(){

        if(dateOfDeath == null){
            dateOfDeath = LocalDate.now();
        }
        System.out.println("Возраст: (года/лет) " + name + " " + surname + " - ");
        return (int) ChronoUnit.YEARS.between(dateOfBirth, dateOfDeath);

    }

    @Override
    public String toString() {
        return  "имя: " + name +
                ", \nфамилия: " + surname +
                ", \nпол: " + gender +
                ", \nдевичья фамилия: " + maidenName +
                ", \nдата рождения: " + dateOfBirth +
                ", \nдата смерти: " + dateOfDeath +
                ", \nместо жизни: " + placeOfLiving +
                ", \nместо рождения: " + placeOfBirth +"\n";
    }


}
