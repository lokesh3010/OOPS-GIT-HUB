class College
{
    College()
    {
        System.out.println("College is created");
    }
}

class Department extends College
{
    Department()
    {
        super();
        System.out.println("Department is created");
    }
}

class TestSuper3
{
    public static void main(String args[])
    {
        Department d = new Department();
    }
}
