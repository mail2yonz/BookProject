package com.company;

import java.util.ArrayList;

public class Chapter {
    private String title;
    Pages pages;

    //ArrayList of pages
    ArrayList<Pages> pagesArrayList;

    public ArrayList<Pages> getPagesArrayList() {
        return pagesArrayList;
    }

    public void setPagesArrayList(ArrayList<Pages> pagesArrayList) {
        this.pagesArrayList = pagesArrayList;
    }


    public Chapter()
    {
        pages = new Pages ();
        pagesArrayList= new ArrayList<> (  );
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Pages> addPages(Pages pages)
    {
        pagesArrayList.add ( pages );
        return pagesArrayList;
    }


}
