package login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public class sha1changer {
	public String change(String pass) {
		String hexString=null;
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			byte[] sha1Byte = sha1.digest(pass.getBytes());

			//Java17以降からしか使用出来ない
			HexFormat hex = HexFormat.of().withLowerCase();
			hexString = hex.formatHex(sha1Byte);
			
		} catch (NoSuchAlgorithmException e) {

		}
		return hexString;
	}

}