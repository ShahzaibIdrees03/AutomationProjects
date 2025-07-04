package pages;

public class HomePage {
	public final String url = "https://sandbox4.cubix.co/staging/vakeel/public/home";
	public final String title = "Vaqil.pk";
	public final String laywerText = "Browse and Find Any Lawyer from a Multitude of Profiles";
	public final String lawyerTextlocator = "//div[@Class='looking_for_lawyer_head']//child::p";
	public final String logoLocator = "//img[@src='https://sandbox4.cubix.co/staging/vakeel/public/site_assets/img/sindhbar2x.png']";
	public final String SearchButtonLocator = "//button[text()='Search']";
	public final String CityFieldLocator   =  "//input[@id='cities_filter']";
	public final String AreaOfLawsFieldLocator = "//input[@id='select_area_of_law']";
	public final String FindLawyerByNameLocator =  "//input[@id='select_lawyer_by_name']";
	public final String FindLawyersTextLocator =  "(//a[@href='#'])[7]";
	public final String HomeButtonLocator = "//a[contains(text(),'Home')]";
	public final String CityFieldValue = "abcd";
	public final String AreaOfLawsFieldValue = "abcde1";
	public final String FindLawyerByNameValue = "abc";
	public final String FindLawyersTextValue = "Find Lawyers";
	public final String FindLawyersPageURL = "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?";
	public final String SpecificLawyerLocator = "//div[@Class='looking_for_lawyer_head']//child::h1";
	public final String SpecificLawyerValue =   "Hire a case-specific lawyer";
	public final String LibelAndDefamationLocator = "(//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=libel_and_defamation'])[3]";
	public final String LibelAndDefamationValue = "Libel & Defamation";
	public final String lawyersValue = "/lawyers";
	public final String LibelAndDefamationUrl = "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=libel_and_defamation";
	public final String FilteredByLADLocator = "//div[@Class='d-flex align-items-center justify-content-around']//parent::li";
	public final String CriminalLocator = "(//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=criminal'])[3]";
	public final String CriminalValue = "Criminal";
	public final String CriminalUrl= "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=criminal";
	public final String FilteredByCriminalLocator = "//div[@Class='d-flex align-items-center justify-content-around']//parent::li";
	public final String BusinessandCorporateLocator = "//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=business_and_corporate' and @class='pl-0']";
	public final String BusinessandCorporateValue = "Business & Corporate";
	public final String	BusinessandCorporateUrl =	"https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=business_and_corporate";
	public final String	FilteredByBusinessandCorporateLocator =	"((//div[@class='filter_by']//following::li)[1]//following::span)[1]";
	public final String TaxLocator = "(//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=tax'])[3]";
	public final String TaxValue = "Tax";
	public final String	TaxUrl = "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=tax";
	public final String	FilteredByTaxLocator =	"//div[@Class='d-flex align-items-center justify-content-around']//parent::li";
	public final String DisputeLawLocator = "(//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=dispute_law'])[3]";
	public final String DisputeLawValue = "Dispute Law";
	public final String	DisputeLawUrl =	"https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=dispute_law";
	public final String	FilteredByDisputeLawLocator = "//div[@Class='d-flex align-items-center justify-content-around']//parent::li";
	public final String CreateaLawyerProfileSectionLocator = "//section[@class='find_lawyer_bg d-flex align-items-center']";
	public final String CreateaLawyerProfileTextLocator = "//h1[@class='create_lawyer_head']";
	public final String	CreateaLawyerProfileValue = "Create a Lawyer Profile";	
	public final String	GetListedLocator =	"//a[@class='btn bg_teak get_listed_btn']";
	public final String TestimonialSectionLocator = "//h1[@class='testimonial_heading']";
	public final String SearchforaLawyerTextLocator = "//p[@class='mx-auto']//preceding-sibling::h1";
	public final String SearchforaLawyerValue = "Search for a Lawyer";
	public final String LawyerDropDownLocator= "//a[@id='navbarDropdown']";
	public final String FindLawyersbyspecialityTextLocator = "(//ul[@class='dropdown-menu megamenu py-0 mt-0 rounded-0 border-0 d-block']//following::h5)[1]";
	public final String FindLawyersbyspecialityValue = "Find Lawyers by speciality";
	public final String FindLawyersbyCitiesTextLocator = "(//ul[@class='dropdown-menu megamenu py-0 mt-0 rounded-0 border-0 d-block']//following::h5)[2]";
	public final String FindLawyersbyCitiesValue = "Find Lawyers by Cities";
	public final String SpecialityBrowseAllLocator = "(//a[@class='browse_all'])[1]";
	public final String BrowseAllValue = "Browse All";
	public final String SpecialityAllPageUrl = "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?speciality=all";
	public final String FilteredByAllSpecialitesLocator = "//div[@class='d-flex align-items-center justify-content-around']//parent::li";
	public final String AllSpecialitesValue = "All Specialites";
	public final String CitiesBrowseAllLocator = "//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/lawyers?cities=all']";
	public final String CitiesAllPageUrl = "https://sandbox4.cubix.co/staging/vakeel/public/lawyers?cities=all";
	public final String FilteredByAllCitiesLocator = "//div[@class='d-flex align-items-center justify-content-around']//parent::li";
	public final String AllCitiesValue = "All Cities";
	public final String WhiteLogoLocator = "(//img[@Class='whitelogo'])[1]";
	public final String DarkLogoLocator = "//img[@class='darklogo d-block']";
	public final String LeopordsLogoLocator = "//img[@Class='card-img-top']";
	public final String UrlContainViewLawyer = "view_lawyer";
	public final String LawyerUZAPageUrl = "https://sandbox4.cubix.co/staging/vakeel/public/view_lawyer/UFVGVVRnPT0";
	public final String LawyerUZALocator = "//a[@class='text-white fw-bold d-flex bread_crumb_errow']//parent::li";
	public final String LawyerUZAValue = "Lawyer UZ A";
	public final String LeopordsSecondLogoLocator = "//img[@class='profile_img_view']";
	public final String SindhBarLogoLocator = "//img[@src='https://sandbox4.cubix.co/staging/vakeel/public/site_assets/img/sindhbar2x.png']";
	public final String LawyerDropDownSecondLocator =  "//div[@class='d-xl-block d-lg-block d-md-block d-sm-block d-none']/ul";
	public final String LawyerProfileSectionLocator = "//div[@class='text-center border-0']";
	public final String CreateaLawyerProfileLocator = "//h1[@class='create_lawyer_head']";
	public final String GetYourExpertiseLocator = "//p[@class='text-white f_family_OpenSans mt_13_px']";
	public final String GetYourExpertiseValue = "Get your expertise in front of millions of people";
	public final String BeforeClickStyleLocator = "//div[@id='sign_in_modal_home_inner']";
	public final String BoostYourCaseTextLocator = "//p[@class='mx-auto']";
	public final String BoostYourCaseTextValue = "Boost your case success chances by hiring a lawyer closely aligned with your specific needs. Contact your selected profiles, consult with them, and hire your best pick.";
	public final String PopUpCloseButtonLocator = "//div[@id='sign_in_modal_home_inner']//child::button[@aria-label='Close']";
	public final String InvitePopUpCloseButtonLocator = "//img[@alt='close sharing button']";
	public final String InviteButtonLocator = "//div[@Class='st-btn st-last']";
	public final String InvitePopUpSectionLocator = "//div[@class='st-btns container p-0 share_this_p']";
	public final String InviteButtonTextLocator = "//h6[@class='header']";
	public final String InviteButtonValue = "Invite";
	public final String InvitePopUpWhatsappImageLocator = "//img[@src='https://sandbox4.cubix.co/staging/vakeel/public/site_assets/img/whatsapp2x.png']";
	//public final String SignInButtonLocator = "(//button[text()='SIGN IN'])[1]";
	public final String SignInButtonLocator = "//*[@id='navbarSupportedContent']/form/button";
	public final String ErrorLoginTextLocator = "//div[@id='error_login']";
	public final String ErrorLoginTextValue = "";
	public final String NoUserWithErrorValue = "No User with this email found";
	public final String EmailErrorTextLocator = "//div[@id='email_error']";
	public final String PopUpLoginButtonLocator = "//button[@id='login_form_btn']";
	public final String ErrorValidEmailValue = "The email must be a valid email address.";
	public final String EmailorPasswordErrorValue = "The email or the password is invalid. Please try again.";
	public final String ErrorEmailFieldRequiredValue = "The email field is required.";
	public final String PasswordErrorTextLocator = "//div[@id='password_error']";
	public final String PasswordFielDRequiredValue = "The password field is required.";
	public final String AnasAhmedKhanLocator = "//span[.='Anas Ahmed Khan']//parent::button";
	public final String LogoutButtonLocator = "//a[text()='Logout']";
	public final String SignInFormLocator = "//form[@class='form-inline my-2 my-lg-0']";
	public final String StyleValue = "style";
    public final String DisplayBlockValue = "display: block";
    public final String BlockValue = "block";			
    public final String DisplayValue = "display";
    public final String EmailFieldLocator = "//input[@id='email' and @name='email']";		
    public final String WrongEmailValue = "anas.khan@cubxlabs.com";
    public final String PasswordFieldLocator = "//input[@id='password']";
    public final String CorrectPasswordValue = "uef18h";
    public final String CorrectEmailValue = "anas.khan@cubixlabs.com";
    public final String WrongPasswordValue = "uej1dfwdf8h";
    public final String PrintButtonTextLocator = "//span[@Class='name']//parent::button";
    public final String UserAnasValue = "Anas Ahmed Khan";
    public final String UserAnasLocator = "//span[.='Anas Ahmed Khan']";
    public final String SecondWrongEmailValue = "nkknkn";
    public final String NoneAttribute = "none" ;
    public final String SettingPageLocator = "//a[@href='https://sandbox4.cubix.co/staging/vakeel/public/setting']";
}
