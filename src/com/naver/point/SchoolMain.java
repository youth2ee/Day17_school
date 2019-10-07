package com.naver.point;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PointDAO pointDAO = new PointDAO();
		PointDTO pointDTO = new PointDTO();
		
		System.out.println("id 입력");
		String id = sc.next();
		System.out.println("pw 입력");
		String pw = sc.next();
		
		pointDTO = pointDAO.search(id, pw);
		if(pointDTO!=null) {
			System.out.println("num : "+pointDTO.getNum());
			System.out.println("name : "+pointDTO.getName());
			System.out.println("kor : "+pointDTO.getKor());
			System.out.println("eng : "+pointDTO.getEng());
			System.out.println("math : "+pointDTO.getMath());
			System.out.println("total : "+pointDTO.getTotal());
			System.out.println("avg : "+pointDTO.getAvg());
	
		} else {
			System.out.println("로그인 오류");
		}
		
	}

}
