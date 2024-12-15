package account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account("20180325",100397.00 );
		
		System.out.println("Account 1 Number: "+account1.getAccountNumber()+
						   "\nAccount 1 Balance : "+account1.getBalance());
		
		Account account2=new Account("",2003200.00);
		
		Account account3=new Account("1400900.00",-2510.98);
	}

}
