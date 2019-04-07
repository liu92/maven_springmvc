package com.springmvc.finalizecase;

/**
 * ClassName: FinalizeCase
 * Description: 测试finalize
 * Author:   lin
 * Date:     2019/3/12 23:43
 * History:
 * <version> 1.0
 */
public class FinalizeCase {
     private static Block holder = null;

    public static void main(String[] args) {
        holder = new Block();
        holder = null;
        System.gc();
        //System.in.read();
    }

    static class Block {
        byte[] _200M = new byte[200*1024*1024];
    }
}
