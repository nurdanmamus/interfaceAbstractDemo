package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.*;
import interfaceAbstractDemo.Entities.*;

public class SturbucksCustomerManager extends BaseCustomerManager  {
	
	ICustomerCheckService iCustomerCheckService;
	
	public SturbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this.iCustomerCheckService = iCustomerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if (this.iCustomerCheckService.CheckIfRealPerson(customer)) {
//			System.out.println("Valid person");
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}
	
	
	

}
