package interfaceAbstractDemo.Concrete;
import interfaceAbstractDemo.Abstract.*;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
