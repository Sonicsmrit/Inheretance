public class Parent extends GrandParent{
    public String house = "Big house";
    private int bankBalance = 12342131;

    public Parent(String house, int bankBalance, String caste) {
        super(caste); //super is used to create the grandfather before the parent when the
                     // constirctir is added. The caste from the Gparent is taken
        this.house = house;
        this.bankBalance = bankBalance;
    }
}


