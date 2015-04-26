package factory;

import factory.company.ABCompany;
import factory.company.MMCompany;
import factory.company.SWCompnay;

public class Go {
	
	public static void main(String[] args) {
		SWCompnay mSwCompnay = new MMCompany();
		mSwCompnay.releaseSoftwareProject("SOAP");
		SWCompnay mSwCompnay2  = new ABCompany();
		mSwCompnay2.releaseSoftwareProject("RESTFUL");
	}
}
