/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc;

/**
 * for login // name: Ishraq , mobile number: 01534741641, pass:
 *
 *****
 * @author 19301261
 */
import java.util.Scanner;

public class Home extends Account {

    Scanner sc = new Scanner(System.in);
    static int counter = 0;
    String name;
    String number;
    String code;
    static double balance;

    public Home() {
        System.out.println("               Welcome to Marscash\n");
        System.out.print("Enter your name: ");
        setName(sc.nextLine());
        System.out.print("Enter your mobile number: ");
        setNumber(sc.nextLine());
        System.out.print("Enter your passcode: ");
        setCode(sc.nextLine());
        if (getName() == name && getNumber() == num && getCode() == pass) {
            System.out.println("\tHello " + this.name + ", welcome to your Marscash account! \nYour current balance is:" + getBalance());
            optionCheck();
        } else {
            System.out.println("Sssorry invalid account information!\nPlease try again!");
        }
    }

    public String getName() {
        return  this.name;
    }

    public String getInfoName() {
        return "Name: " + this.name;
    }

    public String getInfoNumber() {
        return "Account number: " + this.number;
    }

    public void setName(String n) {
        this.name = n;
        String a = "Ishraq";
        String b = "Shalima";
        String c = "Dipu";
        if (n.equals(a) || n.equals(b) || n.equals(c)) {
        } else {
            counter++;
        }

    }

    public void setNumber(String mn) {
        this.number = mn;
        String a = "01534741641";
        String b = "01670050158";
        String c = "01553388564";
        if (mn.equals(a) || mn.equals(b) || mn.equals(c)) {
        } else {
            counter++;
        }

    }

    public void setCode(String c) {
        this.code = c;
        String a = "*****";
        String b = "xyz123";
        String d = "abc123";
        if (c.equals(a) || c.equals(b) || c.equals(d)) {
        } else {
            counter++;
        }
    }

    public String getNumber() {
        return  this.number;
    }

    public String getCode() {
        return  this.code;
    }

    public void optionDetails() {
        System.out.println("\n 1.Send Money\n 2.Mobile Recharge\n 3.Payment\n 4.Cash Out\n 5.Pay Bill\n 6.My Marscash\n 7.Helpline");
        System.out.print("\nSelect option: ");
    }

    public void mName() {
        String a = "Ishraq";
        String b = "Shalima";
        String c = "Dipu";
        System.out.print("Enter your name: ");
        String n = sc.nextLine();
        this.name = n;
        if (n.equals(a) || n.equals(b) || n.equals(c)) {
        } else {
            counter++;
        }
    }

    public void mNumber() {
        String a = "01534741641";
        String b = "01670050158";
        String c = "01553388564";
        System.out.print("Enter your mobile number: ");
        String mn = sc.nextLine();
        this.number = mn;
        if (mn.equals(a) || mn.equals(b) || mn.equals(c)) {
        } else {
            counter++;
        }
    }

    public void mCode() {
        String a = "*****";
        String b = "xyz123";
        String d = "abc123";
        System.out.print("Enter your pass code: ");
        String c = sc.nextLine();
        this.code = c;
        if (c.equals(a) || c.equals(b) || c.equals(d)) {
        } else {
            counter++;
        }
    }

    public void check() {

        if (counter >= 1 && counter <= 3) {
            System.out.println("Sorry invalid account information!\nPlease try again!");
        } else {
            System.out.println("\tHello " + this.name + ", welcome to your Marscash account! \nYour current balance is:" + getBalance());
            optionCheck();

        }
    }

