package com.company;

import java.security.MessageDigest;

public class SignedAccount {

    public static void main(String[] args) {
        /**调用方式：
      	比如账号 15077778888 密码 123456 其中 5SING_KUGOU是必须加上去的，拼接就好。
	    基于安全问题，本人所用的是假账号，如您测试时，请用自己去官网注册账号。
        String str=signAccount("150777788885SING_KUGOU123456");
        System.out.print(str);
         */
        String str=signedAccount("150777788885SING_KUGOU123456");
        System.out.println(str);


    }

    /**
     * 这里就是把账号和密码加密后的MD5值
     * 只要调用此方法即可得到
     */
    public static String signedAccount(String paramString)
    {

        int j, i = 0;
        String afterHasEncrypt;
        char[] seeds ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try
        {
            byte[] bytes = paramString.getBytes();
            Object mdsObject = "MD5";
            mdsObject = MessageDigest.getInstance((String)mdsObject);
            ((MessageDigest)mdsObject).update(bytes);
            mdsObject = ((MessageDigest)mdsObject).digest();
            int k =( (byte[])mdsObject).length;
            j = k * 2;
            char[] temps = new char[j];
            j = 0;
            while (i < k){
                int m = ( (byte[])mdsObject)[i];
                int n = j + 1;
                int i1 = m >>> 4 & 0xF;
                i1 = seeds[i1];
                temps[j] = (char) i1;
                j = n + 1;
                m &= 0xF;
                m = seeds[m];
                temps[n] = (char) m;
                i += 1;
            }
            afterHasEncrypt = new String(temps);
        }
        catch (Exception localException) {
                localException.printStackTrace();
                afterHasEncrypt = null;
        }
        return afterHasEncrypt;
    }
}
