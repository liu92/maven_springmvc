package com.springmvc.rsa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Scanner;

import javax.crypto.Cipher;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * JAVA RSA密钥对的生成与验证
 * <p>
 * Title:KeyPairGenUtil
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年7月21日下午2:41:06
 */
public class KeyPairGenUtil {

	/** 指定加密算法为RSA */
	private static final String ALGORITHM = "RSA";
	/** 密钥长度，用来初始化 */
	private static final int KEYSIZE = 1024;
	/** 指定公钥存放文件 */
	private static String PUBLIC_KEY_FILE = "PublicKey";
	/** 指定私钥存放文件 */
	private static String PRIVATE_KEY_FILE = "PrivateKey";

	public static void generateKeyPair() throws Exception {
		// /** RSA算法要求有一个可信任的随机数源 */
		// SecureRandom secureRandom = new SecureRandom();
		// 使用RSA算法获得密钥对生成器对象keyPairGenerator
		KeyPairGenerator generator = null;
		try {
			// 初始化指定算法
			generator = KeyPairGenerator.getInstance(ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// 设置密钥长度为1024 位 ，1字节等8位
		generator.initialize(KEYSIZE);
		// 生成密钥对 每次调用时生成一个新的密钥对。
		KeyPair keyPair = generator.generateKeyPair();

		// RSAPublicKey继承接口 PublicKey, RSAKey； PublicKey 又继承Key
		// 获取公钥
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		// 获取私钥
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

		// 获取到公私钥对的时候，为了方便后续操作，我们一般将这两个key对象持久化到本地保存起来。

		// 保存公钥对象和私钥对象为持久化文件

		// 如果使用base64编码之后用 .
		// 得到公钥字符串
		// String publicKeyString =
		// Base64.encodeBase64String(publicKey.getEncoded());
		//
		// // 得到私钥字符串
		// String privateKeyString =
		// Base64.encodeBase64String(privateKey.getEncoded());
		//
		// // 因为这里经过base64进行字符串编码所以
		// FileWriter pubfw = new FileWriter(filePath + "/publicKey.keystore");
		// FileWriter prifw = new FileWriter(filePath + "/privateKey.keystore");

		// 如果不使用base64编码
		ObjectOutputStream oos1 = null;
		ObjectOutputStream oos2 = null;

		try {
			// 保存公钥对象和私钥对象为持久化文件
			oos1 = new ObjectOutputStream(new FileOutputStream(PUBLIC_KEY_FILE));
			// 你也可以一个字节一个字节的写入文件
			oos2 = new ObjectOutputStream(new FileOutputStream(PRIVATE_KEY_FILE));
			oos1.writeObject(publicKey);
			oos2.writeObject(privateKey);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			oos1.close();
			oos2.close();
		}

		// 在Java中提供了Cipher加密解密器来实现加解密操作，这个类在import javax.crypto.Cipher包下。
		// 在产生这个加密解密器对象的时候，需要在他的构造方法中传俩个值，一个是功能，一个是算法种类。
		// 功能就是说告诉他接下来这个对象是需要做加密操作还是解密操作，算法种类就是告诉他使用的加密算法。

	}

	// RSA加密公钥
	public static String encryptWithRSA(String publicKeyStr) throws Exception {
		generateKeyPair();
		Key publickey = null;
		// 读取持久化的公钥对象
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(PUBLIC_KEY_FILE));
			publickey = (Key) inputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
		// 获取一个加密算法为RSA的加解密器对象cipher。
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		// 设置为加密模式,并将公钥给cipher。
		cipher.init(Cipher.ENCRYPT_MODE, publickey);
		// 获得密文
		byte[] secret = cipher.doFinal(publicKeyStr.getBytes());
		// 进行Base64 Encoder编码并返回
		return new BASE64Encoder().encode(secret);
	}

	// RSA解密
	public static String decryptWithRSA(String secret) throws Exception {
		Key privatekey = null;
		// 字节流
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream(PRIVATE_KEY_FILE));
			privatekey = (Key) inputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}

		Cipher cipher = Cipher.getInstance(ALGORITHM);
		// 传递私钥，设置为解密模式
		cipher.init(Cipher.DECRYPT_MODE, privatekey);
		// 解密器解密由Base64 Decoder解码后的密文,获得明文字节数组
		byte[] t = cipher.doFinal(new BASE64Decoder().decodeBuffer(secret));
		return new String(t);
	}

	public static void main(String[] args) throws Exception {
		// 设置公私钥对存放路径，可选，默认是工程目录

		// RSAUtils.setKeyPath(str);
		System.out.println("请输入明文：");
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		System.out.println("============================");
		String secret = KeyPairGenUtil.encryptWithRSA(str);
		System.out.println("经过RSA加密后的密文为：");
		System.out.println(secret);
		System.out.println("============================");
		String original = KeyPairGenUtil.decryptWithRSA(secret);
		System.out.println("经过RSA解密后的原文为：");
		System.out.println(original);
	}
}
