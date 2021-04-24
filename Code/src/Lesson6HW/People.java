package Lesson6HW;
public class People {
    private static int totalCustomers = 0;
    private final int id = totalCustomers++;

    private String name;
    private String middleName;
    private String surname;
    private String address;
    private long cardNumber;
    private double debit;
    private double credit;
    private long timeLocal;
    private long timeInternational;
    private double internetTrafic;

    public People() {
    }

    public People(String name, String middleName, String surname, String address, long cardNumber, double debit, double credit, long timeLocal, long timeInternational, double internetTrafic) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeLocal = timeLocal;
        this.timeInternational = timeInternational;
        this.internetTrafic = internetTrafic;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", debit=" + debit +
                ", credit=" + credit +
                ", timeLocal=" + timeLocal +
                ", timeInternational=" + timeInternational +
                ", internetTrafic=" + internetTrafic +
                '}';
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

    public static void setTotalCustomers(int totalCustomers) {
        People.totalCustomers = totalCustomers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public long getTimeLocal() {
        return timeLocal;
    }

    public void setTimeLocal(long timeLocal) {
        this.timeLocal = timeLocal;
    }

    public long getTimeInternational() {
        return timeInternational;
    }

    public void setTimeInternational(long timeInternational) {
        this.timeInternational = timeInternational;
    }

    public double getInternetTrafic() {
        return internetTrafic;
    }

    public void setInternetTrafic(double internetTrafic) {
        this.internetTrafic = internetTrafic;
    }
}