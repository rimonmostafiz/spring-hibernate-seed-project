package com.rimonmostafiz.core.services.impl;

import com.rimonmostafiz.core.entities.AppUser;
import com.rimonmostafiz.core.services.AppUserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Rimon Mostafiz
 */
@Repository
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void insertUser(AppUser user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
