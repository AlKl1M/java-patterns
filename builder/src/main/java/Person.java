public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    /**
     * Внутренний статический класс для пошагового конструирования объекта Person
     */
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        /**
         * Возвращает новый экземпляр Person, используя внутренний
         * PersonBuilder для установки значений полей
         *
         * @return Person
         */
        public Person build() {
            return new Person(this);
        }
    }
}
