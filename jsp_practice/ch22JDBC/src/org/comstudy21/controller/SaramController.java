package org.comstudy21.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.comstudy21.model.SaramDao;
import org.comstudy21.model.SaramDto;

public class SaramController {
	Scanner scan = new Scanner(System.in);

	public void service() {
		while (true) {
			run();
			System.out.println();
		}
	}

	public void run() {
		System.out.println("(1)입력 (2)출력 (3)검색 (4)수정 (5)삭제 (6)종료");
		System.out.print("선택>> ");
		int no = scan.nextInt();
		switch (no) {
		case 1:
			System.out.println("사람 정보 입력");
			System.out.print("아이디 입력>> ");
			String id = scan.next();
			System.out.print("이름 입력>> ");
			String name = scan.next();
			System.out.print("나이 입력>> ");
			int age = scan.nextInt();
			SaramDto dto = new SaramDto(id, name, age);
			SaramDao.insert(dto);
			break;
		case 2:
			System.out.println("사람 목록 출력");
			ArrayList<SaramDto> list = SaramDao.selectAll();
			for (SaramDto saram : list) {
				System.out.println(saram);
			}
			break;
		case 3:
			System.out.println("검색");
			break;
		case 4:
			System.out.println("수정");
			break;
		case 5:
			System.out.println("삭제");
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("선택 사항 없습니다!");
		}
	}

	public static void main(String[] args) {
		SaramController ctrl = new SaramController();
		ctrl.service();
	}
}
