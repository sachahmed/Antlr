class TestPerson
{
    static void Main()
    {
        // Call the constructor that has no parameters.
        Person person1 = new Person();
        Console.WriteLine(person1.name);

        person1.SetName("John Smith");
        Console.WriteLine(person1.name);

        // Call the constructor that has one parameter.
        Person person2 = new Person("Sarah Jones");
        Console.WriteLine(person2.name);

        // Keep the console window open in debug mode.
        Console.WriteLine("Press any key to exit.");
        Console.ReadKey();
    }
}