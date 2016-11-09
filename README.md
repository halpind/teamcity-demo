This example demonstrates how to import JUnit and JaCoCo reports.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 5.6+
* [SonarQube Java Plugin](http://docs.sonarqube.org/display/PLUG/Java+Plugin) 3.14+
* [SonarQube Cobertura Plugin](https://github.com/SonarQubeCommunity/sonar-cobertura) 1.6.3+
* Maven 3.0+

Usage
=====
* Prepare jacoco agent to allow coverage report generation, build the project, and execute the unit tests:

        mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install

* To get coverage per tests information, you will need to activate the profile when running the instrumented tests:

        mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Pcoverage-per-test

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar