package com.hui.wang.state.pattern.v1;

/**
 * 房间预定状态
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class BookedState implements State{

	private Room hotelManagement;

	public BookedState(Room hotelManagement) {
		this.hotelManagement = hotelManagement;
	}

	@Override
	public void bookRoom() {
		System.out.println("该房间已近给预定了...");
	}

	@Override
	public void unsubscribeRoom() {
		System.out.println("入住成功...");
		hotelManagement.setState(hotelManagement.getCheckInState());
	}

	@Override
	public void checkInRoom() {

	}

	@Override
	public void checkOutRoom() {
		System.out.println("退订成功,欢迎下次光临...");
		hotelManagement.setState(hotelManagement.getFreeTimeState());
	}
}
