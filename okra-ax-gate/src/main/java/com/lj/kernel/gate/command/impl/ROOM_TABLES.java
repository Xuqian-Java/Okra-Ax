package com.lj.kernel.gate.command.impl;

import com.lj.kernel.gate.User;
import com.lj.kernel.gate.command.AgentCommand;
import com.lj.kernel.gpb.GpbD.Request;
import org.ogcs.app.Session;
import org.ogcs.ax.component.GpbReplys;
import org.ogcs.ax.component.Modules;
import org.ogcs.ax.component.inner.AxInnerClient;
import org.ogcs.ax.component.inner.AxReplys;

/**
 * 获取房间列表
 *
 * @author : TinyZ.
 * @email : ogcs_tinyz@outlook.com
 * @date : 2016/4/14
 */
public class ROOM_TABLES extends AgentCommand {

    @Override
    public void execute(Session session, Request request) throws Exception {
        User user = (User) session.getConnector();
        AxInnerClient client = components.getByHash(Modules.MODULE_CHESS, String.valueOf(user.getRoomId()));
        if (client == null) {
            session.writeAndFlush(GpbReplys.error(request.getId(), -1));
            return;
        }


        client.session().writeAndFlush(
                AxReplys.axInbound(user.id(), request.getId(), request.getApi(), request.getData())    //  转发接口为:cmd + 10000
        );
    }
}
