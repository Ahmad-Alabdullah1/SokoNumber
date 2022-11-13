package com.SokoNumber;



public class State implements Cloneable{
 public  String type;
 public int row;
 public int column;
 public String number;
 public boolean is_gaol;

 public State(int row , int column ) {
     this.type = "space";
     this.row = row;
     this.column =column;
     this.number = " ";
     this.is_gaol =false;

 }
 State(){
     this.type = "Hiiiiiiiiiiiiiiiiiii";

 }

    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to
        // new reference variable t
        State t = (State) super.clone();

        // Creating a deep copy for c
        t.type = type;
        t.row =  row;
        t.column =column;
        t.number = number;
        t.is_gaol = is_gaol;
        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }

 public void  ispath(int row , int cloumn){
     this.type = "path";
     this.row = row;
     this.column =cloumn;
     this.number = " ";
     this.is_gaol =false;
 }
    public void iswall(int row , int cloumn){
        this.type = "wall";
        this.row = row;
        this.column =cloumn;
        this.number = " ";
        this.is_gaol =false;
    }
    public void isbox(String num,int row , int cloumn){
        this.type = "box";
        this.row = row;
        this.column =cloumn;
        this.number = num;
        this.is_gaol =false;
    }
    public void isgoal(String num,int row , int cloumn){
        this.type = "goal";
        this.row = row;
        this.column =cloumn;
        this.number = num;
        this.is_gaol =true;
    }

}
