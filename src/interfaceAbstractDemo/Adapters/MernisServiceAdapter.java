package interfaceAbstractDemo.Adapters;

import interfaceAbstractDemo.Abstract.*;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {
			boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			return result;
			
		} catch (Exception e) {
			e.toString();
			return false;
		}
		
	}

}
