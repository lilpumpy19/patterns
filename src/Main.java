import adapter.Computer;
import adapter.MemoryCardAdapter;
import adapter.MemoryCardImpl;
import adapter.UsbImpl;
import factory.ICoffee;
import factory.CoffeeType;
import factory.FactoryCoffee;
import proxy.DatabaseImpl;
import proxy.DatabaseProxy;
import proxy.IDatabase;
import singleton.Logging;

public class Main {
    public static void main(String[] args) {
        //1.Singleton
        Logging logging = Logging.getInstance();
        logging.log(new Object(), "test");
        logging.log(new Object(), "test2");

        //2. Factory
        ICoffee coffee = FactoryCoffee.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(coffee.getName());

        //3. Adapter
        Computer computer = new Computer();
        computer.readInfo(new UsbImpl());
        computer.readInfo(new MemoryCardAdapter(new MemoryCardImpl()));

        //4. Proxy
        IDatabase database = new DatabaseProxy(new DatabaseImpl());
        System.out.println(database.connect());


    }
}