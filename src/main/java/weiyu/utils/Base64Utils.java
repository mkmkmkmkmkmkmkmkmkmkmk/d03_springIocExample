package weiyu.utils;

import org.apache.commons.codec.binary.*;

import java.io.UnsupportedEncodingException;

/**
 * Base64编码，解码
 **/
public class Base64Utils {
    /**
     * commons-code方式Base64编码
     * @param str
     * @return
     */
    public static String encode(String str) {
        byte[] result;
        try {
            result = Base64.encodeBase64(str.getBytes("UTF-8"));

        } catch (UnsupportedEncodingException e) {
           throw new RuntimeException("编码失败"+e);
        }
        return new String(result);
    }

    /**
     * commons-code方式Base64解码
     * @param str
     * @return
     */
    public static String decode(String str) {
        byte[] result = new byte[0];
        try {
            result = Base64.decodeBase64(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
          throw new RuntimeException("解码失败:"+e);
        }
        return new String(result);
    }

}
