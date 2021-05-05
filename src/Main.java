import java.util.Date;
import interfaceAbstractDemo.Abstract.*;
import interfaceAbstractDemo.Concrete.*;
import interfaceAbstractDemo.Entities.*;
import interfaceAbstractDemo.Adapters.*;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
     BaseCustomerManager customerManager1 = new NeroCustomerManager();
     customerManager1.Save(new Customer("ENGÝN", "DEMÝROÐ", LocalDate.of(1985,01,06) ,"28861499108"));
     
     BaseCustomerManager customerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
     customerManager.Save(new Customer("ENGÝN", "DEMÝROÐ", LocalDate.of(1985,01,06) ,"28861499108"));

     
	}


}
