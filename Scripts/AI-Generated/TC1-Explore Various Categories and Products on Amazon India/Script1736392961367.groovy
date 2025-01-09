import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link AllCategoriesMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AllCategoriesMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link AllCategoriesMenu.png')

"Step 3: Click on link BestSellers -> Navigate to page 'generic page#gp/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_BestSellers'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link BestSellers - Navigate to page generic pagegp.png')

"Step 4: Click on link AmazonLaunchpad -> Navigate to page 'product listing#gp/*/*/ref=zg bs nav boost 0'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_AmazonLaunchpad'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link AmazonLaunchpad - Navigate to page product listinggprefzg bs nav boost 0.png')

"Step 5: Click on link Body -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav boost 1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/ref=zg_bs_nav_boost_0?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Body'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link Body - Navigate to page product listinggprefzg bs nav boost 1.png')

"Step 6: Click on link Beauty -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav boost 2 10894224031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_boost_1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Beauty'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link Beauty - Navigate to page product listinggprefzg bs nav boost 2 10894224031.png')

"Step 7: Click on link Drugstore -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav boost 2 10894225031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_boost_2_10894224031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Drugstore'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link Drugstore - Navigate to page product listinggprefzg bs nav boost 2 10894225031.png')

"Step 8: Click on link Fashion -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav boost 2 10894228031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_boost_2_10894225031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Fashion'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link Fashion - Navigate to page product listinggprefzg bs nav boost 2 10894228031.png')

"Step 9: Click on link SportsOutdoors -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav boost 2 10894226031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_boost_2_10894228031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_SportsOutdoors'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link SportsOutdoors - Navigate to page product listinggprefzg bs nav boost 2 10894226031.png')

"Step 10: Click on link AnyDepartment -> Navigate to page 'product listing#gp/*/ref=zg bs unv boost 0 10894229031 4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_boost_2_10894226031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_AnyDepartment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link AnyDepartment - Navigate to page product listinggprefzg bs unv boost 0 10894229031 4.png')

"Step 11: Click on link ClothingAccessories -> Navigate to page 'product listing#gp/*/*/ref=zg bs nav apparel 0'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_unv_boost_0_10894229031_4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_ClothingAccessories'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link ClothingAccessories - Navigate to page product listinggprefzg bs nav apparel 0.png')

"Step 12: Click on link Men -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav apparel 1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/ref=zg_bs_nav_apparel_0?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Men'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link Men - Navigate to page product listinggprefzg bs nav apparel 1.png')

"Step 13: Click on link Jeans -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav apparel 2 1968024031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_apparel_1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Jeans'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link Jeans - Navigate to page product listinggprefzg bs nav apparel 2 1968024031.png')

"Step 14: Click on link Shorts -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav apparel 2 1968076031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_apparel_2_1968024031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Shorts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link Shorts - Navigate to page product listinggprefzg bs nav apparel 2 1968076031.png')

"Step 15: Click on link SleepLoungeWear -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav apparel 2 1968097031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_apparel_2_1968076031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_SleepLoungeWear'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on link SleepLoungeWear - Navigate to page product listinggprefzg bs nav apparel 2 1968097031.png')

"Step 16: Click on link SleepRobes -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav apparel 3 1968082031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_apparel_2_1968097031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_SleepRobes'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on link SleepRobes - Navigate to page product listinggprefzg bs nav apparel 3 1968082031.png')

"Step 17: Click on link AnyDepartment2 -> Navigate to page 'product listing#gp/*/ref=zg bs unv apparel 0 1968083031 5'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_apparel_3_1968082031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_AnyDepartment2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on link AnyDepartment2 - Navigate to page product listinggprefzg bs unv apparel 0 1968083031 5.png')

"Step 18: Click on link GiftCards -> Navigate to page 'product listing#gp/*/*/ref=zg bs nav gift-cards 0'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_unv_apparel_0_1968083031_5?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_GiftCards'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on link GiftCards - Navigate to page product listinggprefzg bs nav gift-cards 0.png')

