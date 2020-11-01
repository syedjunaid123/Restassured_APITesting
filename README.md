# API Automation Using - RestAssured + Java + TestNG + Maven + Apache POI + BDD

Some of the basic testing enhancement were implemented, to make this more better for maintenance of the test scripts, and to make it more reliable and Utilisable.

## Below is the basic description of the Project:

- **Configuration:** All the API call is fetching from **Config.properties** files, Hence this section maiinly contains Config and the classes used for fetching those details
				 
- **Utilitiees:** This section contains the Excel class which is used to fetch Employee Id from Excel file using Apache POI implementations. 

- **Tests:** A test class is added to run the test cases, TestNG annotations are used to trigger and end the test case. And a Feature file is also added where the Test Cases are written in gherkins approach.

- **pom.XML:** Maven is used as a project building tool, and all the project dependencies are added here.

- **Reporting:** As part of report, a basic TestNG default report is used, which is available in **"test-out folder with a file name index.html"**. 
    However as a future enhancement, Extent Report or Allure report can also be implemented



## Pre-requisites to be installed before proceeding:

1. JDK (Latest Java SE)
2. Eclipse IDE or IntelliJ IDE


## Steps to Proceed:

1. Clone the project from the Git Repo: 
	>https://github.com/syedjunaid123/Restassured_APITesting.git
	
2. If the Maven has not automatically started downloading the dependecies, then you can run the below command.
	>mvn package

3. Run the TestCases File to Run all the Scripts.
