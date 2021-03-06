package com.lib.funsdk.support;

import com.lib.funsdk.support.models.FunDevice;

public interface OnFunDeviceConnectListener extends OnFunListener {

	/**
	 * 设备连接成功
	 * @param funDevice 设备对象
	 */
	public void onDeviceReconnected(final FunDevice funDevice);
	
	/**
	 * 设备已经断开
	 * @param funDevice
	 */
	public void onDeviceDisconnected(final FunDevice funDevice);
}
