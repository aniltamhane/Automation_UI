set projectLocation=C:\Eclipse_Selenium_Workspace\Automation_UI
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml