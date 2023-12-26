public class PaymentController {

	private Payment paymentMethod;
	
	public void setPaymentMethod(Payment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		this.paymentMethod.pay();
	}
}
