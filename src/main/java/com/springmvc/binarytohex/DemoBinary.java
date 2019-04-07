package com.springmvc.binarytohex;

import java.io.UnsupportedEncodingException;

/**
 * 字节与十六进制的相互转换
 * <p>
 * Title:DemoBinary
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年7月27日下午3:45:50
 */
public class DemoBinary {

	
	//	Java中有4个位运算，它们的运算规则如下：
	//	(1)按位与 （&） ：两位全为1，结果为1，否则为0；
	//	(2)按位或 （|） ：两位有一个为1，结果为1，否则为0；
	//	(3)按位取反（~）：0 变 1， 1变0；
	//
	//	(4)按位异或（^）：两位，如果相同，结果为0；如果不同，结果为1；
	/**
	 * 1、二进制字节转十六进制时，将字节高位与0xF0做"&"操作,然后再左移4位， 得到字节高位的十六进制A;将字节低位与0x0F做"&"操作，
	 * 得到低位的十六进制B，将两个十六进制数拼装到一块AB就是该字节的十六进制表示。
	 * 2、十六进制转二进制字节时，将十六进制字符对应的十进制数字右移动4为
	 * ，得到字节高位A;将字节低位的十六进制字符对应的十进制数字B与A做"|"运算，即可得到十六进制的二进制字节表示
	 */

	private static String hexStr = "0123456789ABCDEF";

	// 对应上面 的
	// 二进制表示
	private static String[] binaryArray = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "二进制与十六进制互转测试";
		System.out.println("源字符串：\n" + str);
		String hexString = BinaryToHexString(str.getBytes());
		System.out.println("转换为十六进制：\n" + hexString);
	    System.out.println("转换为二进制：\n"+bytes2BinaryStr(str.getBytes()));  
	          
	    byte [] bArray = HexStringToBinary(hexString);  
	   // new String(str.getBytes("UTF-8"), "GBK"); 如果这句也乱码，证明你的不是以UTF-8读入的
        System.out.println("将str的十六进制文件转换为二进制再转为String：\n"+new String(bArray)); 
	}

	/**
	 * 将二进制转换为十六进制字符输出
	 * 
	 * @Title:BinaryToHexString
	 * @Description:将二进制转换为十六进制字符输出
	 * @param bytes
	 * @return
	 * @author liuwanlin
	 * @date 2017年7月27日下午4:06:29
	 */
	public static String BinaryToHexString(byte[] bytes) {
	
		String result = "";
		String hex = "";
		for (int i = 0; i < bytes.length; i++) {
			// 字节高4位
			hex = String.valueOf(hexStr.charAt((bytes[i] & 0xF0) >> 4));
			// 字节低4位
			hex += String.valueOf(hexStr.charAt(bytes[i] & 0x0F));
			result += hex + " ";
		}
		return result;
	}

	/**
	 * 将十六进制转换为字节数组
	 * 
	 * @Title:HexStringToBinary
	 * @Description:将十六进制转换为字节数组
	 * @param hexString
	 * @return
	 * @author liuwanlin
	 * @date 2017年8月14日上午11:29:44
	 */
	public static byte[] HexStringToBinary(String hexString) {
		// hexString的长度对2取整，作为bytes的长度
		int len = hexString.length() / 2;
		byte[] bytes = new byte[len];
		byte high = 0;// 字节高四位
		byte low = 0;// 字节低四位
		for (int i = 0; i < len; i++) {
			// 右移四位得到高位
			high = (byte) ((hexStr.indexOf(hexString.charAt(2 * i))) << 4);
			low = (byte) hexStr.indexOf(hexString.charAt(2 * i + 1));
			bytes[i] = (byte) (high | low);// 高地位做或运算
		}
		return bytes;
	}

	/**
	 * 转换为二进制字符串
	 * 
	 * @Title:bytes2BinaryStr
	 * @Description:转换为二进制字符串
	 * @param bArray
	 * @return
	 * @author liuwanlin
	 * @date 2017年8月14日上午11:31:13
	 */
	public static String bytes2BinaryStr(byte[] bArray) {

	   String outStr = "";  
        int pos = 0;  
        for(byte b:bArray){  
            //高四位  
            pos = (b&0xF0)>>4;  
            outStr+=binaryArray[pos];  
            //低四位  
            pos=b&0x0F;  
            outStr+=binaryArray[pos];  
        }  
        return outStr;  
          

	}
}
