package com.springmvc.bulidJson;

//组建json
public class BiuldJson {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("{");
		sb.append("颜色").append(":").append("白色").append(",");
		sb.append("车架号").append(":").append("456456465").append(",");
		sb.append("发动机号").append(":").append("4515WER").append(",");
		sb.append("gps1").append(":").append("456").append(",");
		sb.append("gps2").append(":").append("233").append(",");
		sb.append("gps3").append(":").append("144").append(",");
		sb.append("gps4").append(":").append("121").append("}");

		System.out.println(sb.toString());

		final  StringBuilder stringBuilder = new StringBuilder("haha");
		System.out.println("stringBuilder 中的内容是什么"+stringBuilder);
		System.out.println(stringBuilder+"的哈希值是:"+stringBuilder.hashCode());
		stringBuilder.append("改变了");
		System.out.println("stringBuilder 改变的值是什么"+stringBuilder);
		System.out.println(stringBuilder+"改变后的哈希值是"+stringBuilder.hashCode());

//		stringBuilder = new StringBuilder("");

		System.out.println("-----------------哈希值-------------------");
		BiuldJson test = new BiuldJson();
		System.out.println(test.hashCode());
		System.out.println(Integer.toHexString(test.hashCode()));
		System.out.println(test.getClass()+"@"+Integer.toHexString(test.hashCode()));
		System.out.println(test.getClass().getName()+"@"+Integer.toHexString(test.hashCode()));
		//在API中这么定义toString()等同于 getClass().getName() + '@' + Integer.toHexString(hashCode())
		//返回值是 a string representation of the object.
		System.out.println(test.toString());

	}
}
