package com.company;

import java.util.ArrayList;

public class Book {
    private String title;
    Chapter chapter;
    //arrayList of chapters
    private  ArrayList<Chapter> chapterArrayList;

    public Book()
    {
        chapter= new Chapter ();
        chapterArrayList= new ArrayList<> (  );
    }

    public ArrayList<Chapter> getChapterArrayList() {
        return chapterArrayList;
    }

    public void setChapterArrayList(ArrayList<Chapter> chapterArrayList) {
        this.chapterArrayList = chapterArrayList;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Add method to add the chapters 
    public ArrayList<Chapter> addChapter(Chapter chapter)
    {

        chapterArrayList.add ( chapter );

        return chapterArrayList;
    }


}
