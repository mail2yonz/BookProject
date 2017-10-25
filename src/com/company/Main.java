/*
      Yonatan Mengesha
      Java boot camp

      Book, chapters and pages

 */


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String answer;
        Scanner keyboard= new Scanner (System.in);
        Book book= new Book();
        Chapter chapter ;
        Pages pages;
        System.out.println ("Enter the title of the book: " );
        book.setTitle ( keyboard.nextLine () );
do {
    chapter = new Chapter ();
    System.out.println ( "Enter the chapters title: " );
    chapter.setTitle ( keyboard.nextLine ( ) );

    do {
        pages= new Pages();
        System.out.println ( "Enter the pages Content:  " );
        pages.setContent ( keyboard.nextLine ( ) );
//
//        System.out.println ( "Enter the pages number: " );
//        pages.setNum_pages ( keyboard.nextInt ( ) );
//        keyboard.nextLine ( );

        System.out.println ("Do you want to Add another page?(yes/no)" );
        answer= keyboard.nextLine ();

        chapter.addPages ( pages );
    }while(answer.equalsIgnoreCase ( "yes" )||!answer.equalsIgnoreCase ( "No" ));

    System.out.println ("Do you want to Add another Chapter to the Book?(Yes/No)" );
    answer=keyboard.nextLine ();

            book.addChapter ( chapter );

} while (answer.equalsIgnoreCase ( "yes" )||!answer.equalsIgnoreCase ( "No" ));

        System.out.println ("Books Title: "+ book.getTitle () );
for(Chapter chapter1:book.getChapterArrayList ())
{


    System.out.println ("Chapter title: " + chapter1.getTitle () );

    for(Pages pages1:chapter1.getPagesArrayList ())
    {
        System.out.println ("The pages : " + pages1.getContent ()   );
    }
}


    }
}
