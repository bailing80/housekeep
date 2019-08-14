package com.ccunix.ihousekeeping.wechatpay.service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
	
	 /** 
     * 密钥算法 
     */  
    private static final String ALGORITHM = "AES";  
    /** 
     * 加解密算法/工作模式/填充方式 
     */  
    private static final String ALGORITHM_MODE_PADDING = "AES/ECB/PKCS5Padding";  
    /** 
     * 生成key 
     */  
    private static SecretKeySpec key = new SecretKeySpec(LogisticsInfoMD5.encode("2IBtBXdrqC3kCBs4gaceL7nl2nnFadQv").toLowerCase().getBytes(), ALGORITHM);  
  
    /** 
     * AES加密 
     *  
     * @param data 
     * @return 
     * @throws Exception 
     */  
    public static String encryptData(String data) throws Exception {  
        // 创建密码器  
        Cipher cipher = Cipher.getInstance(ALGORITHM_MODE_PADDING);  
        // 初始化  
        cipher.init(Cipher.ENCRYPT_MODE, key);  
        return Base64Util.encode(cipher.doFinal(data.getBytes()));  
    }  
  
    /** 
     * AES解密 
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
