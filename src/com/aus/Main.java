package com.aus;

public class Main {

    public static void main(String[] args) {
        EmployeeTest();
        System.out.println();
        DateTest();
        System.out.println();
        bankAccount();
        System.out.println();
        var book = new Book("test" , 100, "aus", "willis");
        getBookInfo(book);
        System.out.println();

        // i do not no what u what to do with the
        bookTest();


    }

    private static void bookTest() {
        Book[] book1 = new Book[30];
        for (int i =0; i<=30; i++){
            book1[i].setISBN(100);
            book1[i].setPublisher("willis");
            book1[i].setAuthorName("aus");
            book1[i].setBookName("meme");
            System.out.println(book1[i].getAuthorName() +" "
                    +book1[i].getISBN() +" "+ book1[i].getBookName()
                    + " " + book1[i].getPublisher(""));
        }

    }

    private static Book getBookInfo(Book book) {
        System.out.println("book name :" + book.getBookName());
        System.out.println("author name :" + book.getAuthorName());
        System.out.println("ISBN :" + book.getISBN());
        System.out.println("publisher :" + book.getPublisher("Willis"));

        return book;
    }

//    private static void getBookInfo() {
//        var book1 = new Book("meme", 1000, "aus", "me.com");
//        System.out.println("book name :" + book1.getBookName());
//        System.out.println("author name :" + book1.getAuthorName());
//        System.out.println("ISBN :" + book1.getISBN());
//        System.out.println("publisher :" + book1.getPublisher());
//    }

    private static void bankAccount() {
        var saver1 = new SavingsAccount(2000.00, .04);
        var saver2 = new  SavingsAccount(3000.00, .04);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.println(saver2.getSavingsBalance());
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1.getSavingsBalance());
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
        System.out.println(saver2.getSavingsBalance());
    }

    private static void DateTest() {
        var date = new Date(07,24,2020);
        System.out.println("the date is " + date.getMonth() + " / " + date.getDay() + " / " + date.getYear());
    }

    private static void EmployeeTest() {
        var emp1 = new Employee("Moe","saba", 4000);
        var emp2 = new Employee("john", "smith", 3500);
        if (!(emp1.getMonthlySalary()>=0 && emp2.getMonthlySalary()>=0)) {
            emp1.setMonthlySalary(0);
            emp2.setMonthlySalary(0);
        }
        System.out.print("moe saba yearly salary : " + (emp1.getMonthlySalary()*12));
        System.out.println();
       System.out.print("john smith yearly salary: " + (emp2.getMonthlySalary()*12));
        System.out.println();
        System.out.print("moe salary after 10 % increase: " + (((emp1.getMonthlySalary()*12)*0.1)+(emp1.getMonthlySalary()*12)));
        System.out.println();
        System.out.println("john salary after 10 % increase: " + (((emp2.getMonthlySalary()*12)*0.1)+(emp2.getMonthlySalary()*12)));
    }
}
