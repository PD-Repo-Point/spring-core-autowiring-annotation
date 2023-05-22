package pd.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    @Qualifier("custDAO")
    private CustomerDao customerDao;

    public CustomerService() {  }
    public CustomerService(CustomerDao customerDao) {this.customerDao = customerDao;}
    //@Autowired
    public void setCustomerDao(CustomerDao customerDao) {this.customerDao = customerDao;}
    public CustomerDao getCustomerDao() { return customerDao; }
}

