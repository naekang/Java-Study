package com.company.design.singleton;

public class SocketClient {

    // 자기 자신을 객체로 가지고 있어야 함
    private static SocketClient socketClient = null;

    // 기본 생성자를 private으로 막음
    private SocketClient() {

    }

    // static 메소드를 통해 get instance라 메소드를 제공해야함
    public static SocketClient getInstance() {

        // 현재 내가 가지고 있는 객체가 null이면 새로 생성
        // 아니면 그대로 반환
        if(socketClient == null) {
            socketClient = new SocketClient();
        }

        return socketClient;

    }

    public void connect() {
        System.out.println("connect");
    }

}
