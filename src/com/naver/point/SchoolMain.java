package com.naver.point;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PointDAO pointDAO = new PointDAO();
		PointDTO pointDTO = null;

		System.out.println("1. 로그인하여 점수알아보기");
		System.out.println("2. 점수 추가하기");
		System.out.println("3. 삭제");
		int number = sc.nextInt();

		switch(number) {
		case 1: 
			//아이디 패스워드로 정보찾기
			System.out.println("id 입력");
			String id = sc.next();
			System.out.println("pw 입력");
			String pw = sc.next();

			pointDTO = new PointDTO();
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
			break;

		case 2:
			//번호 이름 국어 영어 수학 입력
			pointDTO = new PointDTO();
			System.out.println("num 입력");
			pointDTO.setNum(sc.nextInt());
			System.out.println("name 입력");
			pointDTO.setName(sc.next());
			System.out.println("kor 입력");
			pointDTO.setKor(sc.nextInt());
			System.out.println("eng 입력");
			pointDTO.setEng(sc.nextInt());
			System.out.println("math 입력");
			pointDTO.setMath(sc.nextInt());

			pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
			pointDTO.setAvg(pointDTO.getTotal()/3);

			int result = pointDAO.insert(pointDTO);

			if(result>0) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
			break;

		case 3:
			//num으로 찾기
			System.out.println("num입력");
			int num = sc.nextInt();
			
			result = pointDAO.delete(num);
			
			if(result>0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			break;
			
		}
	}//main

}
