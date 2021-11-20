/**
 * Java.Homework5
 *
 * @author Vrezh Sargsyan
 * @version 20.11.2021
 */

class GBDZ5 {

    public static void main(String[] args) {
        Employee[] employees = {

                new Employee("Ivanov Ivan", "manager", "manager@mail.ru",
                        "+79590206447", 50000, 45),
                new Employee("ivanov Oleg", "manager", "manager2@mail.ru",
                        "+79593206443", 40000, 40),
                new Employee("ivanov Polina", "junior manager", "junior@mail.ru",
                        "+79593046885", 10000, 19),
                new Employee("Pavlov Pavel", "director", "direct@mail.ru",
                        "+79593280694", 40000, 45),
                new Employee("Sargsyan Vrezh", "cleaner", "Sargis@mail.ru",
                        "+79500206444", 40000, 27),
        };
        for (Employee employee : employees) {
            if (employee.getAge() >= 40) {
                System.out.println(employee);
            }
        }
    }

    static class Employee {
        private String name;
        private String positon;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String positon, String email, String phone, int salary, int age) {
            this.name = name;
            this.positon = positon;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return ("Name: " + name + ", Position: " + positon + ", Salary: " + salary
                    + ", Age: " + age + ", Phone: " + phone + ", Email: " + email);
        }
    }
}
