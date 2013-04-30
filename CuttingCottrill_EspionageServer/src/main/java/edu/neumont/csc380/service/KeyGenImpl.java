package edu.neumont.csc380.service;

import java.math.BigInteger;
import java.util.Random;

public class KeyGenImpl {

	public MyKeyPair getKeyPair(BigInteger prime1, BigInteger prime2){
		BigInteger product = prime1.multiply(prime2);
		int[] coprimes = new int[]{
				11,
				13,
				17,
				19,
				23,
				29,
				31,
				37,
				41,
				43,
				47,
				53,
				59,
				61,
				67,
				71,
				73,
				79,
				83,
				89,
				97
		};
		Random gen = new Random();
		int coprime = coprimes[gen.nextInt(coprimes.length)];
		BigInteger t = (prime1.subtract(BigInteger.ONE)).multiply(prime2.subtract(BigInteger.ONE));
		BigInteger mmi = BigInteger.valueOf(coprime).modInverse(product);
		MyPublicKey publicKey = new MyPublicKey(product, BigInteger.valueOf(coprime));
		MyPrivateKey privateKey = new MyPrivateKey(product, mmi);
		return new MyKeyPair(publicKey, privateKey);
	}
}