"Step 19: Click on link GetWell -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav gift-cards 1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/ref=zg_bs_nav_gift-cards_0?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_GetWell'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link GetWell - Navigate to page product listinggprefzg bs nav gift-cards 1.png')

"Step 20: Click on link Housewarming -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav gift-cards 1 92070981031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_gift-cards_1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Housewarming'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link Housewarming - Navigate to page product listinggprefzg bs nav gift-cards 1 92070981031.png')

"Step 21: Click on link Love -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav gift-cards 1 92070982031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_gift-cards_1_92070981031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Love'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link Love - Navigate to page product listinggprefzg bs nav gift-cards 1 92070982031.png')

"Step 22: Click on link AnyDepartment3 -> Navigate to page 'product listing#gp/*/ref=zg bs unv gift-cards 0 92070980031 3'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_gift-cards_1_92070982031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_AnyDepartment3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link AnyDepartment3 - Navigate to page product listinggprefzg bs unv gift-cards 0 92070980031 3.png')

"Step 23: Click on link Music -> Navigate to page 'product listing#gp/*/*/ref=zg bs nav music 0'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_unv_gift-cards_0_92070980031_3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Music'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on link Music - Navigate to page product listinggprefzg bs nav music 0.png')

"Step 24: Click on link Bhangra -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/ref=zg_bs_nav_music_0?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Bhangra'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on link Bhangra - Navigate to page product listinggprefzg bs nav music 1.png')

"Step 25: Click on link DevotionalSpiritual -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375855031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_DevotionalSpiritual'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on link DevotionalSpiritual - Navigate to page product listinggprefzg bs nav music 1 1375855031.png')

"Step 26: Click on link EasyListening -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375846031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375855031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_EasyListening'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on link EasyListening - Navigate to page product listinggprefzg bs nav music 1 1375846031.png')

"Step 27: Click on link FilmSongs -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375742031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375846031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_FilmSongs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on link FilmSongs - Navigate to page product listinggprefzg bs nav music 1 1375742031.png')

"Step 28: Click on link Ghazals -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375845031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375742031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Ghazals'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on link Ghazals - Navigate to page product listinggprefzg bs nav music 1 1375845031.png')

"Step 29: Click on link Gospel -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375847031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375845031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Gospel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on link Gospel - Navigate to page product listinggprefzg bs nav music 1 1375847031.png')

"Step 30: Click on link HardRockMetal -> Navigate to page 'product listing#gp/*/*/*/ref=zg bs nav music 1 1375759031'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375847031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_HardRockMetal'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on link HardRockMetal - Navigate to page product listinggprefzg bs nav music 1 1375759031.png')

"Step 31: Click on link AnyDepartment4 -> Navigate to page 'product listing#gp/*/ref=zg bs unv music 0 1375856031 3'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/.*/ref=zg_bs_nav_music_1_1375759031?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_AnyDepartment4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on link AnyDepartment4 - Navigate to page product listinggprefzg bs unv music 0 1375856031 3.png')

"Step 32: Click on link Jewellery -> Navigate to page 'product category#gp/*/*/ref=zg bs nav jewelry 0'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_unv_music_0_1375856031_3?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_Jewellery'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on link Jewellery - Navigate to page product categorygprefzg bs nav jewelry 0.png')

"Step 33: Click on link AnyDepartment -> Navigate to page 'product listing#gp/*/ref=zg bs unv jewelry 0 1'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/.*/ref=zg_bs_nav_jewelry_0?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category/link_AnyDepartment'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on link AnyDepartment - Navigate to page product listinggprefzg bs unv jewelry 0 1.png')

"Step 34: Click on link MoversAndShakers -> Navigate to page 'product category#gp/*/ref=zg bs tab bsms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_unv_jewelry_0_1?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_MoversAndShakers'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on link MoversAndShakers - Navigate to page product categorygprefzg bs tab bsms.png')

