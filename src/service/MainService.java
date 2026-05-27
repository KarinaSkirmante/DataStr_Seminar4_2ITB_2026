package service;

import datastr.MyBST;
import model.Patient;


public class MainService {

	public static void main(String[] args) {
		System.out.println("-----------INT------------");
		MyBST<Integer> bstForIntegers = new MyBST<Integer>();

		try {
			System.out.println("-----------PIEVIENOŠANA------------");
			bstForIntegers.add(10);//P: 10
			bstForIntegers.add(6);//P: 10 (LC:6)
			bstForIntegers.add(23);//P: 10 (LC:6, RC:23)
			bstForIntegers.add(8);//P: 10 (LC:6, RC:23); P:6 (RC:8)
			bstForIntegers.add(7);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7)
			bstForIntegers.print();
			System.out.println("-----------MEKLĒŠANA------------");
			System.out.println("Vai ir 7: "+ bstForIntegers.search(7));//true
			System.out.println("Vai ir 23: "+ bstForIntegers.search(23));//true
			System.out.println("Vai ir 17: "+ bstForIntegers.search(17));//false
			//ievietoti papildus elementi
			System.out.println("-----------ELEMENTU PIEVIENOŠANA PIRMS DZĒŠANAS------------");
			bstForIntegers.add(20);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7); P:23 (LC: 20)
			bstForIntegers.add(22);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7); P:23 (LC: 20); P:20 (RC:22)
			bstForIntegers.add(19);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7); P:23 (LC: 20); P:20 (LC:19, RC:22)
			bstForIntegers.add(12);//P: 10 (LC:6, RC:23); P:6 (RC:8); P: (LC:7); P:23 (LC: 20); P:20 (LC:19, RC:22); P:19 (LC:12)
			bstForIntegers.print();			
			System.out.println("-----------DZĒŠANA------------");
			bstForIntegers.remove(12);//izdzēš elementu, kam nav bērnu jeb lapu
			System.out.println("-----------PĒC 12 (lapas) dzēšanas ------------");
			bstForIntegers.print();
			bstForIntegers.remove(23);//izdzēš elementu, kam ir tikai viens bērns (šajā gadījumā kreisais)
			System.out.println("-----------PĒC 23 (viena bērna vecāka) dzēšanas ------------");
			bstForIntegers.print();
			bstForIntegers.remove(10);//izdzēš elementu, kam ir abi bērni
			System.out.println("-----------PĒC 10 (abu bērnu vecāka) dzēšanas ------------");
			bstForIntegers.print();

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------PATIENTS------------");
		
		MyBST<Patient> bstPatients = new MyBST<Patient>();
		
		
		try
		{
			System.out.println("-----------PIEVIENOŠANA------------");
			Patient p1 = new Patient("Jānis", "Bērziņs", 4);
			Patient p2 = new Patient("Līga", "Jaukā", 2);
			Patient p3 = new Patient("Baiba", "Kalniņa", 3);
			Patient p4 = new Patient("Juris", "Nejaukais", 5);
			Patient p5 = new Patient("Anna", "Gudrā", 1);//neieliekam kokā
			bstPatients.add(p1);
			bstPatients.add(p2); 
			bstPatients.add(p3);
			bstPatients.add(p4);
			bstPatients.print();
			System.out.println("-----------MEKLĒŠANA------------");
			System.out.println("Vai ir Jānis " +bstPatients.search(p1));//true
			System.out.println("Vai ir Anna " +bstPatients.search(p5));//false
			System.out.println("-----------DZĒŠANA------------");
			bstPatients.remove(p1);//dzēšam Jāni, kas ir root
			bstPatients.print();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
