package lab2;

import lombok.ToString;

@ToString
public class Client {
    private final Debt debt;
    private final Bonus bonus;
    private final Name name;
    private final Salary salary;

    public Client(Debt debt, Bonus bonus, Name name, Salary salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    public static class Debt{
        int debt;
        public Debt(int debt){
            this.debt = debt;
        }
    }

    public static class Bonus{
        int bonus;
        public Bonus(int bonus){
            this.bonus = bonus;
        }
    }

    public static class Name{
        String name;
        public Name(String name){
            this.name = name;
        }
    }

    public static class Salary{
        int salary;
        public Salary(int salary){
            this.salary = salary;
        }
    }
}
