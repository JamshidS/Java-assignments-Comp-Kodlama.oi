public class CustomerManager {

    //Business rules

    CustomerDal customerDal;
    public CustomerManager(CustomerDal customerDal){this.customerDal=customerDal;}
    public void add(){
        customerDal.add();
    }

}

