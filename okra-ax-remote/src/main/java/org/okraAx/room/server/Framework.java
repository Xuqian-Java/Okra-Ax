package org.okraAx.room.server;

import org.okraAx.room.component.Facade;
import org.okraAx.room.fy.RoomManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TinyZ.
 * @version 2017.05.07
 */
public enum Framework {

    INSTANCE;

    private static final String springConfigPath = "classpath:spring/spring.xml";

    public void start() {
        //  Spring Context
        ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext(springConfigPath);
        cpxac.registerShutdownHook();
        //  Bootstrap Login Server
        RoomManager manager = new RoomManager();
        manager.start();

        Facade.INSTANCE.initialize();

        synchronized (manager) {
            try {
                manager.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //
    }





}