"Step 35: Click on link CustomerService -> Navigate to page 'help page#gp/help/customer/display.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/.*/ref=zg_bs_tab_bsms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_category/link_CustomerService'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on link CustomerService - Navigate to page help pagegphelpcustomerdisplayhtml.png')

"Step 36: Click on link Electronics -> Navigate to page 'electronics category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/help/customer/display.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_help/link_Electronics'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on link Electronics - Navigate to page electronics category.png')

"Step 37: Click on link HomeKitchen -> Navigate to page 'home kitchen category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_electronics_category/link_HomeKitchen'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on link HomeKitchen - Navigate to page home kitchen category.png')

"Step 38: Click on link AmazonPay -> Navigate to page 'ecommerce home#amazonpay/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home_kitchen_category/link_AmazonPay'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on link AmazonPay - Navigate to page ecommerce homeamazonpayhome.png')

"Step 39: Click on link Fresh -> Navigate to page 'ecommerce page#*/storefront'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'amazonpay/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_home/link_Fresh'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on link Fresh - Navigate to page ecommerce pagestorefront.png')

"Step 40: Click on div PopoverContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/storefront?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce/div_PopoverContent'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on div PopoverContent.png')

"Step 41: Click on link Skip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/storefront?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce/link_Skip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on link Skip.png')

"Step 42: Click on link HygienePersonalCare -> Navigate to page 'category page#*/category'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/storefront?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce/link_HygienePersonalCare'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on link HygienePersonalCare - Navigate to page category pagecategory.png')

"Step 43: Click on link foodCategories (DietNutrition)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/category?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_foodCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_foodCategories', ['link_foodCategories_internalRoleLinkName': link_foodCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on link foodCategories DietNutrition.png')

"Step 44: Click on link foodCategories (EggsMeatFish)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/category?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_foodCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_foodCategories', ['link_foodCategories_internalRoleLinkName': link_foodCategories_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on link foodCategories EggsMeatFish.png')

"Step 45: Click on div SnacksBiscuits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/category?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_SnacksBiscuits'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on div SnacksBiscuits.png')

"Step 46: Click on link foodCategories (OilMasalaSauces)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/category?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_foodCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_foodCategories', ['link_foodCategories_internalRoleLinkName': link_foodCategories_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on link foodCategories OilMasalaSauces.png')

"Step 47: Click on link Mobiles -> Navigate to page 'mobile phones category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/category?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Mobiles'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on link Mobiles - Navigate to page mobile phones category.png')

"Step 48: Click on link Fashion -> Navigate to page 'generic browse page#gp/browse.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_mobile_phones_category/link_Fashion'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on link Fashion - Navigate to page generic browse pagegpbrowsehtml.png')

"Step 49: Click on link Computers -> Navigate to page 'computers accessories category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/browse.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_browse/link_Computers'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on link Computers - Navigate to page computers accessories category.png')

"Step 50: Click on link Sell -> Navigate to page 'product page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_computers_accessories_category/link_Sell'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Click on link Sell - Navigate to page product page.png')

"Step 51: Click on link Fashion -> Navigate to page 'generic browse page#gp/browse.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Fashion'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on link Fashion - Navigate to page generic browse pagegpbrowsehtml.png')

"Step 52: Click on link AllCategoriesMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/browse.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_browse/link_AllCategoriesMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Click on link AllCategoriesMenu.png')

"Step 53: Click on link FireTV"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/browse.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_browse/link_FireTV'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Click on link FireTV.png')

"Step 54: Click on link AmazonPrimeVideo -> Navigate to page 'single character path#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'gp/browse.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_browse/link_AmazonPrimeVideo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on link AmazonPrimeVideo - Navigate to page single character path.png')

"Step 55: Click on link Electronics -> Navigate to page 'electronics category#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_single_character_path/link_Electronics'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Click on link Electronics - Navigate to page electronics category.png')

"Step 56: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Various Categories and Products on Amazon India_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}