package edu.neumont.csc380.service;

import java.math.BigInteger;

public class MyPublicKey {
	BigInteger product;
	BigInteger coprime;
	public MyPublicKey(BigInteger product, BigInteger coprime){
		this.product = product;
		this.coprime = coprime;
	}
}
