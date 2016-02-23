package com.frank.service;

import com.frank.dao.BloggerDao;
import com.frank.entity.Blogger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liyan on 2016/2/23.
 */
@Service
public class MvcService {

    @Resource
    private BloggerDao bloggerDao;

    public Blogger show(){
        Blogger blogger = new Blogger();
        blogger = bloggerDao.find();

        System.out.print("service run");
        return blogger;
    }
}