    public void optionCheck() {
        int p = 0;
        while (p != 8 || p == 9) {
            optionDetails();
            int n = sc.nextInt();
            if (n == 1) {
                sendMoney();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 2) {
                mobileRecharge();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 3) {
                payment();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 4) {
                cashOut();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 5) {
                payBill();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 6) {
                myMarsCash();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            } else if (n == 7) {
                helpLine();
                System.out.println("press 8 to exit or press 9 to back main menu");
                p = sc.nextInt();
                if (p == 8) {
                    System.out.println("Thank you " + this.name + " for using Marscash");
                }
            }
        }
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setUpdateBalance(double ub) {
        this.balance = ub;
    }

    public double getUpdateBalance() {
        return this.balance;
    }

    public void sendMoney() {
        System.out.print("\nEnter recevier number: ");
        int rn = sc.nextInt();
        System.out.print("Enter ammount: ");
        double am = sc.nextDouble();
        if (getUpdateBalance() > am) {
            System.out.println("Successfully send money!");
            double nb = getBalance() - am;
            System.out.println("Your new account balance is: " + nb);
            setUpdateBalance(nb);
        } else {
            System.out.println("You have not sufficient balance in your account.");
        }
    }

    public void mobileRecharge() {
        System.out.print("\nEnter moblile number: ");
        int mn = sc.nextInt();
        System.out.print("Enter ammount: ");
        double am = sc.nextDouble();
        if (getUpdateBalance() > am) {
            System.out.println("Successfully recharged!");
            double nb = getBalance() - am;
            System.out.println("Your new account balance is: " + nb);
            setUpdateBalance(nb);
        } else {
            System.out.println("You have not sufficient balance in your account.");
        }
    }

    public void payment() {
        System.out.print("\nEnter moblile number: ");
        int mn = sc.nextInt();
        System.out.print("Enter ammount: ");
        double am = sc.nextDouble();
        if (getUpdateBalance() > am) {
            System.out.println("Successfully paid!");
            double nb = getBalance() - am;
            System.out.println("Your new account balance is: " + nb);
            setUpdateBalance(nb);
        } else {
            System.out.println("You have not sufficient balance in your account.");
        }
    }

    public void cashOut() {
        System.out.print("\nEnter agent moblile number: ");
        int mn = sc.nextInt();
        System.out.print("Enter ammount: ");
        double am = sc.nextDouble();
        if (getUpdateBalance() > am) {
            System.out.println("Successfully cash out!");
            double nb = getBalance() - am;
            System.out.println("Your new account balance is: " + nb);
            setUpdateBalance(nb);
        } else {
            System.out.println("You have not sufficient balance in your account.");
        }
    }

    public void payBill() {
        payBillOption();
    }

    public void payBillOption() {
        System.out.println("1.Electricity\n2.Gas\n3.Internet, TV\n4.University admission fee");
        System.out.print("\nSelect option: ");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("1.Palli Bidyut\n2.NESCO\n3.DESCO\n4.BDDB");
            System.out.print("\nSelect option: ");
            int eop = sc.nextInt();
            if (eop == 1 || eop == 2 || eop == 3 || eop == 4) {
                System.out.print("Enter account number: ");
                String pb = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter amount: ");
                double am = sc.nextDouble();
                if (getUpdateBalance() > am) {
                    System.out.println("Successfully bill paid!");
                    double nb = getBalance() - am;
                    System.out.println("Your new account balance is: " + nb);
                    setUpdateBalance(nb);
                } else {
                    System.out.println("You have not sufficient balance in your account.");
                }
            }
        } else if (op == 2) {
            System.out.print("Enter account number: ");
            String pb = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter amount: ");
            double am = sc.nextDouble();
            if (getUpdateBalance() > am) {
                System.out.println("Successfully bill paid!");
                double nb = getBalance() - am;
                System.out.println("Your new account balance is: " + nb);
                setUpdateBalance(nb);
            } else {
                System.out.println("You have not sufficient balance in your account.");
            }
        } else if (op == 3) {
            System.out.println("1.BTCL\n2.CARNIVAL\n3.AmberIT\n4.Link3\n5.AkashDTH");
            System.out.print("\nSelect option: ");
            int eop = sc.nextInt();
            if (eop == 1 || eop == 2 || eop == 3 || eop == 4 || eop == 5) {
                System.out.print("Enter account number: ");
                String pb = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter amount: ");
                double am = sc.nextDouble();
                if (getUpdateBalance() > am) {
                    System.out.println("Successfully bill paid!");
                    double nb = getBalance() - am;
                    System.out.println("Your new account balance is: " + nb);
                    setUpdateBalance(nb);
                } else {
                    System.out.println("You have not sufficient balance in your account.");
                }
            }
        } else if (op == 4) {
            System.out.println("1.BRACU\n2.BUET\n3.IUT\n4.DU\n5.SUST");
            System.out.print("\nSelect option: ");
            int eop = sc.nextInt();
            if (eop == 1 || eop == 2 || eop == 3 || eop == 4 || eop == 5) {
                System.out.print("Enter account number: ");
                String pb = sc.nextLine();
                sc.nextLine();
                System.out.print("Enter amount: ");
                double am = sc.nextDouble();
                if (getUpdateBalance() > am) {
                    System.out.println("Successfully fees paid!");
                    double nb = getBalance() - am;
                    System.out.println("Your new account balance is: " + nb);
                    setUpdateBalance(nb);
                } else {
                    System.out.println("You have not sufficient balance in your account.");
                }
            }
        }
    }

    public void myMarsCash() {
        System.out.println("1.Account information\n2.Check balance");
        System.out.print("\nSelect option: ");
        int o = sc.nextInt();
        if (o == 1) {
            System.out.println(getInfoName());
            System.out.println(getInfoNumber());
        } else if (o == 2) {
            System.out.println("Current balance is: " + getUpdateBalance());
        }
    }

    public void helpLine() {
        System.out.println("Call 19301261 to know more information\n or visit www.marscash.com ");
    }

}
