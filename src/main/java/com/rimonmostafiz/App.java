package com.rimonmostafiz;

import com.rimonmostafiz.config.AppConfig;
import com.rimonmostafiz.core.entities.AppUser;
import com.rimonmostafiz.core.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Rimon Mostafiz
 */
@Component
public class App {

    @Autowired
    AppUserService appUserService;

    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = context.getBean(App.class);
        AppUser user = new AppUser();
        user.setId(1);
        user.setName("Spring");
        user.setCreateDate(new Date());
        app.task(user);
    }

    private void task(AppUser user) {
        appUserService.insertUser(user);
    }
}
