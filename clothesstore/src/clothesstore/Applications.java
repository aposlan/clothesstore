package clothesstore;

public class Applications extends Employee {
	
	private int age, experience;
	private String education;

	public Applications() {

	}

	public Applications(String name, String family, String egn, String email, String password, String username, int age, int experience, String education) {
		super(name, family, egn, email, password, username);
		this.age = age;
		this.experience = experience;
		this.education = education;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public static void applicate(int enteredAge, int enteredExperience, String enteredEducation, String enteredEGN, String enteredName, String enteredFamily) {

		if ((enteredAge > 18 && enteredAge <= 65 && enteredExperience > 0 && enteredExperience <= enteredAge - 18
				&& enteredEducation.equalsIgnoreCase("������") && enteredEGN.length() == 10)
				|| (enteredAge > 18 && enteredAge <= 65 && enteredExperience > 0 && enteredExperience <= enteredAge - 18
						&& enteredEducation.equalsIgnoreCase("�����") && enteredEGN.length() == 10)
				|| (enteredAge > 18 && enteredAge <= 65 && enteredExperience > 0 && enteredExperience <= enteredAge - 18
						&& enteredEducation.equalsIgnoreCase("���������") && enteredEGN.length() == 10)
				|| (enteredAge > 18 && enteredAge <= 65 && enteredExperience > 0 && enteredExperience <= enteredAge - 18
						&& enteredEducation.equalsIgnoreCase("��������") && enteredEGN.length() == 10)) {
			System.out.println("����� ���!");
			System.out.println("�� �� ����� ������ � ������ �������, ��������� �������� ������ : ");

			System.out.println("�������� ������ e-mail �����");
			String enteredEmail = App.scan.nextLine();
			System.out.println("�������� ������������� ���");
			String enteredUsername = App.scan.nextLine();
			System.out.println("�������� ������ ������");
			String enteredPassword = App.scan.nextLine();
			
			Employee e1 = new Employee(enteredName, enteredFamily, enteredEGN, enteredEmail, enteredPassword, enteredUsername);
			emps.add(e1);
			System.out.println("������ ������:" + "\n Username : " + e1.getUsername() + "\n E-mail : " + e1.getEmail() + "\n Password : " + e1.getPassword());
			App.main(null);
		} else if (enteredExperience > enteredAge - 18) {
			System.out.println("����� �� ����������� �� ������ ������!");
		} else if(enteredEGN.length() != 10){
			System.out.println("��������� ���!");
		} else {
			System.out.println("�� ��� �����!");
		}

	}

}
