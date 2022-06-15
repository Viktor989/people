public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surnameName, int age, String address) {
        this.name = name;
        this.surname = surnameName;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public boolean hasAge() { return age != 0;   }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress (String address) {
        if (!hasAddress()) {
            this.address = address;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else
            System.out.println("Возраст не известен. Мы не знаем когда день рожденья!");

    }

    @Override
    public String toString() {
        return  " Имя ='" + name + '\'' +
                ", Фамилия ='" + surname + '\'' +
                ", Возраст = " + age +
                ", Город проживания ='" + address + "'";
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

}
