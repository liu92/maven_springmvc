package com.springmvc.service;

import com.springmvc.po.Position;

import java.util.List;

/**
 * ClassName: PositionService
 * Description: 机构service
 * Date:     2019/3/17 18:26
 * History:
 * <version> 1.0
 * @author lin
 */
public interface PositionService {
    Position add(Position position);
    List<Position> findAll();

}
