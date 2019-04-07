package com.springmvc.dao.impl;

import com.springmvc.dao.BaseDao;
import com.springmvc.po.Position;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: PositionDao
 * Description:
 * Date:     2019/3/17 17:03
 * History:
 * <version> 1.0
 * @author lin
 */
@Repository
public class PositionDao extends BaseDao<Position> {


    public Position add(Position position){
        super.save(position);
        return position;
    }

    public List<Position> findAll(){
        String hql ="from Position where 1=1";
        return  super.findByHQLResultMore(hql,null);
    }

}
