package Serializable;

import java.io.Serializable;

public class SinhVien implements Serializable{

	 private String HoTen;
	 private String MSSV;
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
}
