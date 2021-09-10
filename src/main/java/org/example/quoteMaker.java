package org.example;

import java.util.Scanner;


public class quoteMaker
{
    String quote;
    String person;

    //gets user input
    public quoteMaker()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the quote? ");
        this.quote = scan.nextLine();

        System.out.print("Who said it? ");
        this.person = scan.nextLine();
    }

    //conjoins person who said the quote and the actual quote
    public void StringConstructor()
    {
        System.out.println(this.person+" says, \""+this.quote+"\"");
    }


}
