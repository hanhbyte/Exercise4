import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class HouseHold {
    private ArrayList<People> household =new ArrayList<>();
    private int amountPeople;
    private int apartmentNumber;

    public HouseHold() {
    }

    public HouseHold(int amountPeople, int apartmentNumber) {
        this.amountPeople = amountPeople;
        this.apartmentNumber = apartmentNumber;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString(){
        String resulf = "";
        for (int i = 0; i< amountPeople; i++){
            resulf += household.get(i).toString();
        }
        return "HouseHold{"+
                "AmountPeople" +amountPeople+
                "ApartmentNumber" +apartmentNumber+
                '}' +resulf;
    }

    public People setInforPeople(People people) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputPeople = new Scanner(System.in);
        System.out.println("input name");
        String name = inputString.nextLine();
        System.out.println("input job");
        String job = inputString.nextLine();
        System.out.println("input born");
        LocalDate age = setDate();
        people.setName(name);
        people.setAge(age);
        people.setJob(job);
        return people;
    }

    public LocalDate setDate() {
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        int day;
        System.out.println("input year");
        year = input.nextInt();
        System.out.println("input month");
        month = input.nextInt();
        System.out.println("input day");
        day = input.nextInt();
        return LocalDate.of(year, month, day);
    }
}
