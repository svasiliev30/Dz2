package sbp.user;

import java.util.Objects;

public class User {
    private final String name;
    private final String name2;
    private final int firstYear;
    private final int firstYear2;

    /**
     * Получаем и приравниваем переменные данные.
     * @param firstYear
     * @param firstYear2
     * @param name
     * @param name2
     * @return
     */
    public User(int firstYear, int firstYear2, String name, String name2) {
        this.name = name;
        this.name2 = name2;
        this.firstYear = firstYear;
        this.firstYear2 = firstYear2;
    }

    /**
     * Отсылаем имя 1 персонажа.
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Отсылаем имя 2 персонажа.
     * @return
     */
    public String getName2() {
        return this.name2;
    }

    /**
     * Отсылаем возраст 1 персонажа.
     * @return
     */
    public int getFirstYear() {
        return firstYear;
    }

    /**
     * Отсылаем возраст 2 персонажа.
     * @return
     */
    public int getFirstYear2() {
        return firstYear2;
    }

    /**
     * Отсылаем общую информацию о персонажах.
     * @return
     */
    @Override
    public String toString() {
        return "Персонажу " + this.name + " " + this.firstYear + " лет. Персонажу "
                + this.name2 + " " + this.firstYear2 + " лет.";
    }

    /**
     * Сравниваем данные персонажей с помощью equals, если они равны то вернется true ,если нет то false.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstYear == user.firstYear && firstYear2 == user.firstYear2 && name.equals(user.name) && name2.equals(user.name2);
    }

    /**
     * Сравниваем данные персонажей с помощью hashCode, если они равны то вернется true ,если нет то false.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, name2, firstYear, firstYear2);
    }
}






