set projectLocation=F:\My Work\TECH DATA\seleniumproject\TestNG_Sample
cd %projectLocation%
set classpath=F:\My Work\TECH DATA\seleniumproject\TestNG_Sample\bin;%projectLocation%\lib\*;
java org.testng.TestNG testng.xml
pause