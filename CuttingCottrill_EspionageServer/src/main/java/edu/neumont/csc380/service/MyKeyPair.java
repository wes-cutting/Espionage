package edu.neumont.csc380.service;

public class MyKeyPair {
	MyPublicKey publicKey;
	MyPrivateKey privateKey;
	public MyKeyPair(MyPublicKey publicKey, MyPrivateKey privateKey){
		this.publicKey = publicKey;
		this.privateKey = privateKey;
	}
}
