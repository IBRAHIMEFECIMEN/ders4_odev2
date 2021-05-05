package hafta4odev2;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
            return "İbrahim Efe".equals(customer.getFirstName());
	}
}