package com.javaAngels;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/ServerWebSocket")
public class ServerWebSocket {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("-- THIS IS onOpen or Onconnect method  ---" + session.hashCode());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        System.out.println("-- THIS IS On Message method----" + session.hashCode());
        session.getBasicRemote().sendText("Hi I am Server and you send me a message -------" + message);
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("-- THIS IS On close  method----" + session.hashCode());
    }

}
