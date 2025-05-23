package Phone.com;

import java.util.Scanner;

public class SmartPhoneMain {
	public static void main(String[] args) {

		// SmartPhone Instance 생성
		SmartPhone smartPhone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);

		Addr addr;
		// 처음에 연락처 등록 데이터 2개를 입력
		System.out.println("# 데이터 2개를 입력합니다.");

		addr = smartPhone.inputCompanyAddrData();
		smartPhone.addAddr(addr);
		addr = smartPhone.inputCustomerAddrData();
		smartPhone.addAddr(addr);

		String input = "";
		while (true) {
			printMenu();
			input = scanner.nextLine();

			switch (input) {
			case "1"://회사
				addr = smartPhone.inputCompanyAddrData();
				smartPhone.addAddr(addr);
				break;
			case "2"://거래처
				addr = smartPhone.inputCustomerAddrData();
				smartPhone.addAddr(addr);
				break;
			case "3":
				smartPhone.printAllAddr();
				break;
			case "4":
				input = scanner.nextLine();
				smartPhone.searchAddr(input);
				break;
			case "5":
				input = scanner.nextLine();
				smartPhone.deleteAddr(input);
				break;
			case "6":
				input = scanner.nextLine();
				addr = smartPhone.inputAddrData();
				smartPhone.editAddr(input, addr);
				break;
			case "7":
				scanner.close();
				System.exit(0);
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("주소관리 메뉴----------------");
		System.out.println("1. 연락처 등록(회사)");
		System.out.println("2. 연락처 등록(거래처)");
		System.out.println("3. 모든 연락처 출력");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 연락처 삭제");
		System.out.println("6. 연락처 수정");
		System.out.println("7. 프로그램 종료");
		System.out.println("--------------------------");
	}
}
