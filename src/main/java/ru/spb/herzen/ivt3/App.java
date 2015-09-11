package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String myname = "Alexander Shevchenko";
        System.out.println("I am " + myname);
        RandomNameGenerator rnd = new RandomNameGenerator(1995);
        for (int i = 0; i < 15; i++) {

            String name = rnd.next();
            System.out.println( "Hello World! "+ name );
        }
    }
}
