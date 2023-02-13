package clothesstore;

import java.util.*;

public class Clothes {
	
	private String clotheType, clotheSize, clotheBrand, clotheColor, clotheSeason, clotheGender;
	public double clothePrice;
	public static ArrayList<Clothes> clothesStorage = new ArrayList<>();
	
	static {
		clothesStorage.add(new Clothes("������", "XS", "Flair", "������-���", 50, "������, ����", "�����"));
		clothesStorage.add(new Clothes("������", "S", "ZARA", "������", 40, "������", "�����"));
		clothesStorage.add(new Clothes("������", "M", "Flair", "���", 30, "������, ����", "�����"));
		clothesStorage.add(new Clothes("������", "L", "HM", "���", 35, "������, ����, ����", "�����"));
		clothesStorage.add(new Clothes("������", "L", "Nike", "�����", 25, "������, ����", "������"));
		clothesStorage.add(new Clothes("������", "XL", "Flair", "���", 50, "������, ����", "������"));
		clothesStorage.add(new Clothes("������", "L", "Nike", "�����", 35, "������, ����, ����", "������"));
		clothesStorage.add(new Clothes("������", "XL", "Flair", "�����", 35, "������, ����, ����", "������"));

		clothesStorage.add(new Clothes("�������", "L", "Puma", "���", 25, "����", "�����"));
		clothesStorage.add(new Clothes("�������", "XL", "HM", "���", 50, "����", "�����"));
		clothesStorage.add(new Clothes("�������", "S", "Lacoste", "����", 30, "����", "�����"));
		clothesStorage.add(new Clothes("�������", "XS", "Gucci", "���", 50, "����", "�����"));
		clothesStorage.add(new Clothes("�������", "M", "Tom Tailor", "����", 20, "����", "������"));
		clothesStorage.add(new Clothes("�������", "L", "Gucci", "�����", 17, "����", "������"));
		clothesStorage.add(new Clothes("�������", "M", "LCW", "����", 20, "����", "������"));
		clothesStorage.add(new Clothes("�������", "XS", "Nike", "�����", 25, "����", "������"));

		clothesStorage.add(new Clothes("������", "L", "LCW", "���", 35, "����", "�����"));
		clothesStorage.add(new Clothes("������", "L", "Lacoste", "�����", 65, "������, ����, ����", "�����"));
		clothesStorage.add(new Clothes("������", "M", "Adidas", "�����", 35, "����", "�����"));
		clothesStorage.add(new Clothes("������", "XL", "Puma", "������", 45, "����", "�����"));
		clothesStorage.add(new Clothes("������", "S", "Nike", "�����", 50, "������, ����", "������"));
		clothesStorage.add(new Clothes("������", "M", "Adidas", "�����", 25, "������, ����", "������"));
		clothesStorage.add(new Clothes("������", "XL", "Nike", "������-���", 50, "����", "������"));
		clothesStorage.add(new Clothes("������", "L", "Puma", "���", 43, "����, ����", "������"));

		clothesStorage.add(new Clothes("�����", "S", "HM", "������-���", 44, "������, ����", "�����"));
		clothesStorage.add(new Clothes("�����", "XL", "LCW", "�����", 30, "������, ����", "�����"));
		clothesStorage.add(new Clothes("�����", "L", "ZARA", "�����", 45, "������", "�����"));
		clothesStorage.add(new Clothes("�����", "L", "LCW", "���", 30, "������, ����", "�����"));
		clothesStorage.add(new Clothes("�����", "M", "HM", "�����-���", 35, "������", "������"));
		clothesStorage.add(new Clothes("�����", "XS", "Adidas", "���", 50, "������", "������"));
		clothesStorage.add(new Clothes("�����", "S", "Tom Tailor", "�����-���", 35, "������", "������"));
		clothesStorage.add(new Clothes("�����", "XS", "Adidas", "���", 50, "������", "������"));
	}

	public Clothes() {

	}

	public Clothes(String clotheType, String clotheSize, String clotheBrand, String clotheColor, double clothePrice,
			String clotheSeason, String clotheGender) {
		this.clotheType = clotheType;
		this.clotheSize = clotheSize;
		this.clotheBrand = clotheBrand;
		this.clotheColor = clotheColor;
		this.clothePrice = clothePrice;
		this.clotheSeason = clotheSeason;
		this.clotheGender = clotheGender;
	}

	public String getClotheColor() {
		return clotheColor;
	}

