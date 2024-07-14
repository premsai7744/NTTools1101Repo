package com.nt.service;

public class Payment {
	public String doCardPayment() {
		return "Do Card Payment is done";
	}
	public String doUpiPayment() {
		return "Upi Payment is done";
	}

	public String payPall(String url) {
		return "Paypall integration is done";
	}
	public String enableBharatPe() {
		//BharatPe configuration is going on
		return "bharat pe integration is done";

	}
}
