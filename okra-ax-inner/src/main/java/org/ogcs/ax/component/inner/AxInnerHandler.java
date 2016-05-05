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

package org.ogcs.ax.component.inner;

import org.ogcs.ax.component.AxState;
import org.ogcs.ax.gpb.OkraAx.AxInbound;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler.Sharable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ogcs.app.Command;
import org.ogcs.app.Executor;
import org.ogcs.app.Session;
import org.ogcs.netty.handler.DisruptorAdapterHandler;


/**
 *
 * Inner handler extends {@link DisruptorAdapterHandler}.
 *
 * @author : TinyZ
 * @email : tinyzzh815@gmail.com
 * @since 1.0
 */
@Sharable
public class AxInnerHandler extends DisruptorAdapterHandler<AxInbound> {

    private static final Logger LOG = LogManager.getLogger(AxInnerHandler.class);

    @Override
    protected Executor newExecutor(Session session, AxInbound axRequest) {
        return new Executor() {

            @Override
            @SuppressWarnings("unchecked")
            public void onExecute() {
                try {
                    Command command = AxConsole.INSTANCE.interpretCommand(axRequest.getCmd());
                    command.execute(session, axRequest);
                } catch (Exception e) {
                    // unknown request id and close channel.
                    session.writeAndFlush(AxReplys.error(axRequest.getRid(), AxState.STATE_1_UNKNOWN_COMMAND), ChannelFutureListener.CLOSE);
                    LOG.info("Unknown command : " + axRequest.getCmd(), e);
                }
            }

            @Override
            public void release() {
                // no-op
            }
        };
    }
}