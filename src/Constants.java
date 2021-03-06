/**
 * General Configuration File. File contains all labels used by the system.
 * 
 * Legal Case Management System Florida State University
 * 
 * @author Francisco Santana, Chad Wolfe, Daniel Weston, Dean Burgos
 * @version 1
 * @since 2013-03-01
 */
public interface Constants {

	// Constants for window dimensions
	int X_POS = 80, Y_POS = 80, X_FACTOR = 2, Y_FACTOR = 2;
	int EX_POS = 100, EY_POS = 100, EX_W = 700, EY_H = 400;

	String MENU_ITEM_SEPARATOR = "___________";
	
	// Some Labels
	String MAIN_WIN_TITLE = "Legal Cases Management";
	String DEF_FILE_FOLDER = ".";
	String GEN_LBL_THANKYOU = "Thank You.";
	
	//Module Labels general format MODULE_LABELNAME
	String CONT_MOD_TITLE = "Contact Information";
	String CONT_FIRSTNAME = "Firstname";
	String CONT_LASTNAME = "Lastname";
	
	String GEN_ERR_CANNOT_OPEN_FILE = "Invalid File";
	
	//Csv Constants
	String APP_DATA_FOLDER = System.getProperty("user.dir")+"/data";
	String APP_CONTACT_FILE = Constants.APP_DATA_FOLDER+"/contacts.csv";
	
	String CSV_FIELD_SEPARATOR = "\t";
	String CSV_ROW_SEPARATOR = "\r\n";
	
	String[] CONT_CUSTOMER_TYPES = { "Customer", "Attorney", "Administrator","Paralegal", "Other" };
	String[] CONT_STATUS = { "Inactive", "Active" };
	
	//About Us
	String GEN_LBL_ABOUT_US = "About Us";
	String ABOUT_US = MAIN_WIN_TITLE+" \n " +
			"CDDF Enterprises\n" +
			"Florida State University\n\n" +
			"Authors: \n" +
			"Chad Wolf\n" +
			"Daniel Weston\n" +
			"Dean Burgos\n" +
			"Francisco Santana\n\n" +
			"Version 1.0\n" +
			"Year 2013";
 
	//The Help Contents
	String HELP = "Welcome to Help\n\n"
			+"This support material looks pretty much like an Apple Iphone Manual...\n\n"
			+"There is not much to say \n"
			+"just follow the menus and enjoy.\n\n ";
	
}// end interface
