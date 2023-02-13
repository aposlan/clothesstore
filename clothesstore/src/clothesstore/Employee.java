package clothesstore;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Employee {
 
    private static double ePrice;
    private String name, family, egn, email, password, username;
    protected static ArrayList<Employee> emps = new ArrayList<>();
 
    static {
        ObjectOutputStream writer = null;

		try {
			writer = new ObjectOutputStream(new FileOutputStream("C:\\Users\\FoxMulder\\eclipse-workspace\\clothesstore\\src\\employees.ser"));
			writer.writeObject(new Employee("Ivan", "Ivanov", "9800000000", "ivan_ivanov@abv.bg", "1234i", "ii"));
			writer.writeObject(new Employee("Asen", "Asenov", "8900000000", "asen_asenov@abv.bg", "1234a", "aa"));
			writer.writeObject(new Employee("Georgi", "Georgiev", "7800000000", "georgi_georgiev@abv.bg", "1234g", "gg"));
			System.out.println("Successfully written objects! :)");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
 
    public Employee() {
 
    }
 
    public Employee(String name, String family, String egn, String email, String password, String username) {
        this.name = name;
        this.family = family;
        this.egn = egn;
        this.email = email;
        this.password = password;
        this.username = username;
    }
 
    public double getePrice() {
        return ePrice;
    }
 
    public void setePrice(double ePrice) {
        Employee.ePrice = ePrice;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getFamily() {
        return family;
    }
 
    public void setFamily(String family) {
        this.family = family;
    }
 
    public String getEgn() {
        return egn;
    }
 
    public void setEgn(String egn) {
        this.egn = egn;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public static void employeeFirstPage() {
        System.out.println("����� ����� �� ���������� (�������� '1'), �� ����������� ������ �� ������� � ��������(�������� '2'), ��� �� �������� ���� �����(�������� '3')");
        String input = App.scan.nextLine();
        if (input.contentEquals("1")) {
            App.menu();
        } else if (input.contentEquals("2")) {
            employeeSetPrice();
        } else if (input.contentEquals("3")) {
            addClothe();
        } else {
            System.out.println("��������� ��������");
        }
    }
 
    public static void getEmployee(String enteredEmailOrUsername, String enteredPassword) {
        boolean bEmployee = true;
        for (Employee emp : emps) {
            if ((emp.email.equalsIgnoreCase(enteredEmailOrUsername) && emp.password.equals(enteredPassword))
                    || (emp.username.equals(enteredEmailOrUsername) && emp.password.equals(enteredPassword))) {
                System.out.println("����� �����, " + emp.name + "!");
                bEmployee = false;
                employeeFirstPage();
            }
 
        }
        if (bEmployee) {
            System.out.println("���� ����� ���������� ��� ��� ������ ������ �����.");
            App.main(null);
        }
    }
 
    public static void employeeSetPrice() {
 
        int currentProduct = 0;
        int serialNum = 0;
        for (Clothes cl : Clothes.clothesStorage) {
            cl.getAllClothesEmpV(currentProduct);
            currentProduct++;
        }
        currentProduct = 0;
        boolean b = true;
        while (b) {
            System.out.println("�������� '1' ��� ������ �� ����������� � '2' ��� ������ �� �� �������");
            String input = App.scan.nextLine();
            switch (input) {
            
                case "1":
                	
                    System.out.println("�������� ���� ������� �� �������� �� �����.");
                    serialNum = App.scan.nextInt();
                    if (serialNum > -1 && serialNum < Clothes.clothesStorage.toArray().length) {
                        System.out.println("�������� ������� ������� : ");
                        System.out.println(Clothes.clothesStorage.get(serialNum).toString());
                        System.out.print("�������� ������ ���� �� �������� : ");
                        double ePrice = App.scan.nextDouble();
                        System.out.println("");
                        if (ePrice == Clothes.clothesStorage.get(serialNum).getClothePrice()) {
                            System.out.println("������ ������ ������.");
                        } else if (ePrice != Clothes.clothesStorage.get(serialNum).getClothePrice() && ePrice >= 0) {
                            Clothes.clothesStorage.get(serialNum).setClothePrice(ePrice);
                            System.out.println("���������� ������ �������.");
                        } else {
                            System.out.println("��������� ����.");
                        }
                    } else if (serialNum < -1 || serialNum > Clothes.clothesStorage.toArray().length) {
                        System.out.println("���� ����� ������ �����");
 
                    }
                    break;
                    
                case "2":
                	
                    employeeFirstPage();
                    break;
 
            }
        }
 
 
    }

    public static void addClothe() {
        System.out.println("��� : ");
        String type = App.scan.nextLine();
        System.out.println("������ : ");
        String size = App.scan.nextLine();
        System.out.println("����� : ");
        String brand = App.scan.nextLine();
        System.out.println("���� : ");
        String color = App.scan.nextLine();
        System.out.println("���� : ");
        double price = Double.parseDouble(App.scan.nextLine());
        System.out.println("����� : ");
        String season = App.scan.nextLine();
        System.out.println("��� : ");
        String gender = App.scan.nextLine();
        Clothes c1 = new Clothes(type, size, brand, color, price, season, gender);
        Clothes.clothesStorage.add(c1);
        System.out.println("������� �������� �����!");
        c1.getAllInfo();
        employeeFirstPage();
 
    }
 
}