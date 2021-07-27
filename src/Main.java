import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        town.addHouseHolds();
        for (int i = 0; i <Town.list.size(); i++) {
            for (int j = 0; j <Town.list.get(i).getAmountPeople(); j++) {
                People thisHuMan = Town.list.get(i).getApartmentNumber().get(j);
                if (thisHuMan.getAge().plusYears(80).isAfter(LocalDate.now()));
                System.out.println(Town.list.get(i));
                break;
            }
        }
    }
}
