/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: ProxyByJdkDynamic
 * Author:   lin
 * Date:     2019/3/9 13:16
 * Description: 代理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.springmvc.service;

/**
 * 功能描述: <br>
 *  代理类, 也要实现相同的接口
 * @Author:lin
 * @Date: 2019/3/9 13:17
 */

public class ProxyByJdkDynamic implements  SubjectService {

    /**
     包含目标对象
     */
    private  SubjectService target;

    public ProxyByJdkDynamic(SubjectService target) {
        this.target = target;
    }

    /**
     *
     目标类中此方法带注解，进行特殊处理
     * @Date: 2019/3/9 14:02
     */

    @Override
    public void doNeedTx() {
        //开启事务
        System.out.println("-> create Tx here in Proxy");
        //调用目标对象的方法，该方法已在事务中了
        target.doNeedTx();
        //提交事务
        System.out.println("<- commit Tx here in Proxy");
    }

    /**
     * @Description 目标类中此方法没有注解，只做简单的调用
     **/
    @Override
    public void doNotneedTx() {
        //直接调用目标对象方法
        target.doNotneedTx();
    }
}
