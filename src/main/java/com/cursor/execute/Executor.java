package com.cursor.execute;

import com.cursor.config.JavaConfig;
import com.cursor.service.Scheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public static void execute() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Scheduler scheduler = context.getBean(Scheduler.class);
        scheduler.getTime();
    }
}
