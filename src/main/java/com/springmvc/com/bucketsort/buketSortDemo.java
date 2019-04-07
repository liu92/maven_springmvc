package com.springmvc.com.bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
     *  桶排序
     * @ProjectName:    buketSortDemo.java
     * @Package:        com.springmvc.com.bucketsort
     * @ClassName:      buketSortDemo
     * @Description:    java类作用描述
     * @Author:         作者姓名
     * @CreateDate:     2018/10/15 0015 11:13
     * @UpdateUser:     作者姓名
     * @UpdateDate:     2018/10/15 0015 11:13
     * @UpdateRemark:   The modified content
     * @Version:        1.0
     */
public class buketSortDemo {

    public  static double[] buketSort(double[] array){
        // 1.得到 数列的 最大值 和最小值 ，并算出 差值d
       double max = array[0];
       double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
        double d = max -min;

        // 2.初始化桶
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i = 0; i <bucketNum ; i++) {
            bucketList.add(new LinkedList<Double>());
        }

        // 3.遍历原始数组，将每个元素 放入桶 中
        for (int i = 0; i <array.length ; i++) {
            int num = (int) ((array[i] - min)*(bucketNum-1)/d);
            bucketList.get(num).add(array[i]);
        }

        // 4.对每个桶 内部进行排序
        for (int i = 0; i <bucketList.size() ; i++) {
             // JDK 底层 采用了归并排序和归并的优化版本
            Collections.sort(bucketList.get(i));

        }

        // 5.输出全部元素
        double[] sortedArray = new double[array.length];

        // int index = 0;
        // Lambda与匿名内部类在访问外部变量时，都不允许有修改变量的倾向，即若：
        // sortedArray[index] = element; 错误
        //final  int index = 0; // 而起这里不改为 final 因为在  index++ 是值会变化
        // 所以这里不使用 Lamba 表达式 了
//        bucketList.forEach(list -> {
//             list.forEach(element ->{
//                sortedArray[index] = element;
//                index++;
//             });
//         }
//        );

        int index = 0 ;
        for (LinkedList<Double> list : bucketList) {
            for (double element : list) {
                 sortedArray[index] = element;
                 index++;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        double[] array = new double[]{4.12,6.412,0.0023,3.0,2.123,8.122,4.12,10.09};
        double[] sortedArray = buketSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
