package org.amalitech.classcode_20122019;
import java.util.Scanner;

public class ClassCode_20122019 {

	
		
		/*
		//boolean b_bool = true;
		int s = 10, d = 20;
		
		while(s<d) {
			System.out.println("The value of s is " + Integer.toString(s));
			System.out.println("It's true s is less than d");
			s++;
		}
		*/
		
	
	static String searchNumber;
	
	static double userAccountBalance;

    static String[] listOfItemsInStore_arr = {

                                "Milo",
                                "Milk",
                                "Gari",
                                "Chips",
                                "Sugar",
                                "Nido",
                                "Cowbell",
                                "Key Soap",
                                "Neat Fufu",
                                "Neat Ab3kwan",
                                "Cornflakes",
                                "Biscuit",
                                "Ayigbe Toffee"                       

 };

   

    static double [] price_of_items = {

                                20.00, //Milo
                               10.00, //Milk
                                15.00, //Gari
                                12.00, //Chips
                                32.00, //Sugar
                                20.00, //Nido
                                10.00, //Cowbell
                                15.00, //Key Soap
                                12.00, //Neat Fufu
                                32.00, //Neat Ab3kwan
                                20.00, //Cornflakes
                                10.00, //Biscuit
                                800.00  //Ayigbe Toffee
 
    };

 

    public static void main(String[] args) {

 

              Scanner input = new Scanner(System.in);                                      

               double def_acc_bal_d =580.00;
         
               setUserAccountBalance(def_acc_bal_d);             

               tellUserAccountBalance("GHC", getUserAccountBalance());             

               System.out.println("The items available are:");


     for (int x=0; x<listOfItemsInStore_arr.length; x++)
     			{

                  System.out.println(Integer.toString(x+1)+"."+listOfItemsInStore_arr [x] + " Price is: GH " + price_of_items[x]);
     			}

     	System.out.println("Please Select an Item Number to buy");

          String kybd = input.nextLine();

  if (input_valid_selection(kybd)) 
  		{
	  	 
         int index_of_item = Integer.parseInt(kybd)-1;

         String purchase_validity = "";

         			if (price_of_items[index_of_item]>userAccountBalance)
         						{
         							purchase_validity = "Please Topup";

         						} else {
         									purchase_validity = "Balance Enough. You can buy";
         								}

         			System.out.println( "You chose: " + listOfItemsInStore_arr[index_of_item] +
                		  							" and the price is GH " + price_of_items[index_of_item]+ purchase_validity );
         			} else 
         						{
         							if(searchNumber.equals(""))
         								{
         									System.out.println("Enter what to search for");
         								}
         					
         					System.out.println("Please Enter The Right Number");

         					}
        

    						}

   
    
    public static boolean input_valid_selection(String user_Input) 
    	{
    		boolean validSel_bool = false;
    		for(int x=0; x<listOfItemsInStore_arr.length; x++) 
    			{
    				if(Integer.toString(x+1).equals(user_Input))
    					{
    						validSel_bool = true;
    						break;
    					}
    				else 
    						{
    							validSel_bool = false;
    						}
    				
    			}
    		
    		return validSel_bool;
    	}

    public static void setUserAccountBalance

    (double currentUserAccountBalance) 
    	{

               userAccountBalance = currentUserAccountBalance;

    	}

    public static double getUserAccountBalance() 
    	{

               return userAccountBalance;

    	}

   

    public static String balanceStmnt(String currency_str) 
    	{

	        String customerStmnt = "Your account balance is : "+currency_str+" ";

               return customerStmnt;

    	}

   

    public static void tellUserAccountBalance() 
    	{

    	System.out.println( balanceStmnt("GH¢") + getUserAccountBalance());

    	}


    public static void tellUserAccountBalance(double accountBal) 
    	{

         System.out.println( balanceStmnt("USD") + accountBal);

    	}


    public static void tellUserAccountBalance(String currency_str, double accountBal) 
    	{

         System.out.println( currency_str + accountBal);

    	}



}