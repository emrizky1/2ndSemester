public class StoreMain {
    public static void main (String[] args) {
        Store[] stores = new Store[3];

        stores[0] = new Store("BookStore 1", 1000000, 10);
        stores[1] = new Store("BookStore 2", 750000, 5);
        stores[2] = new Store("BookStore 3", 1200000, 20);

        stores[0].printData();
        stores[1].printData();
        stores[2].printData();

        int storesQuan = 0;
        double dailySale = 0;

        for (int i = 0; i < stores.length; i++) {
            storesQuan++;
            dailySale += stores[i].dailySale;
        }
        double avg = dailySale/storesQuan;

        System.out.println("The average sales from all stores: " + avg);

        double highest = stores[0].dailySale;
        double displaySale = 0;
        for (Store store : stores) {
            if (highest < store.dailySale) {
                displaySale = store.dailySale;
                highest = displaySale;
            }
        }

        System.out.println("The highest sales are with sales of: " + displaySale);

        double highStore = 0;

        for (int i = 0; i < stores.length; i++) {
            if (stores[i].dailySale > 800000) {
                highStore++;
            }
        }

        double percentage = highStore/3*100;
        System.out.println("The precentage of the stores with more than 800000: " + percentage);
    }
}
