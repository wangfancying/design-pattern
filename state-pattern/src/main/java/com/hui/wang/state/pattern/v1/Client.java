package com.hui.wang.state.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Room room = new Room();
		room.checkInRoom();
		room.bookRoom();
		room.checkOutRoom();

		room.bookRoom();
	}
}
