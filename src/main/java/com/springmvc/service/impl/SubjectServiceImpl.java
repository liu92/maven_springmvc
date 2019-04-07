
package com.springmvc.service.impl;

import com.springmvc.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能描述: <br>
 * 〈〉
 * 目标类
 * 实现类， 在有的方法上添加事务，其他的方法上不添加事务。
 * 假如有个接口，它包含两个方法a和b，然后有一个类实现了该接口。在该实现类里在a上标上事务注解、b上不标，此时事务是怎样的？
 * @return:
 * @since: 1.0.0
 * @Author:lin
 * @Date: 2019/3/9 13:13
 */
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{


    @Transactional(propagation = Propagation.SUPPORTS,rollbackFor = {RuntimeException.class})
    @Override
    public void doNeedTx() {
        System.out.println("execute doNeedTx in ServiceImpl");

    }

    @Override
    public void doNotneedTx() {
        this.doNeedTx();
    }
}
