package org.okraAx.logic.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ogcs.app.AppContext;
import org.ogcs.app.Connector;
import org.ogcs.app.Session;
import org.okraAx.internal.inner.AxInnerClient;
import org.okraAx.internal.component.AxInnerCoManager;
import org.okraAx.internal.component.ConnectorManager;
import org.okraAx.internal.SpringContext;
import org.okraAx.v3.LogicPublicProto.ReqExitRoom;

/**
 * 游客. 仅用于游客模式.
 * 默认一切登录用户都为游客，完成登录授权之后切换为正式用户
 */
public class Guest implements Connector {

    private static final Logger LOG = LogManager.getLogger(Guest.class);

    private Session session;

    public Guest(Session session) {
        this.session = session;
    }

    public long id() {
        return -1L;
    }

    @Override
    public boolean isOnline() {
        return session != null && session.isActive();
    }

    @Override
    public Session session() {
        return session;
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void sessionActive() {

    }

    @Override
    public void sessionInactive() {
        exitRoom();
        LOG.info("Session : {} disconnect.", session.toString());
    }

    /**
     * Enter room
     *
     * @param module module
     * @param roomId the unique room id.
     */
    public void enterRoom(String module, long roomId) {

    }

    /**
     * Exit room.
     */
    public void exitRoom() {

    }
}
