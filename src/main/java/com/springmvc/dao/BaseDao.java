package com.springmvc.dao;

import com.springmvc.util.StringUtil;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * ClassName: BaseDao
 * Description: 基础dao
 * Author:   lin
 * Date:     2019/3/17 17:34
 * History:
 * <version> 1.0
 */
public class BaseDao <T extends Serializable>{

    @Resource
    private SessionFactory sessionFactory;

    private Class<T> classType;

    public Session getSession(){
        return  sessionFactory.getCurrentSession();
    }

    protected BaseDao(){
        Type superClass =this.getClass().getGenericSuperclass();
        if(superClass instanceof ParameterizedType){
            this.classType = (Class<T>) ((ParameterizedType) superClass).getActualTypeArguments()[0];
        }
    }

    protected T save(T t) {
        getSession().save(t);
        return t;
    }

    protected List<T> findByHQLResultMore(String hql, Map<String, Object> params) {
        if (StringUtil.isBlank(hql)) {
            return null;
        }
        Query query = getSession().createQuery(hql);
        if (MapUtils.isNotEmpty(params)) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (StringUtils.isNotBlank(entry.getKey())) {
                    if (entry.getValue().getClass().isArray()) {
                        Object[] objects = (Object[]) entry.getValue();
                        query.setParameterList(entry.getKey().toString(), objects);
                    } else if (List.class.isAssignableFrom(entry.getValue().getClass())) {
                        List objects = (List) entry.getValue();
                        query.setParameterList(entry.getKey().toString(), objects);
                    } else {
                        query.setParameter(entry.getKey().toString(), entry.getValue());
                    }
                }
            }
        }
        return query.list();
    }

}
