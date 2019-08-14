package com.ccunix.ihousekeeping.base.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
	
	 /** 
     * 瀵嗛挜绠楁硶 
     */  
    private static final String ALGORITHM = "AES";  
    /** 
     * 鍔犺В瀵嗙畻娉�/宸ヤ綔妯″紡/濉厖鏂瑰紡 
     */  
    private static final String ALGORITHM_MODE_PADDING = "AES/ECB/PKCS5Padding";  
    /** 
     * 鐢熸垚key 
     */  
    private static SecretKeySpec key = new SecretKeySpec(LogisticsInfoMD5.encode("2IBtBXdrqC3kCBs4gaceL7nl2nnFadQv").toLowerCase().getBytes(), ALGORITHM);  
  
    /** 
     * AES鍔犲瘑 
     *  
     * @param data 
     * @return 
     * @throws Exception 
     */  
    public static String encryptData(String data) throws Exception {  
        // 鍒涘缓瀵嗙爜鍣�  
        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);  
        // 鍒濆鍖�  
        cipher.init(Cipher.ENCRYPT_MODE, key);  
        return Base64Util.encode(cipher.doFinal(data.getBytes()));  
    }  
  
    /** 
     * AES瑙ｅ瘑 
     *  
     * @param base64Data 
     * @return 
     * @throws Exception 
     */  
    public static String decryptData(String base64Data,SecretKeySpec key) throws Exception {  
        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);  
        cipher.init(Cipher.DECRYPT_MODE, key);  
        return new String(cipher.doFinal(Base64Util.decode(base64Data)));  
    }  
	
	
}
