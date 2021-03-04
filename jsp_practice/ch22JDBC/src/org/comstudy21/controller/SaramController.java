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
		System.out.println("(1)�Է� (2)��� (3)�˻� (4)���� (5)���� (6)����");
		System.out.print("����>> ");
		int no = scan.nextInt();
		switch (no) {
		case 1:
			System.out.println("��� ���� �Է�");
			System.out.print("���̵� �Է�>> ");
			String id = scan.next();
			System.out.print("�̸� �Է�>> ");
			String name = scan.next();
			System.out.print("���� �Է�>> ");
			int age = scan.nextInt();
			SaramDto dto = new SaramDto(id, name, age);
			SaramDao.insert(dto);
			break;
		case 2:
			System.out.println("��� ��� ���");
			ArrayList<SaramDto> list = SaramDao.selectAll();
			for (SaramDto saram : list) {
				System.out.println(saram);
			}
			break;
		case 3:
			System.out.println("�˻�");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("���� ���� �����ϴ�!");
		}
	}

	public static void main(String[] args) {
		SaramController ctrl = new SaramController();
		ctrl.service();
	}
}
