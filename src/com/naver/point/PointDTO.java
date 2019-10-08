package com.naver.point;

public class PointDTO {
	//접근지정자 private
	//데이터타입 table의 컬럼과 동일
	//오라클 데이터타입 : Number(전체자리수, 소수점자리수) -정수와 실수 모두 담을 수 있다.
	//Number(3) : 3자리수 인 '정수'만 넣겠다. - java : int, long
	//Number(4,2) : 소수점 2자리까지 담겠다. - java : double, float
	//Varchar2() : 가변길이 문자열 - java : String
	//Date : - java : java.sql.Date 또는 String
	//Clob : 대용량 텍스트 - java : String
	//변수명 table의 컬럼과 동일
	
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	
}
