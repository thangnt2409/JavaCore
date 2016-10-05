package Calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		System.out.println("Thứ hiện tại (DAY_OF_WEEK): " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Năm hiện tại (YEAR): " + calendar.get(Calendar.YEAR));		  
		System.out.println("Tháng hiện tại (MONTH): " +(calendar.get(Calendar.MONTH) + 1 ));
		System.out.println("Ngày hiện tại (DAY_OF_MONTH): " +calendar.get(Calendar.DAY_OF_MONTH));				
		System.out.println("Ngày hiện tại (DATE): " +calendar.get(Calendar.DATE));		  
		System.out.println("Lấy giờ định dạng 12 là (HOUR): "+ calendar.get(Calendar.HOUR));
		System.out.println("Lấy giờ định dạng 24 là (HOUR_OF_DAY): "+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("AM - 0 / PM - 1 (AM_PM): " +calendar.get(Calendar.AM_PM));
		System.out.println("Phút hiện tại (MINUTE): " +calendar.get(Calendar.MINUTE));
		System.out.println("Giây hiện tại (SECOND): " +calendar.get(Calendar.SECOND));
		System.out.println("Mili giây hiện tại: (MILLISECOND)" +calendar.get(Calendar.MILLISECOND));
		System.out.println("DAY_OF_WEEK_IN_MONTH :" +calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Ngày của năm: (DAY_OF_YEAR)" +calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("GMT: " +calendar.get(Calendar.ZONE_OFFSET));
		System.out.println("ERA: " +calendar.get(Calendar.ERA));
	}
//	Thứ hiện tại (DAY_OF_WEEK): 3
//	Năm hiện tại (YEAR): 2016
//	Tháng hiện tại (MONTH): 10
//	Ngày hiện tại (DAY_OF_MONTH): 4
//	Ngày hiện tại (DATE): 4
//	Lấy giờ định dạng 12 là (HOUR): 4
//	Lấy giờ định dạng 24 là (HOUR_OF_DAY): 16
//	AM - 0 / PM - 1 (AM_PM): 1
//	Phút hiện tại (MINUTE): 17
//	Giây hiện tại (SECOND): 9
//	Mili giây hiện tại: (MILLISECOND)387
//	DAY_OF_WEEK_IN_MONTH :1
//	Ngày của năm: (DAY_OF_YEAR)278
//	GMT: 25200000
//	ERA: 1
}
