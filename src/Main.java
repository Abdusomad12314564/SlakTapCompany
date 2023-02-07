import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //todo Бул бир компаниянын толук маалыматын жана андагы группа жана студенттерди чыгарып берет.Кодту көргөн адам иштетип көрмөйүнчө түшүнбөйт.

        Company com = new Company("Peaksoft", "Kyrgyzstan", LocalDate.of(2018, 10, 1),
                new Person("Esen", "Niyazov", LocalDate.of(1992, 1, 1)),
                new Group[]{new Group(" \"Java\"", LocalDate.of(2023, 1, 3), "Chyngyz Sharshekeev",
                        new Student[]{new Student("Abdusomad", "Koshmamatov", 31, 555123456),
                                new Student("Temirlan", "Juzukulov", 24, 555987654),
                                new Student("Akkaiyn", "Ruslan uulu", 25, 777123456)})});


        System.out.println("Компания: " + com.getNameCom() +
                "\nМекени: " + com.getCountry() +
                "\nНегизделген күнү: " + com.getYearOfFoundation() +
                "\nНегиздөөчү: " + com.getFounder() +
                "\nГруппа: " + Arrays.toString(com.getGroups()));

    }
}

