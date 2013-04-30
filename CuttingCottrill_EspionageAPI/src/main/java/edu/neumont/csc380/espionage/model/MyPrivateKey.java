package edu.neumont.csc380.espionage.model;

import java.math.BigInteger;

public class MyPrivateKey {
	BigInteger product;
	BigInteger mmi;
	public MyPrivateKey(BigInteger product, BigInteger mmi){
		this.product = product;
		this.mmi = mmi;
	}
}
