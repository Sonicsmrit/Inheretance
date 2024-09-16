public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Big one",123312,"Shrestha");
        GrandParent grandParent = new GrandParent("shrestha");
        Son s1 = new Son("Bhaktapur",12341,"weee","elis");
        daughter d1 = new daughter("Pokhara",12312121,"Shrestha","Alys");

        System.out.println(parent.caste);
        System.out.println(s1.house);
        System.out.println(d1.name);
    }
}