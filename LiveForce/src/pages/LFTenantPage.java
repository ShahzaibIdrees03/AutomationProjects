package pages;

public class LFTenantPage {

	public final String LFurl = "https://uniworthshop.livechatforce.app/admin";
	public final String LFAdminurl = "https://uniworthshop.livechatforce.app/admin";
	public final String LFtitle = "Dashboard";
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
    public final String LFEmailValue = "robert@yopmail.com";
    public final String LFEmailFieldLocator = "//input[@id='email']";
    public final String LFPasswordValue = "shahmir123";
    public final String LFPasswordFIeldLocator = "//input[@id='password']";
    public final String LFLoginButtonLocator = "//button[@id='checkValidLogin']";
    public final String LFDashboardTextLocator = "//h4[@class='md-subtitle no-mbot no-mtop' and text()='Dashboard']";
    public final String LFURL = "https://uniworthshop.livechatforce.app/admin/authentication";
    public final String LFTotalVisitTextLocator = "//span[@class='tw-truncate text-black' and text()='Total Visits']";
    public final String LFTotalVisitTextValue = "TOTAL VISITS";
    public final String LFInvoiceButtonLocator = "//ul[@id='side-menu']//li[@class='menu-item-invoices']";//"//*[@id=\"side-menu\"]/li[3]/a";
    public final String LFInvoiceURL = "https://uniworthshop.livechatforce.app/admin/lead/invoices";
    public final String LFCallHistoryURL = "https://uniworthshop.livechatforce.app/admin/call_history";
    public final String LFCallHistoryButtonLocator = "//a[@href='https://uniworthshop.livechatforce.app/admin/call_history']//span[@class='menu-text']";//"//*[@id=\"side-menu\"]/li[4]/a";
    public final String LFCallHistoryPageText = "//*[@id=\"wrapper\"]/div/div[2]/h4";
    public final String LFStaffsButtonLocator = "//ul[@id='side-menu']//a[contains(@href, '/admin/staff')]/span[@class='menu-text']";
    public final String LFStaffsURL = "https://uniworthshop.livechatforce.app/admin/staff";
    public final String LFStaffsPageTextLocator = "//*[@id=\"wrapper\"]/div/div[2]/div/div[1]/h4";
    public final String LFLeadButton = "//img[contains(@src, 'Leads.svg')]";
    public final String LFActiveLeadsButton = "//ul[contains(@class, 'nav-second-level') and contains(@class, 'collapse') and contains(@class, 'in')]//a[@href='https://uniworthshop.livechatforce.app/admin/leads/status/active']";
    public final String LFActiveLeadsPageURL = "https://uniworthshop.livechatforce.app/admin/leads/status/active";
    public final String LFClosedLeadsButton = "//ul[contains(@class, 'nav-second-level') and contains(@class, 'collapse') and contains(@class, 'in')]//a[@href='https://uniworthshop.livechatforce.app/admin/leads/status/closed']";
    public final String LFClosedLeadsPageURL = "https://uniworthshop.livechatforce.app/admin/leads/status/closed";
    public final String LFDisputedLeadsButton = "//ul[contains(@class, 'nav-second-level') and contains(@class, 'collapse') and contains(@class, 'in')]//a[@href='https://uniworthshop.livechatforce.app/admin/leads/status/disputed']";    
    public final String LFDisputedLeadsPageURL = "https://uniworthshop.livechatforce.app/admin/leads/status/disputed";
    public final String LFSetupticketsButton = "//span[@class='sub-menu-text' and normalize-space(text())='Tickets']";
    //public final String LFSetupTicketsButtonforopenstatus = "//li[contains(@class, 'menu-item-tenants_tab') and contains(@class, 'active')]//a[@href='https://uniworthshop.livechatforce.app/admin/tickets']";
    public final String LFLeadFormButton = "//span[@class='sub-menu-text' and normalize-space(text())='Lead Form']";//"//li[@class='sub-menu-item-lead_form']";//"//a[@href='https://uniworthshop.livechatforce.app/admin/lead_form']";//"//li[contains(@class, 'menu-item-tenants_tab') and contains(@class, 'active')]//a[@href='https://uniworthshop.livechatforce.app/admin/lead_form']";
    public final String LFScriptflowButton =  "//span[@class='sub-menu-text' and normalize-space(text())='Scriptflow']";//"//ul[contains(@class, 'nav-second-level') and contains(@class, 'collapse') and contains(@class, 'in')]//a[@href='https://uniworthshop.livechatforce.app/admin/tenant_script_form']";
    public final String LFWidgetsButton = "//span[@class='sub-menu-text' and normalize-space(text())='Widgets']";//"//a[@href='https://uniworthshop.livechatforce.app/admin/chat-script-widget']";//"//ul[contains(@class, 'nav-second-level') and contains(@class, 'collapse') and contains(@class, 'in')]//a[@href='https://uniworthshop.livechatforce.app/admin/chat-script-widget']";
    public final String LFSetupOptionButton = "//li//following-sibling::img/following-sibling::span/following::span/following::span[@class='fa arrow pleft5'][2]";//"//img[@src='https://uniworthshop.livechatforce.app/assets/images/icons/integration.svg']"; //"//span[@class='menu-text' and normalize-space()='Setup']";   
    public final String LFLeadFormPageURL = "https://uniworthshop.livechatforce.app/admin/lead_form";
    public final String LFScriptflowPageURL = "https://uniworthshop.livechatforce.app/admin/tenant_script_form";
    public final String LFWidgetsPageURL = "https://uniworthshop.livechatforce.app/admin/chat-script-widget";
    public final String LFTicketsPageURL = "https://uniworthshop.livechatforce.app/admin/tickets";
    public final String LFLeadFormTextLocator = "//ul[@class='breadcrumb tw-flex tw-items-center']/li[contains(text(),'Lead Form')]";
    public final String LFScriptflowTextLocator = "//h4[@class='md-subtitle no-mbot no-mtop' and text()='Scriptflow']";
    public final String LFWidgetsTextLocator = "//ul[@class='breadcrumb tw-flex tw-items-center']/li[contains(text(),'Install Chat')]";
    public final String LFTicketsTextLocator = "//h4[@class='md-title' and text()='Tickets']";
    public final String LFLeadFormPanelBodyLocator = "//div/child::a[text()='Request for changes']"; ////a[text()='Request for changes']/ancestor::div[@class='panel-body']
    public final String LFRequestforChangesLocator = "//a[text()='Request for changes']";
    public final String LFTicketsSubjectOption = "//th[@id='th-subject' and @aria-label='Subject' and text()='Subject']";
    public final String LFStatusSubjectOption = "//th[@id='th-status' and @aria-label='Status activate to sort column ascending' and text()='Status']";
    public final String LFLastReplySubjectOption = "//th[@id='th-last-reply' and @aria-label='Last Reply activate to sort column ascending' and text()='Last Reply']";
    public final String LFCreatedSubjectOption = "//th[@id='th-created' and @aria-label='Created activate to sort column ascending' and text()='Created']";
    public final String LFNewTicketButton = "//a[@href='https://uniworthshop.livechatforce.app/admin/tickets/add' and contains(@class, 'btn-primary') and normalize-space()='New Ticket']";//"//a/child::img/following-sibling::span/following-sibling::span/following::ul/following-sibling::a"; 
    public final String LFAddTicketPageURL = "https://uniworthshop.livechatforce.app/admin/tickets/add";
    public final String LFAddTicketTextLocator = "//ul[@class='breadcrumb tw-flex tw-items-center']/li[text()='Add Ticket']";
    public final String LFSubjectFieldLocator = "//input[@id='subject' and @name='subject' and @class='form-control']";
    public final String LFSubjectFieldValue = "Testing is in process 5";
    public final String LFTestingIsInProcess5DeleteLocator = "//tr[td/a[@class='valign' and normalize-space(text())='Testing is in process 5'] and td/span[@class='label ticket-status-1' and normalize-space(text())='Open']]/td/div/a[@class='text-danger _delete' and normalize-space(text())='Delete']";
    public final String LFTicketBodyLocator = "//textarea[@id='message' and @name='message' and @class='form-control']";
    public final String LFTicketBodyValue = "sksfkljkfjkwjfkjwjfkjdkc,nc,cwekljweowipoiwi9i94i9iopk ndnwklfjkwelj49 kjkjdkjdkfjksdfj 94i9i49iriedfkdsfj 439i4klfdkfds jfjrejfrkefjrklef jklskkljckjkdj jfkjfkjfklj ujkjdvj847748494848";
    public final String LFCreateTicketButtonLocator = "//button[@type='submit' and @class='btn btn-primary' and text()='Create Ticket']";
    public final String LFBeforeCreateTicketSectionLocator = "//body[contains(@class, 'app') and contains(@class, 'admin') and contains(@class, 'ticket') and contains(@class, 'tickets') and contains(@class, 'add') and contains(@class, 'user-id-1') and contains(@class, 'chrome') and contains(@class, 'tenant_body')]";
    public final String LFAfterCreateTicketSectionLocator = "//body[contains(@class, 'app') and contains(@class, 'admin') and contains(@class, 'top-tabs') and contains(@class, 'ticket') and contains(@class, 'single-ticket') and contains(@class, 'tickets') and contains(@class, 'user-id-1') and contains(@class, 'chrome') and contains(@class, 'tenant_body')]";
    public final String LFSubjectTextLocator = "//h4[@class='md-subtitle']";
    public final String LFOpenStatusLocator = "//div[@class='filter-option-inner-inner' and text()='Open']";
    public final String LFDropDownInProgressLocator = "//a[@role='option' and span[@class='text' and text()='In Progress']]";
    public final String LFInProgressStatusLocator = "//button[@class='btn dropdown-toggle btn-default' and @title='In Progress']//div[@class='filter-option-inner-inner' and text()='In Progress']";                              
    public final String LFDropDownOnHoldLocator = "//span[@class='text' and text()='On Hold']";
    public final String LFOnHoldStatusLocator = "//button[@class='btn dropdown-toggle btn-default' and @title='On Hold']//div[@class='filter-option-inner-inner' and text()='On Hold']";
    public final String LFDropDownAnsweredLocator = "//span[@class='text' and text()='Answered']";
    public final String LFAnsweredStatusLocator = "//button[@class='btn dropdown-toggle btn-default' and @title='Answered']//div[@class='filter-option-inner-inner' and text()='Answered']";
    public final String LFDropDownClosedLocator = "//span[@class='text' and text()='Closed']";
    public final String LFClosedStatusLocator = "//button[@class='btn dropdown-toggle btn-default' and @title='Closed']//div[@class='filter-option-inner-inner' and text()='Closed']";
    public final String LFResposesSectionLocator = "//div[@class='panel-body tw-pb-0']/h4[@class='md-subtitle']";
    public final String LFWriteResponseFiledLocator = "//textarea[@id='message' and @name='message' and @class='form-control' and @required='1' and @rows='3' and @placeholder='Write Response']";
    public final String LFWriteResponseFiledValue = "Testing is in process";
    public final String LFWriteResponseSendButtonLocator = "//button[@type='submit' and @class='btn btn-primary' and normalize-space(text())='Send']";
    public final String LFBackTicketPageLocator = "//a[@href='https://uniworthshop.livechatforce.app/admin/tickets' and normalize-space(text())='Tickets']";
    public final String LFTestingSubjectNamelocator = "//tbody/child::tr/child::td/child::a";
    public final String LFTPOpenStatusLocator = "//tbody/child::tr/child::td/child::span";
    public final String LFCreatTicketToastAlertLocator = "//span[@class='alert-title']";
    public final String LFDeleteTicketToastLocator = "//div[@id='alert_float_1' and contains(@class, 'alert-success') and span[@class='alert-title' and normalize-space(text())='Ticket deleted']]";
    public final String LFDeleteTicketButtonLocator = "//a[@data-title='Delete ticket']";
    public final String LFTicketDeletedToastlocator = "//div[@id='alert_float_1' and contains(@class, 'alert-success')]/span[@class='alert-title' and normalize-space(text())='Ticket deleted']";
    public final String LFDashboardTotalVisits = "//span[@class='tw-truncate text-black' and text()='Total Visits']";
    public final String LFDashboardTotalChats = "//span[@class='tw-truncate text-black' and text()='Total Chats']";
    public final String LFDashboardTotalLeads = "//span[@class='tw-truncate text-black' and text()='Total Leads']";
    public final String LFDashboardTotalBillableLeads = "//span[@class='tw-truncate text-black' and text()='Total Billable Leads']";
    public final String LFDashboardClickThroughRate = "//span[@class='tw-truncate text-black' and text()='Click Through Rate']";
    public final String LFDashboardLeadConversionRate = "//span[@class='tw-truncate text-black' and text()='Lead Conversion Rate']";
    public final String LFDashboardCallConnectAttempts = "//span[@class='tw-truncate text-black' and text()='Call Connect Attempts']";
    public final String LFDashboardCallConnectDuration = "//span[@class='tw-truncate text-black' and text()='Call Connect Duration']";
    public final String LFDailyLeadsOptionLocator = "//a[@href='javascript:void(0)' and @data-duration='daily' and contains(@class, 'active') and text()='Daily']";
    public final String LFWidgetCopyCodeButtonLocator = "//button[text()='Copy Code']";
    public final String LFWidgetCopiedLocator = "//span[@class='tooltiptext' and contains(text(), 'Copied')]";
    public final String LFDeleteTicketTextLocator = "//*[@id=\"table-tickets\"]/tbody/tr/td[1]/div/a[3]";
    public final String LFSetuoDropDownLocator = "//ul[@class='nav nav-second-level collapse in']";
    public final String LFWidgetScriptEmailFieldLocator = "//input[@placeholder='Email address']";
    public final String LFWidgetScriptEmailFieldValue= "testinglfc@yopmail.com";
    public final String LFWidgetScriptEmailSendButtonLocator = "//button[@class='btn btn-primary tw-w-100' and normalize-space(text())='send']";
    public final String LFWidgetScriptEmailSentToastLocator = "//div[text()='Email sent successfully']";
//    public final String LFSuperAdminURL = "https://theliveforce.app/admin";
//    public final String LFSuperAdminEmailValue = "networks@cubixlabs.com";
//    public final String LFSuperAdminPasswordValue = "cIQYLO0G@)@#2023";
//    public final String LFSuperAdminSetupButtonLocator = "//a[@class='open-customizer']//span[contains(text(), 'Setup')]";
//    public final String LFSuperAdminSetupModulesButtonLocator = "//a[@href='https://theliveforce.app/admin/modules']//span[contains(text(), 'Modules')]";
//    public final String LFSuperAdminDeactivateLocator  = "//a[@href='https://theliveforce.app/admin/modules/deactivate/saas' and text()='Deactivate']";
//    public final String LFSuperAdminActiveLocator = "//a[@href='https://theliveforce.app/admin/modules/activate/saas' and text()='Activate']";
//    public final String LFSuperAdminPurchasekeyLocator = "//input[@id='purchase_key' and @name='purchase_key']";
//    public final String LFSuperAdminPurchasekeyValue = "f22210da-8f28-4af3-98de-4c5f83eeb584";
//    public final String LFSuperAdminPurchasekeySaveButtonLocator = "//button[@id='submit' and contains(@class, 'btn-info') and text()='Save']";
//    public final String LFSuperAdminModulesPage = "https://theliveforce.app/admin/modules";
//    public final String
//    public final String
    
}
