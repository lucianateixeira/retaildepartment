# retaildepartment
This is an application written in Java that manages a retail system and its assets. 
Programming Application: IT Department Program
The following project was written in Java, following the best practices and all the possible features, it describes an online retail shop that needs a program to help manage their assets. 
It was divided into classes and methods to meet all the requirements, which each one will be explained individually. 
1)	Class Structures

1.1	) Main class:
1.2	 Objects:
This program contains six objects, they all have different attributes and inherit two from the superclass (type and price). A “for” was used to create a bigger number of objects and simplify this process as bigger numbers were needed to build the stock.
This block of code is followed immediately by the menu, created using “switch”. 

1.3	) Hierarchy:
The program has a superclass and six subclasses, following the hierarchy parameters. The superclass is called Product, it has two attributes: String type and float price, which is common to all the following subclasses. Java allows the subclasses to inherit attributes from the superclass, making it easier and more compact.
2)	Methods
2.1) Get and Setter:
This program has the methods “get” and “set”, as part of the construction for the creation of the objects in the superclass and all its subclasses. It’s displayed getMobileMemory and setMobileMemory, for example and it has been applied, obviously, to all the attributes of all the objects. 
public String getMobileMemory() {
        return mobileMemory;
    }
public void setMobileMemory(String mobileMemory) {
        this.mobileMemory = mobileMemory;
    }
2.2) isComputerInsurance:
This method is present in the subclasses and it defines whether a device will need insurance or not. It’s a Boolean type, which returns true/yes or false/no results.
	The subclasses followed the appropriate naming, for example, class Laptop has isLaptopInsurance and so on. 

3)	Java libraries
3.1) ArrayList:
One of the advantages of the array list is to make the program flexible, by not stating the limit for an array it becomes possible to add objects later without altering the program from scratch. It was used to make this program flexible when a new asset is added; it was also the structures used to make the inventory by calling the array list and count the items within the array. 
3.2) Scanner:
This feature is used to receive a user input. In this case, to make the menu section work properly when the user chooses the option. The output should follow the option chosen.
4)	Java Features:
4.1)  Switch 
Switch was used to create a menu, where the options are visible to the user and by selecting a number a code is run. There as nine different scenarios represented by cases inside the switch command. 
5)	Extra Information:
In this project, every device above 1000 euros had to insured. Network was selected as a device here because it contains the same attributes as computers and laptops. It was just an option to do so open to interpretation. 
Secondly, when declaring some of the attributes mostly String was used, other types could’ve been concatenated, however the program offers all the options and meet all the requirements regardless. 



