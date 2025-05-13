# Home-Control-System


# Smart Home Appliance Control System

## Overview

This Smart Home Appliance Control System allows users to control various home appliances, including Light, Fan, and Air Conditioner. Each appliance has its own unique behavior for turning off:

- Light: Turned off by toggling the switch to the "off" position.
- Fan: Turned off by reducing its speed to zero.
- Air Conditioner: Turned off by setting its thermostat to the "off" mode.

The system also automatically performs a yearly update on January 1st at 1:00 AM local time, turning off all appliances during the update.


## Technologies Used

- Java 17+
- Spring Boot
- Maven


## Installation

Follow these steps to run the application:

Install Java 17 or later
Make sure you have Java 17 or later installed. You can verify this by running:
java -version
Install Maven (if not already installed):
You can check if Maven is installed by running:
mvn -version
If it’s not installed, you can download and install it from here.
Build the Project:
Run the following command to build the project and install the necessary dependencies:
mvn clean install
Run the Application:
Start the Spring Boot application using the following command:
mvn spring-boot:run
