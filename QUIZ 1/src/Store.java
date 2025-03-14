public class Store {
    String storeName;
    double dailySale;
    int totalEmployees;

    public Store() {

    }

    public Store (String sn, double ds, int te) {
        storeName = sn;
        dailySale = ds;
        totalEmployees = te;
    }

    void printData() {
        System.out.println("Store name: " + storeName);
        System.out.println("Daily sales: " + dailySale);
        System.out.println("Total employees: " + totalEmployees);
    }
}