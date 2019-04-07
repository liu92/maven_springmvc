package com.springmvc.headfrist.bridge.br;

/**
 * ClassName: Bridge
 * Description:
 * Author:   lin
 * Date:     2019/3/10 21:11
 * History:
 * <version> 1.0
 */
public abstract class Bridge {
    private SourDemo source;

    public void method(){
        source.method();
    }

    public SourDemo getSource() {
        return source;
    }

    public void setSource(SourDemo source) {
        this.source = source;
    }
}
