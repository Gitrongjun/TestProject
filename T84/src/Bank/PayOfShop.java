package Bank;

public class PayOfShop {
public static void zhifubao(String username,int paymoney){
	pay pay = new Bankservise();
	pay.paypay(username, paymoney);
}
}
