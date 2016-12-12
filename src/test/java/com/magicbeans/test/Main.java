package com.magicbeans.test;

import com.magicbeans.push.bean.DeviceType;
import com.magicbeans.push.bean.Message;
import com.magicbeans.push.bean.NotificationType;
import com.magicbeans.push.queue.PushUtil;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		// 初始化配置文件
		Message message = new Message();
		message.setDeviceId("1a1018970aa982fbc55"); // 设备ID
		message.setContent("这只是一个测试透传-IOS。");
		message.setDeviceType(DeviceType.ios); // 推送设备类型
		message.setAppType("member"); // 推送用户类型
		message.setNotificationType(NotificationType.passthrough);
//		message.setSound("");
		// 设置扩展参数
		Map<String, String> extend = new HashMap<String, String>();
		extend.put("username", "190e35f7e04de8cb89a");
		message.setExtend(extend);
		
//		for (int i = 0; i < 2; i++) {
//			Push.getInstance().addQueue(message);

			PushUtil.pushMessage(message);
//			message.setDeviceType(DeviceType.ios);
//		}
	}
}