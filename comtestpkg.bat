set projectLocation=C:\Solarturbines_Workspace\AutomationPOCs
cd %projectLocation%
set classpath=C:\Program Files\Apache\bin;C:\Program Files\Apache\lib\*
mvn clean package
mvn install
pause
