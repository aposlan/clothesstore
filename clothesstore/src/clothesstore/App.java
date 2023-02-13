package clothesstore;

import java.util.Scanner;

public class App {

	public static Scanner scan = new Scanner(System.in);

	static {
		System.out.println("���������!");
	}

	public static void main(String[] args) {

		System.out.print("K��� ����� ���������� ������ �� �� ������� � ���������?");
		System.out.println("\n 1. ������\n 2. ��������\n 3. ����� �� �� ������������");

		String input = scan.nextLine(); // 3 - "3"

		if (input.equals("1")) {

			menu();

		} else if (input.equals("2")) {

			System.out.println("�������� ������ ������������� ��� ��� e-mail �����");
			String emailOrUsername = scan.nextLine();
			System.out.println("�������� ������ ������");
			String password = scan.nextLine();

			Employee.getEmployee(emailOrUsername, password);

		} else if (input.equals("3")) {

			System.out.println(
					"���������� : \n ��������� 19 ������; \n ���� ������ ���� � ���� �����; \n ����������� ���, ��� �� ���� '������';\n");

			System.out.println("�������� ������ ���");
			String name = scan.nextLine();
			System.out.println("�������� ������ �������");
			String family = scan.nextLine();
			System.out.println("�������� ������ ������");
			int age = Integer.parseInt(scan.nextLine());
			System.out.println("�������� ������ ���");
			String egn = scan.nextLine();
			System.out.println("�������� ������ ����");
			int experience = Integer.parseInt(scan.nextLine());
			System.out.println("�������� ������ �����������");
			String education = scan.nextLine();

			Applications.applicate(age, experience, education, egn, name, family);

		} else if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("����")) {
			System.out.println("--������������ ���������--" + "\n18201 ����� �������" + "\n18227 �������� �������"
					+ "\n18209 ��������� ��������" + "\n18212 ������� ���������" + "\n18213 ������� ��������"
					+ "\n18218 ������ ���������");
			System.exit(0);
		} else {
			System.out.println("��������� ����� ����������� �����.");
			main(null);
		}

	}

	public static void menu() {

		System.out.println("��������:\n 1. ����� \n 2. ������");
		String input = scan.nextLine();
		String desiredGender;

		switch (input) {

		case "1":
			desiredGender = "�����";
			while (!input.equalsIgnoreCase("����")) {
				System.out.println(" 1. ������� �� ��� " + "\n 2. ������� �� ������ " + "\n 3. ������� �� �����"
						+ "\n 4. ������� �� ����" + "\n 5. ������� �� ����" + "\n 6. ������� �� �����"
						+ "\n 7. ������");
				input = scan.nextLine();
				switch (input) {
				case "1":
					System.out.println("����� ��� ����� �������?");
					String desiredType = scan.nextLine();
					Clothes.getClothesType(desiredType, desiredGender);
					break;

				case "2":
					System.out.println("����� ������ �������?");
					String desiredSize = scan.nextLine();
					Clothes.getClothesSize(desiredSize, desiredGender);
					break;

				case "3":
					System.out.println("����� ����� �������?");
					String desiredBrand = scan.nextLine();
					Clothes.getClothesBrand(desiredBrand, desiredGender);
					break;

				case "4":
					System.out.println("����� ���� �������?");
					String desiredColor = scan.nextLine();
					Clothes.getClothesColor(desiredColor, desiredGender);
					break;

				case "5":
					System.out.println("�� ����� ���� �������?");
					double desiredPrice = Double.parseDouble(scan.nextLine());
					Clothes.getClothesPrice(desiredPrice, desiredGender);
					break;

				case "6":
					System.out.println("�� ��� ����� �������?");
					String desiredSeason = scan.nextLine();
					Clothes.getClothesSeason(desiredSeason, desiredGender);
					break;

				case "7":
					Clothes.getAllClothes(desiredGender);
					break;

				case "����":
					System.out.println("--������������ ���������--" + "\n18201 ����� �������"
							+ "\n18227 �������� �������" + "\n18209 ��������� ��������" + "\n18212 ������� ���������"
							+ "\n18213 ������� ��������" + "\n18218 ������ ���������");
					System.exit(0);

				case "stop":
					System.out.println("--������������ ���������--" + "\n18201 ����� �������"
							+ "\n18227 �������� �������" + "\n18209 ��������� ��������" + "\n18212 ������� ���������"
							+ "\n18213 ������� ��������" + "\n18218 ������ ���������");
					System.exit(0);

				default:
					System.out.println("��������� ��������");
					break;
				}
			}
			break;
		case "2":
			desiredGender = "������";
			while (!input.equalsIgnoreCase("����")) {
				System.out.println(" 1. ������� �� ��� " + "\n 2. ������� �� ������ " + "\n 3. ������� �� �����"
						+ "\n 4. ������� �� ����" + "\n 5. ������� �� ����" + "\n 6. ������� �� �����"
						+ "\n 7. ������");
				input = scan.nextLine();
				switch (input) {
				case "1":
					System.out.println("����� ��� ����� �������?");
					String desiredType = scan.nextLine();
					Clothes.getClothesType(desiredType, desiredGender);
					break;

				case "2":
					System.out.println("����� ������ �������?");
					String desiredSize = scan.nextLine();
					Clothes.getClothesSize(desiredSize, desiredGender);
					break;

				case "3":
					System.out.println("����� ����� �������?");
					String desiredBrand = scan.nextLine();
					Clothes.getClothesBrand(desiredBrand, desiredGender);
					break;

				case "4":
					System.out.println("����� ���� �������?");
					String desiredColor = scan.nextLine();
					Clothes.getClothesColor(desiredColor, desiredGender);
					break;

				case "5":
					System.out.println("�� ����� ���� �������?");
					double desiredPrice = Double.parseDouble(scan.nextLine());
					Clothes.getClothesPrice(desiredPrice, desiredGender);
					break;

				case "6":
					System.out.println("�� ��� ����� �������?");
					String desiredSeason = scan.nextLine();
					Clothes.getClothesSeason(desiredSeason, desiredGender);
					break;

				case "7":
					Clothes.getAllClothes(desiredGender);
					break;

				case "����":
					System.out.println("--������������ ���������--" + "\n18201 ����� �������"
							+ "\n18227 �������� �������" + "\n18209 ��������� ��������" + "\n18212 ������� ���������"
							+ "\n18213 ������� ��������" + "\n18218 ������ ���������");
					System.exit(0);

				case "stop":
					System.out.println("--������������ ���������--" + "\n18201 ����� �������"
							+ "\n18227 �������� �������" + "\n18209 ��������� ��������" + "\n18212 ������� ���������"
							+ "\n18213 ������� ��������" + "\n18218 ������ ���������");
					System.exit(0);

				default:
					System.out.println("��������� ��������");
				}
			}
			break;

		case "����":
			System.out.println("--������������ ���������--" + "\n18201 ����� �������" + "\n18227 �������� �������"
					+ "\n18209 ��������� ��������" + "\n18212 ������� ���������" + "\n18213 ������� ��������"
					+ "\n18218 ������ ���������");
			System.exit(0);

		case "stop":
			System.out.println("--������������ ���������--" + "\n18201 ����� �������" + "\n18227 �������� �������"
					+ "\n18209 ��������� ��������" + "\n18212 ������� ���������" + "\n18213 ������� ��������"
					+ "\n18218 ������ ���������");
			System.exit(0);

		default:
			System.out.println("��������� ��������");
			main(null);

		}
	}

}
