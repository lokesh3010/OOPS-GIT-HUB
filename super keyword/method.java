class Bank
{
    void display()
    {
        System.out.println("Bank provides financial services");
    }
}

class Account extends Bank
{
    void display()
    {
        System.out.println("Account is created");
    }

    void show()
    {
        super.display();
        display();
    }
}

class TestSuper2
{
    public static void main(String args[])
    {
        Account a = new Account();
        a.show();
    }
}