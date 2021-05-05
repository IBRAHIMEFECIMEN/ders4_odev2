package hafta4odev2;

public class StartbucksCustomerManager extends BaseCustomerManager{
	
	private final CustomerCheckService customerService;
	
	
	public StartbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService = customerService;
	}


	@Override
	public void save(Customer customer) {
		if(customerService.CheckIfRealPerson(customer)) {
			System.out.println("Veritabanına kayıt başarılı : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullanıcı kayıtlı değil.");
		}
	}
}