class CustomerDBConnection{
	private CustomerCollection customerCollection;
	
	private static CustomerDBConnection customerDBConnection;
	
	private CustomerDBConnection(){
		customerCollection=new CustomerCollection();	
	}
	public static CustomerDBConnection getInstance(){
		if(customerDBConnection==null){
			customerDBConnection=new CustomerDBConnection();
		}
		return customerDBConnection;
	} 
	public CustomerCollection getCustomerCollection(){
		return customerCollection;
		
	}
}
