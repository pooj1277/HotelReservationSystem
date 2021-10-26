package com.bridgelabz.HotelReservationSystem;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	private ArrayList<Hotel> hotelArrList = new ArrayList<Hotel>();

	public void addToHotelArrayList(Hotel h) {
		hotelArrList.add(h);
	}

	public void printHotelArrList() {
		System.out.println("Updated Hotel array list is : ");
		System.out.println(getHotelArrList());
		System.out.println();
	}

	public List<Hotel> getHotelArrList() {
		return hotelArrList;
	}
}

