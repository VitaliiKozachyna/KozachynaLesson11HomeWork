public class User {
    private String name;
    private int date;
    private String month;
    private int year;
    private int age;
    private String eMail;
    private long phoneNumber;
    public String surname;
    public int weight;
    public int[] bloodPressure;
    public int steps;



    public User(String name, String surname, int date, String month, int year, String eMail, long phoneNumber,
                int weight, int[] bloodPressure, int steps) {
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.steps = steps;
        this.age = 2020 - this.year;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String geteMail() {
        return eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getBloodPressure() {
        return bloodPressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(int[] bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    void printAccountInfo(){
        System.out.printf("Користувач: ім'я %s, прізвище %s \n\t\t\tдата народження %d %s %d року,вік %d" +
                        " \n\t\t\te-mail %s, телефон %d \n\t\t\tвага %d кг, тиск %d-%d, кількість пройдених кроків %d \n\n",
                name, surname, date, month, year, age, eMail, phoneNumber, weight, bloodPressure[0], bloodPressure[1], steps);
    }
}
