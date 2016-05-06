/*
 *   Copyright 2016 - 2026 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.ogcs.ax.command;


import io.netty.channel.ChannelFutureListener;
import org.ogcs.app.AppContext;
import org.ogcs.app.Command;
import org.ogcs.app.Session;
import org.ogcs.ax.component.AxConnector;
import org.ogcs.ax.component.SpringContext;
import org.ogcs.ax.component.inner.AxReplys;
import org.ogcs.ax.component.manager.AxInnerCoManager;
import org.ogcs.ax.component.manager.ConnectorManager;
import org.ogcs.ax.gpb.OkraAx;
import org.ogcs.ax.gpb.OkraAx.AxInbound;

/**
 * @author : TinyZ.
 * @email : ogcs_tinyz@outlook.com
 * @date : 2016/4/28
 */
public class INNER_ADD_CO implements Command<Session, AxInbound> {

    private ConnectorManager connectorManager = (ConnectorManager) AppContext.getBean(SpringContext.MANAGER_CONNECTOR);

    private AxInnerCoManager components = (AxInnerCoManager) AppContext.getBean(SpringContext.MANAGER_AX_COMPONENT);

    @Override
    public void execute(Session session, AxInbound axInbound) throws Exception {
        OkraAx.AxReqAuth axReqAuth = OkraAx.AxReqAuth.parseFrom(axInbound.getData());

        components.add("", 1L, null);


        System.out.println("节点注册成功.");
    }
}
