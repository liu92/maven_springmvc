package com.springmvc.service.impl;

import com.springmvc.dao.impl.PositionDao;
import com.springmvc.po.Position;
import com.springmvc.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PositionServiceImpl
 * Description: 机构实现类
 * Author:   lin
 * Date:     2019/3/17 19:07
 * History:
 * <version> 1.0
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    @Override
    public Position add(Position position) {
        return positionDao.add(position);
    }

    @Override
    public List<Position> findAll() {
        return positionDao.findAll();
    }
}
