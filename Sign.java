import java.security.MessageDigest;


	
        /*	调用方式：
      	//比如账号 15077778888 密码 123456 其中 5SING_KUGOU是必须加上去的，拼接就好。
	//基于安全问题，本人所用的是假账号，如您测试时，请用自己去官网注册账号。
        String str=signAccount("150777788885SING_KUGOU123456");
        System.out.print(str);
         */

public class Sign {

	/**
	 * 这里就是把账号和密码加密后的MD5值
	 * 只要调用此方法即可得到
	 */
    public static final String signAccount(String paramString)
    {
        int  i = 0;
        String str = null;
        int j = 16;
        char[] arrayOfChar1 = new char[j];
        char[] tmp14_12 = arrayOfChar1;
        char[] tmp15_14 = tmp14_12;

        tmp15_14[0] = 48;
        tmp15_14[1] = 49;
        char[] tmp24_15 = tmp15_14;

        tmp24_15[2] = 50;
        tmp24_15[3] = 51;
        char[] tmp33_24 = tmp24_15;

        tmp33_24[4] = 52;
        tmp33_24[5] = 53;
        char[] tmp42_33 = tmp33_24;

        tmp42_33[6] = 54;
        tmp42_33[7] = 55;
        char[] tmp53_42 = tmp42_33;
        tmp53_42[8] = 56;
        tmp53_42[9] = 57;
        char[] tmp64_53 = tmp53_42;
        tmp64_53[10] = 65;
        tmp64_53[11] = 66;
        char[] tmp75_64 = tmp64_53;
        tmp75_64[12] = 67;
        tmp75_64[13] = 68;
        tmp75_64[14] = 69;
        tmp75_64[15] = 70;
        try
        {
            byte[] arrayOfByte = paramString.getBytes();
            Object localObject = "MD5";
            localObject = MessageDigest.getInstance((String)localObject);
            ((MessageDigest)localObject).update(arrayOfByte);
            localObject = ((MessageDigest)localObject).digest();
            int k =( (byte[])localObject).length;
            j = k * 2;
            char[] arrayOfChar2 = new char[j];
            j = 0;
            arrayOfByte = null;
            while (i < k)
            {
                int m = ( (byte[])localObject)[i];
                int n = j + 1;
                int i1 = m >>> 4 & 0xF;
                i1 = arrayOfChar1[i1];
                arrayOfChar2[j] = (char) i1;
                j = n + 1;
                m &= 0xF;
                m = arrayOfChar1[m];
                arrayOfChar2[n] = (char) m;
                i += 1;
            }
            str = new String(arrayOfChar2);

        }
        catch (Exception localException)
        {
            for (;;)
            {
                localException.printStackTrace();
                i = 0;
                str = null;
            }
        }
        return str;
    }

}
