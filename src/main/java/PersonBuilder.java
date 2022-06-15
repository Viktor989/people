public class PersonBuilder implements IPeopleBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный ввод данных");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        if (address != null) {
            this.address = address;

        } else this.address = "Адрес не заполнен";
        return this;
    }

    @Override
    public Person build() {
        if (name == null && surname == null) {
            throw new IllegalArgumentException("Обязательные поля не заполнены");
        } else return new Person(name, surname, age, address);
    }
}
