# Business_Card_OCR_Asymmetrik

This is the code for the coding challenge from Asymmetrik for the Summer 2020 Software Development Internship. Developed by Alexander Tran.

## Getting Started

The following instructions below will help get the system situated for usage for the project program. The following are for Linux systems.

### Prerequisites

- Java JDK
- Git

```
sudo apt install git
sudo apt install default-jdk
```

If your system requires additional installations along the process, please download the packages using sudo ...

### Installing

The repository can be cloned with the following command

```
git clone https://github.com/99atran/Business_Card_OCR_Asymmetrik.git
```

move to directory with the following command

```
cd Business_Card_OCR_Asymmetrik/business_card_ocr/src
```

Here, compile the program as followed

```
javac business_card_ocr/*.java
```

## Running the tests

The tests from the challenge are included as .txt files labelled test01.txt, test02.txt, and test03.txt. The contents are the same as the problem test cases.

To run these cases, execute this command in the same directory as above

```
java business_card_ocr.driver test01.txt
```

Note: the program takes in only one paramter.

It should return the name, phone number, and email address of the person who's contents are located in the file.


Each test handles phone numbers in a variety of formats such as (XXX)XXX XXXX, XXX-XXX-XXXX, and +X XXX XXX XXXX. 

The email addresses are all pattern-matched using Regex to determine which lines contain the email address. 

With lots of extraneous information in the file such as location and company name, the placement of the name relative to the other information is varied in each test case. 

## Running with own data

To run with your own data, run the command

```
java business_card_ocr.driver arg0
```
Here, arg0 is the filepath of the file/document that is to be parsed.

## Built With

* [Java SE](oracle.com/java/javase-downloads.html)
* [Eclipse IDE](eclipse.org/ide/)

## Authors

* **Alexander Tran** - [Github](https://github.com/99atran)
