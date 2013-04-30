package edu.neumont.csc380.espionage.service;

import java.math.BigInteger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import edu.neumont.csc380.espionage.model.MyKeyPair;

@WebService 
public interface KeyGen {
	@WebMethod
	MyKeyPair getKeyPair(@WebParam BigInteger prime1, BigInteger prime2);
}
