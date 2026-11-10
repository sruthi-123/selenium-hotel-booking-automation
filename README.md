# Selenium Hotel Booking Automation

A Java Selenium practice project that automates a hotel booking
on the Adactin Hotel Application (Build 2).

## Features

- Login using credentials from a private configuration file
- Search for a hotel and select a result
- Enter guest and booking details
- Submit the booking and print the generated order ID
- Organise page elements using Page Object Model
- Manage Selenium dependencies using Maven

## Technologies

Java, Selenium WebDriver, Maven, Eclipse and Chrome.

## Run in Eclipse

1. Download or clone this repository.
2. In Eclipse, select File → Import → Maven → Existing Maven Projects.
3. Select the project folder and finish importing.
4. Copy config.example.properties to config.local.properties
   beside pom.xml.
5. Enter your activated Adactin practice account credentials
   in config.local.properties, without quotation marks.
6. Update the booking dates and fictional test details in HotelPom.java.
7. Right-click HotelPom.java → Run As → Java Application.

Use JDK 17 or newer and Chrome. The working directory must be
the project folder so Java can find config.local.properties.

## Verification

Successfully ran the booking workflow in Eclipse on
10 November 2026 and generated an order ID.

## Limitations

Booking data is currently stored in Java code.
Automated assertions have not yet been added.
Running requires an activated practice account and access
to the external demo website.

## Credentials

config.local.properties is private and excluded through .gitignore.
Never upload real credentials or payment details.
