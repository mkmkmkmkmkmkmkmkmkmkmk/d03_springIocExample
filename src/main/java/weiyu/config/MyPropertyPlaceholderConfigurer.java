package weiyu.config;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import static weiyu.utils.Base64Utils.decode;

/**
 * 5.重写 PropertyPlaceholderConfigurer 中祖先中PropertyResourceConfigurer的方法
 * protected String convertProperty(String propertyName, String propertyValue)
 * s实现Base64解密
 **/
////需要全参数构造方法注入application.xml中的NeedPropertyNames字段值
@AllArgsConstructor
////也必须有无参构造器否则applicationContext.xml会报错
@NoArgsConstructor
//@Data
public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
        //需要解密的属性列表
        private String[] needPropertyNames = {"jdbc.username","jdbc.password"};
        ////允许用户自己指定需要解密的属性名称
       /*  public void setneedPropertyNames(String[] needPropertyNames) {
            this.needPropertyNames = needPropertyNames;
        }*/
        //对传入的属性名进行判断，是否是属于解密的属性名。如果是返回true，否则返回false
        public boolean isNeedDecodePropertyName(String propertyName){
            //注意:和写法：return propertyName.equals(str)不一样
            for(String str:needPropertyNames){
                if(propertyName.equals(str)){
                    return true;
                }
            }
            return false;
        }
        //覆盖父类的方法，读取properties属性文件时就是调用该方法获取的名称和值
        protected String convertProperty(String propertyName, String propertyValue) {
            if(isNeedDecodePropertyName(propertyName)){
                return decode(propertyValue);
            }
            return propertyValue;
        }


}