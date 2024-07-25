package week3;

public class Account {//定义一个类
	   private String name;
	   private double balance;
	   private String accID;//定义成员变量
         // constructor构造器
	   public Account(String accountID, String accountName, double amount)//
	   {  
		   /*构造器用于初始化新创建的对象。
		   它的名字与类名相同，并且没有返回类型*/
		   
		   accID = accountID;
		   name = accountName;
		   balance = amount;
	   }
	   //  accessors访问器方法
	   /*访问器方法用于获取私有成员变量的值。它们通常以 get 开头，
	    * 后跟变量名的首字母大写形式。*/
	   public double getBalance() { return balance; }
	   public String getID() { return accID; }
	   public String getName() { return name; }
	//  mutators performing common operations withdraw, deposit, transfer 变更器方法
	   public void deposit(double amount) {
		  balance  += amount; //计算总的存款deposit，即：balance=balance+amount
	   }
	   public boolean withdraw(double amount) {
	       boolean result = false;	
	       if (balance >= amount)	{
	          balance = balance - amount;
	          result = true;
	        }
	        return result;
	   }
	   public boolean transfer(Account account, double amount) { 
		      if (balance >= amount) {
		          balance = balance - amount;//这个balance 是属于dad的
		          account.balance = account.balance + amount; //这个balance是属于mom的
		          return true;
		       }
		       else return false;
		   }

}// end of class       

/*JAVA中的public boolean是判断布尔类型变量的意思， 
 它的回答只有TRUE和FALSE，当符合条件，会返回TRUE，
  如果不符合条件，会返回FALSE
  
  *public void方法不返回任何值。
public boolean方法返回一个布尔值。  */
