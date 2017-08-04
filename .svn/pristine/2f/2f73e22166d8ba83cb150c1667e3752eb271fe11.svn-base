package com.hoau.hoauapp.common;

import java.security.MessageDigest;
import java.security.SignatureException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.hoau.hoauapp.util.AppUtil;

/**
 * This class defines common routines for generating authentication signatures
 * for AWS requests.
 */
public class Signature {
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

	/**
	 * Computes RFC 2104-compliant HMAC signature. *
	 * @param data The data to be signed.
	 * @param key
	 *            The signing key.
	 * @return The Base64-encoded RFC 2104-compliant HMAC signature.
	 * @throws java.security.SignatureException
	 *             when signature generation fails
	 */
	public static String calculateRFC2104HMAC(String data, String key)
			throws java.security.SignatureException {
		String result;
		try {
			
			// get an hmac_sha1 key from the raw key bytes
			SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(),
					HMAC_SHA1_ALGORITHM);

			// get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
			mac.init(signingKey);

			// compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(data.getBytes());

			MessageDigest md = MessageDigest.getInstance("MD5");
			 md.update(rawHmac);
			 byte b[] = md.digest();
			 int i;
			 StringBuffer buf = new StringBuffer("");
			 for (int offset = 0; offset < b.length; offset++) {
			    i = b[offset];
			    if (i < 0)
			       i += 256;
			    if (i < 16)
			       buf.append("0");
			    buf.append(Integer.toHexString(i));
			 }
			
			// base64-encode the hmac
			result = new String(buf);

		} catch (Exception e) {
			throw new SignatureException("Failed to generate HMAC : "
					+ e.getMessage());
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		try {
			System.out.println(calculateRFC2104HMAC("628914" + "time", AppUtil.AUTHENTICATION_KEY));
		} catch (SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}