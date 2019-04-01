# Automation_Test

 * Verify the state of the environment in which you are going to work:
 
    - Verify the jre (Java Run Time Edition) that is installed
        java -version
      
    - Verify the version of jdk installed 
        javac -version
      
    If you do not have it, you must download and install
    
        https://www.java.com/es/download/
        https://www.oracle.com/technetwork/es/java/javase/downloads/index.html


    - Verify if maven is installed
        mvn --version

    In case of not having it, it must be downloaded and installed following the steps indicated
    
        http://maven.apache.org/download.cgi
  
  
  
 * Download Install IntelliJ IDEA
 
    - Create new project
        Select Maven option
        Verify Project SDK, Select Home Directory for JDK
        Next 
        Put the name of project
        Next
        Put the name of project
        Finish



* Configure POM
 
    - Add junit
    
	        <dependency>
              <groupId>junit</groupId>
              <artifactId>junit</artifactId>
              <version>4.12</version> 
          </dependency>
        
    - Add selenium
    
	        <dependency>
              <groupId>org.seleniumhq.selenium</groupId>
              <artifactId>selenium-java</artifactId>
              <version>3.141.59</version>
          </dependency>  
        

* Write and execute test
    * Place in the src folder, click on java, create a new class
    * Copy and paste the code in this repo or type them.
    * To run double click on test name in this case "verificar", rigth click, run.        
    
    References
    
        https://www.jetbrains.com/idea/ 
        http://junit.org/ 
        http://www.seleniumhq.org/
  
  
  