	public void setClotheColor(String clotheColor) {
		this.clotheColor = clotheColor;
	}

	public String getClotheType() {
		return clotheType;
	}

	public void setClotheType(String clotheType) {
		this.clotheType = clotheType;
	}

	public String getClotheGender() {
		return clotheGender;
	}

	public void setClotheGender(String clotheGender) {
		this.clotheGender = clotheGender;
	}

	public static ArrayList<Clothes> getClothesStorage() {
		return clothesStorage;
	}

	public static void setClothesStorage(ArrayList<Clothes> clothesStorage) {
		Clothes.clothesStorage = clothesStorage;
	}

	public void setClothePrice(double clothePrice) {
		this.clothePrice = clothePrice;
	}

	public String getClotheSize() {
		return clotheSize;
	}

	public String getClotheBrand() {
		return clotheBrand;
	}

	public double getClothePrice() {
		return clothePrice;
	}

	public String getClotheSeason() {
		return clotheSeason;
	}

	public void setClotheSize(String clotheSize) {
		this.clotheSize = clotheSize;
	}

	public void setClotheBrand(String clotheBrand) {
		this.clotheBrand = clotheBrand;
	}

	public void setClotheSeason(String clotheSeason) {
		this.clotheSeason = clotheSeason;
	}

	public void getAllInfo() {
		System.out.println("��� : " + this.clotheType + " | ������ : " + this.clotheSize + " | ����� : " + this.clotheBrand + " | ���� : " + this.clotheColor + " | ���� : " + this.clothePrice + " | ����� : " + this.clotheSeason);
	}

	public static void getClothesType(String desiredType, String desiredGender) {
		boolean bStyle = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clotheType.equalsIgnoreCase(desiredType) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
				bStyle = false;
			}

		}
		if (bStyle) {
			System.out.println("���� ����� ��� �����");
		}
	}

	public static void getClothesSize(String desiredSize, String desiredGender) {
		boolean bSize = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clotheSize.equalsIgnoreCase(desiredSize) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
				bSize = false;
			}

		}
		if (bSize) {
			System.out.println("���� ����� ������ �����");
		}
	}

	public static void getClothesBrand(String desiredBrand, String desiredGender) {
		boolean bBrand = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clotheBrand.equalsIgnoreCase(desiredBrand) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
				bBrand = false;
			}

		}
		if (bBrand) {
			System.out.println("���� ����� ����� �����");
		}
	}

	public static void getClothesColor(String desiredColor, String desiredGender) {
		boolean bColor = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clotheColor.contains(desiredColor) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
				bColor = false;
			}

		}
		if (bColor) {
			System.out.println("���� ����� ���� �����");
		}
	}

	public static void getClothesPrice(double desiredPrice, String desiredGender) {
		boolean bPrice = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clothePrice <= desiredPrice && cl.clotheGender.equalsIgnoreCase(desiredGender) && cl.clothePrice >= 0) {
				cl.getAllInfo();
				bPrice = false;
			}
		}
		if (bPrice) {
			System.out.println("���� ����� �� ���� ����");
		}
	}

	public static void getClothesSeason(String desiredSeason, String desiredGender) {
		boolean bSeason = true;
		for (Clothes cl : clothesStorage) {
			if (cl.clotheSeason.contains(desiredSeason) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
				bSeason = false;
			}

		}
		if (bSeason) {
			System.out.println("���� ����� �� ����� �����");
		}
	}

	public static void getAllClothes(String desiredGender) {
		for (Clothes cl : clothesStorage) {
			if (cl.clotheGender.equalsIgnoreCase(desiredGender)) {
				cl.getAllInfo();
			}
		}
	}
	
	public void getAllClothesEmpV(int currentProduct) {
		System.out.println("��� : " + this.clotheType + " | ������ : " + this.clotheSize + " | ����� : " + this.clotheBrand + " | ���� : " + this.clotheColor + " | ���� : " + this.clothePrice + " | ����� : " + this.clotheSeason + " | ��� : " + this.clotheGender + " | ������ ����� : " + currentProduct);
	}
	
	public String toString() {
		return "��� : " + this.clotheType + " | ������ : " + this.clotheSize + " | ����� : " + this.clotheBrand + " | ���� : " + this.clotheColor + " | ���� : " + this.clothePrice + " | ����� : " + this.clotheSeason + " | ��� : " + this.clotheGender;
	}

}
