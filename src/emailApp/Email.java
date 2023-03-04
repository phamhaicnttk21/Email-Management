package emailApp;

import java.util.Scanner;

public class Email {
     private String firstName ;
     private String lastName;
     private String password;
     private String department;
     private String email;
     private int mailboxCapacity = 500;
     private int defaultpasswordLength = 10;
     private String alternateEmail;
     private String companySuffix = "aeycompany.com";


//          Constructor to receive the firstName and lastName
          public Email(String firstName,String lastName){
              this.firstName = firstName;
              this.lastName = lastName;
              System.out.println("Email Created:" + this.firstName +" "+ this.lastName);

//          call a method asking for the department and return the deparment
              this.department =setDepartment();
              System.out.println("Department: " + this.department);


//          Call a method that returns a random password
              this.password = randomPassword(defaultpasswordLength);
              System.out.println("your password is: " + this.password);


//              combine elements to generate email
              email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
              System.out.println("Your email is : " + email);
          }
//    Ask for the department
            private String setDepartment(){

                System.out.println("New Worker: " + firstName+ ". Department Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
                Scanner in = new Scanner(System.in);
                  int depChoice =in.nextInt();
                if(depChoice==1){return "Sales";} 
                else if (depChoice==2) {return "Developements";}
                else if (depChoice==3) {return "Acc";}
                else { return "";}
            }

//    Generate a random password
            private String randomPassword(int length){
              String passwordSet = "ABCDFGIHJKLOQWEURIE1234567890!@#$%^&*";
              char [] password = new char[length];
              for(int i =0;i<length;i++){
                int rand=  (int)(Math.random()*passwordSet.length());
                password[i] = passwordSet.charAt(rand);
              }
              return new String(password);


            }
//    Set the mailbox capacity
            public void setMailboxCapacity(int capacity){
              this.mailboxCapacity = capacity;

            }
//     set the alternate email
            public void setAlternateEmail(String altEmail){
              this.alternateEmail = altEmail;
            }
//     change the password
            public void changePassword(String password){
              this.password = password;
            }
            public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    public String showInfo(){
              return " \nDISPLAY NAME: "+ firstName + " " + lastName +
                      "\nCOMPANY EMAIL: " + email +
                      "\nMAILBOX CAPACITY:" + mailboxCapacity + ".mb";
    }

}
