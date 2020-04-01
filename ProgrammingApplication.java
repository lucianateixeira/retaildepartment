
package programmingapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProgrammingApplication {
    
    public static void main(String[] args) {
    
        //List of the objects created in its classes and instantied here: 
        
        //Computers:
        List<Computer> computers = new ArrayList<Computer>();
        Computer[] computerss = new Computer[14];
        for (int i = 0; i < 12; i++) {
            computerss[i] = new Computer("Dell Inspirons", 500f, 
                "Windows 10 Home 64bit Multi-Language English", 
                "8th Generation Intel® Core™ i3-8100 Processor", 8, 
                "3.5\" 1TB 7200 rpm Hard Drive");
            computers.add(computerss[i]);
        }
        
        //Laptops: 
        List<Laptop> laptops = new ArrayList<Laptop>();
        Laptop[] laptopss = new Laptop[18];
        for (int i = 0; i < laptopss.length; i++) {
            laptopss[i] = new Laptop("Dell XPS13", 950f, 
                "Windows 10 Pro (64-bit)","8th Generation Intel® Core™ i7",
                "32 GB DDR4 (2 DIMM)", "1 TB HDD");
            laptops.add(laptopss[i]);
        }
        
        //Softwares:
       Software softwareOffice= new Software("Microsoft Office", 400f);
       Software softwarePhotoshop = new Software("Photoshop", 295f);
       Software softwareAntivirus = new Software("Norton Antivirus", 105f);
       Software softwareTeamWork = new Software("TeamWork", 275f);
        
       
       //Mobiles:
       List<Mobile> iphone = new ArrayList<Mobile>();
        Mobile[] mobileiphone = new Mobile[7];
        for (int i = 0; i < mobileiphone.length; i++) {
            mobileiphone[i] = new Mobile("iPhone XS", 725f,"5.8”", 256, "12MP", "iOS 12");
            iphone.add(mobileiphone[i]);
        }
   
       List<Mobile> samsung = new ArrayList<Mobile>();
        Mobile[] mobilesam = new Mobile[11];
        for (int i = 0; i < mobilesam.length; i++) {
            mobilesam[i] = new Mobile("Samsung S9", 855f,"6.2”", 64,"8MP", "Android 9");
            samsung.add(mobilesam[i]);
        }
      
        //Tablets:
      List<Tablet> tablets = new ArrayList<Tablet>();
        Tablet[] tabletss = new Tablet[6];
        for (int i = 0; i < tabletss.length; i++) {
            tabletss[i] = new Tablet("iPad 2017", 1200f, "10”", "128 GB", "9MP","iOS 11");
            tablets.add(tabletss[i]);
        }
       
      //Networks:
       List<Network> networks = new ArrayList<Network>();
        Network[] networkss = new Network[4];
        for (int i = 0; i < networkss.length; i++) {
            networkss[i] = new Network("Dell Server", 2500f, "Intel AXU", "Window Server", "16 GB","100 TB");
            networks.add(networkss[i]);
        }
            
     
       //Display the menu
    System.out.println("Command Options: ");
    System.out.println("1:Lists the full inventory of IT assets");
    System.out.println("2:Display the full value of all hardware and software");
    System.out.println("3:Displays the total memory storage available from all computer assets");
    System.out.println("4:Display the specification of a Dell Server XModel");
    System.out.println("5:Display the average memory size of the mobile device types");
    System.out.println("6:Add 2 new Dell Inspiron PCs");
    System.out.println("7:Display all assets that need insurance");
    System.out.println("8:Dispose of 3 Samsung 9 phones and display the new total of those phones" );
    System.out.println("9:Add a new piece of software to the Software Application Pack");
    System.out.println("Select an option:");
    
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    
do 
    
    switch (choice){
  case 1:
      //Item 1: Display all the IT assets: 
        System.out.println("Computers: " );
        System.out.println(computerss[1].getType() + " " + computers.size());
        System.out.println("Laptops: " );
        System.out.println(laptopss[1].getType() + " " + laptops.size());
        System.out.println("Networks: " );
        System.out.println(networkss[1].getType() + " " + networks.size());
        System.out.println("Mobiles (Iphones): " );
        System.out.println(mobileiphone[1].getType() + " " + iphone.size());
        System.out.println("Mobiles (Samsung: " );
        System.out.println(mobilesam[1].getType() + " " + samsung.size());
        System.out.println("Tablets: " );
        System.out.println(tabletss[1].getType() + " " + tablets.size());
        System.out.println("Softwares: " );
        System.out.println(softwareOffice.getType());
        System.out.println(softwarePhotoshop.getType());
        System.out.println(softwareAntivirus.getType());
break;
  case 2: 
      //item 2: Should display all the products and their prices combined for each assset:
        //Computers:
            System.out.println("Computers: " );
            System.out.println(computerss[1].getType()+ " " + computerss[1].getPrice() + " " + computers.size());
            int sumComputers = 0;
        for (Computer c : computers) {
            sumComputers += c.getPrice();
        }
        {
            System.out.println("The total for computers is: " +sumComputers);
        }
        
        //Laptops
        System.out.println("Laptops: " );
            System.out.println(laptopss[1].getType()+ " " + laptopss[1].getPrice() + " " + laptops.size());
            int sumLaptops = 0;
        for (Laptop l : laptops) {
            sumLaptops += l.getPrice();
        }
        {
            System.out.println("The total for laptops is: " +sumLaptops);
        }
        
        //Network
        System.out.println("Network: " );
            System.out.println(networkss[1].getType()+ " " + networkss[1].getPrice() + " " + networks.size());
            int sumNetworks = 0;
        for (Network n : networks) {
            sumNetworks += n.getPrice();
        }
        {
            System.out.println("The total for network is: " +sumNetworks);
        }
        
        //Mobile
        System.out.println("Mobiles (Iphones): " );
            System.out.println(mobileiphone[1].getType()+ " " + mobileiphone[1].getPrice() + " " + iphone.size());
            int sumIphone = 0;
        for (Mobile i : iphone) {
            sumIphone += i.getPrice();
        }
        {
            System.out.println("The total for Iphone is: " +sumIphone);
        }
        
        System.out.println("Mobile (Samsung): " );
            System.out.println(mobilesam[1].getType()+ " " + mobilesam[1].getPrice() + " " + samsung.size());
            int sumSamsung = 0;
        for (Mobile s : samsung) {
            sumSamsung += s.getPrice();
        }
        {
            System.out.println("The total for Samsung is: " +sumSamsung);
        }
        
        //Tablet
        System.out.println("Tablets: " );
            System.out.println(tabletss[1].getType()+ " " + tabletss[1].getPrice() + " " + tablets.size());
            int sumTablets = 0;
        for (Tablet t: tablets) {
            sumTablets += t.getPrice();
        }
        {
            System.out.println("The total for tablet is: " +sumTablets);
        }
        break;
        
  case 3 : 
      //item 3: Display the memory for computers
        System.out.println("Computers Memory Storage" );
            System.out.println(computerss[1].getType()+ " " + computerss[1].getComputerMemory() + " " + computers.size());
            int sumMemoryStorage = 0;
        for (Computer c: computers) {
            sumMemoryStorage += c.getComputerMemory();
        }
        {
            System.out.println("Total memory storage available is: " +sumMemoryStorage);
        }
        break;
        
  case 4:     
        //item 4: Display specification for Windows Server:
        System.out.println("Specification for Windows Server: " );
        System.out.println("Type: " + networkss[1].getType());
        System.out.println("Price: " + networkss[1].getPrice());
        System.out.println("Model: " + networkss[1].getNetModel());
        System.out.println("Operating System: " + networkss[1].getNetworkOS());
        System.out.println("Memory: " + networkss[1].getNetMemory());
        System.out.println("Storage: " + networkss[1].getNetStorage());
        break;
        
  case 5 : 
        
        //item 5: 
        System.out.println("Mobile Memory Storage" );
            System.out.println(mobileiphone[1].getMobileMemory()+ " " + iphone.size());
            int sumMemoryIphone = 0;
        for (Mobile MemIphone: iphone) {
            sumMemoryIphone += MemIphone.getMobileMemory();
        }
            System.out.println(mobilesam[1].getMobileMemory()+ " " + samsung.size());
            int sumMemorySamsung = 0;
        for (Mobile MemSamsung: samsung) {
            sumMemorySamsung += MemSamsung.getMobileMemory();
        }
        {
            System.out.println("Total memory storage available is: " +sumMemoryIphone + sumMemorySamsung);
        }
        break;
        
  case 6 : 
       
       //item 6: add two PC and display the new total numbers: 
            computerss[12] = new Computer("Dell Inspirons", 500f, 
                "Windows 10 Home 64bit Multi-Language English", 
                "8th Generation Intel® Core™ i3-8100 Processor",  8 , 
                "3.5\" 1TB 7200 rpm Hard Drive");
            computers.add(computerss[12]);

            computerss[13] = new Computer("Dell Inspirons", 500f, 
                "Windows 10 Home 64bit Multi-Language English", 
                "8th Generation Intel® Core™ i3-8100 Processor",  8 , 
                "3.5\" 1TB 7200 rpm Hard Drive");
            computers.add(computerss[13]);
            
            System.out.println("New Total of computers: " );
            System.out.println(computerss[1].getType()+ " " + computerss[1].getPrice() + " " + computers.size());
            int sumNewComputers = 0;
        for (Computer newSum : computers) {
            sumNewComputers += newSum.getPrice();
        }
        {
            System.out.println("The new total for computers is: " +sumNewComputers);
        }
             break;
     
  case 7:
    //item 7: Display assets that need insurance:  
    for (Computer c : computers) {
            if (c.isComputerInsurance()){
                System.out.println(c.getPrice());
            }
    }
    
    for (Laptop l : laptops) {
            if (l.isLaptopInsurance()){
                System.out.println(l.getPrice());
            }
    }
    
    for (Network n: networks) {
            if (n.isNetInsurance()){
                System.out.println(n.getPrice());
            }
    }
    for (Tablet t : tablets) {
            if (t.isTabletInsurance()){
                System.out.println(t.getPrice());
            }
    }
    
   break;
    
  case 8: 
    //item 8: Dispose of 3 Samsung 9 phones and display the new total of those phones
    samsung.remove(mobilesam[10]);
    samsung.remove(mobilesam[9]);
    samsung.remove(mobilesam[8]);
    System.out.println("New total for Samsung: " );
    System.out.println(mobilesam[1].getType() + " " + samsung.size());
    break;
    
  case 9: 
    //item 9: Add new software and display new value.
    System.out.println("Softwares: " );
            System.out.println(softwareOffice.getPrice() +  softwarePhotoshop.getPrice() 
    + softwareAntivirus.getPrice() + softwareTeamWork.getPrice());
           int sumSoftwares = 0;
           
            sumSoftwares += softwareOffice.getPrice() +  softwarePhotoshop.getPrice() + softwareAntivirus.getPrice()+ softwareTeamWork.getPrice();
            
            
       
       System.out.println("The total for softwares is: " +sumSoftwares);
    
   break;
    }

    while (choice>9);
    }

}













