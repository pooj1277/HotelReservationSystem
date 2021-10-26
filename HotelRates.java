package com.bridgelabz.HotelReservationSystem;

import java.util.Scanner;

public class HotelRates {

	public static HotelReservation hotelreservation = new HotelReservation();

	public static void main(String[] args) {
		System.out.println("----------WELCOME TO HOTEL RESERVATION SYSTEM----------");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of hotels you want to add : ");
		int count = sc.nextInt();
		sc.nextLine();
		int dummyCount = count;

		while (count-- > 0) {
			System.out.println("Enter the name of Hotel " + (dummyCount - count) + " : ");
			String name = sc.nextLine();

			System.out.println("Enter the rating of Hotel " + (dummyCount - count) + " : ");
			int rating = sc.nextInt();

			System.out.println("Enter the weekday rate for regular customer of Hotel " + (dummyCount - count) + " : ");
			int regularWeekDay = sc.nextInt();

			System.out.println("Enter the weekend rate for regular customer of Hotel " + (dummyCount - count) + " : ");
			int regularWeekEnd = sc.nextInt();

			System.out.println("Enter the weekday rate for reward customer of Hotel " + (dummyCount - count) + " : ");
			int rewardWeekDay = sc.nextInt();

			System.out.println("Enter the weekend rate for reward customer of Hotel " + (dummyCount - count) + " : ");
			int rewardWeekEnd = sc.nextInt();

			sc.nextLine();
			Hotel dummyH = new Hotel(name, rating, regularWeekDay, regularWeekEnd, rewardWeekDay, rewardWeekEnd);
			hotelreservation.addToHotelArrayList(dummyH);

		}
		System.out.println();
		hotelreservation.printHotelArrList();
	}
}