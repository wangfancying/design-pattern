package com.hui.wang.state.pattern.v1;

/**
 * 房间状态
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public interface State {

	/**
	 * 预定房间
	 */
	void bookRoom();

	/**
	 * 退订房间
	 */
	void unsubscribeRoom();

	/**
	 * 入住
	 */
	void checkInRoom();

	/**
	 * 退房
	 */
	void checkOutRoom();
}
