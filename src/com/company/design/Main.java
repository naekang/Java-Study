package com.company.design;

import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
//	// Singleton Pattern Example
//
//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient aClient = aClazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));

        // Adapter design pattern
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // 220v를 상속받았기 떄문에 문제가 생김
        Cleaner cleaner = new Cleaner();
        // 어댑터 사오기
        Electronic110V adapter = new SocketAdapter(cleaner);

        Airconditioner airconditioner = new Airconditioner();
        Electronic110V airAdapter = new SocketAdapter(airconditioner);

        connect(airAdapter);

//        connect(cleaner);
    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
