package com.example.mathcompetencysurvey;

public class SchoolList {
    //data section
    private School schools[] = new School[10];
    private int currnum;

    //operations
    public void addSchool(School sc){
        schools[currnum] = sc;
        currnum++;

    }

    public static void main(String arg[]){
        SchoolList moelist = new SchoolList();
        //moelist.addSchool();

    }


}
