package com.zking.eurekaprovider.shiro;


import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.List;

/**
 * 用于shiro权限认证的密码工具类
 */
public class PasswordHelper {

    /**
     * 随机数生成器
     */
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    /**
     * 指定hash算法为MD5
     */
    private static final String hashAlgorithmName = "md5";

    /**
     * 指定散列次数为1024次，即加密1024次
     */
    private static final int hashIterations = 1024;

    /**
     * true指定Hash散列值使用Hex加密存. false表明hash散列值用用Base64-encoded存储
     */
    private static final boolean storedCredentialsHexEncoded = true;

    /**
     * 获得加密用的盐
     *
     * @return
     */
    public static String createSalt() {
        return randomNumberGenerator.nextBytes().toHex();
    }

    /**
     * 获得加密后的凭证
     *
     * @param credentials 凭证(即密码)
     * @param salt        盐
     * @return
     */
    public static String createCredentials(String credentials, String salt) {
        SimpleHash simpleHash = new SimpleHash(hashAlgorithmName, credentials,
                salt, hashIterations);
        return storedCredentialsHexEncoded ? simpleHash.toHex() : simpleHash.toBase64();
    }


    /**
     * 进行密码验证
     *
     * @param credentials        未加密的密码
     * @param salt               盐
     * @param encryptCredentials 加密后的密码
     * @return
     */
    public static boolean checkCredentials(String credentials, String salt, String encryptCredentials) {
        return encryptCredentials.equals(createCredentials(credentials, salt));
    }

    public static void main(String[] args) {

        String abc = "1,2,3";
//        String[] arr = abc.split(",");
        List<String> gameids = java.util.Arrays.asList(abc.split(","));
        for (String s:gameids
             ) {
            System.out.println(s);
        }
//        String salt = createSalt();
//        System.out.println(salt);
//        System.out.println(salt.length());
//        String credentials = createCredentials("888888", salt);
//        System.out.println(credentials);
//        System.out.println(credentials.length());
//
//        String[] arr1 = new String[]{"1","2","3","7","9"};
//        String[] arr2 = new String[]{"1","2","3","7"};
//String[] arro = arrContrast(arr1, arr2);//“arro”就是您想得到的数组
// System.out.println("您想要的结果为：");

//for (String str : arro) {
//
//System.out.println(str);
//
//}

    }
}
