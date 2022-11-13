package com.SokoNumber;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Structure  {

     String board [][] =
             {
                     {"space", "space", "space", "space", "space", "space", "space"},
                     {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
                     {"wall", "box,1", "path", "path", "path", "goal,1", "wall"},
                     {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
                     {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
                     {"space", "space", "space", "space", "space", "space", "space"}
             };
     int level ;
    int box1[] = {1,2};
    int box2 []= {0,0};
    int box3[]= {0,0};
    int box4 []= {0,0};
    int box5 []= {0,0};
    boolean end = false;




    public  Structure() {
        this.level = 1;
        Board B = new Board();
        BuildGame(B.initialBoard_L1);

    }


    public void BuildGame (String arr[][]) //build Board of Game
    {

        for(int i =0 ; i<=5 ; i++){
            for(int j=0 ; j<=6;j++){
                this.board[i][j] = arr[i][j];
                String type = arr[i][j];
                if(type.split(",")[0]== "box")
                {
                    if(type.split(",")[1] == "1")
                    {
                        this.box1[0]= i;
                        this.box1[1]= j;

                    }
                    else if(type.split(",")[1] == "2")
                    {
                        this.box2[0]= i;
                        this.box2[1]= j;
                    }
                    else if(type.split(",")[1] == "3")
                    {
                        this.box3[0]= i;
                        this.box3[1]= j;                    }
                    else if(type.split(",")[1] == "4")
                    {
                        this.box4[0]= i;
                        this.box4[1]= j;                    }
                    else if(type.split(",")[1] == "5")
                    {
                        this.box5[0]= i;
                        this.box5[1]= j;                      }

                }
            }

            }
        if(this.level==6)
        {

        }

    }

    public void upLevel() {
        this.level+=1;
        Board B = new Board();
        if(this.level == 2){

            this.BuildGame(B.initialBoard_L2);
        } else if(this.level == 3){

            this.BuildGame(B.initialBoard_L3);
        } else if(this.level == 4){

            this.BuildGame(B.initialBoard_L4);
        }else if(this.level == 5){

            this.BuildGame(B.initialBoard_L5);
        }else if(this.level == 6){

            this.BuildGame(B.initialBoard_L6);
        }
        if(this.level > 6 )
        {
            this.end= true;
        }

    }  // move to next Level

    public void print()
    {
        for(int i =0 ; i<=5 ; i++){
            System.out.print("\n");
            for(int j=0 ; j<=6;j++){
                if(this.board[i][j] == "wall")
                {
                    System.out.print("|#|");
                }else  if(this.board[i][j] == "path")
                {
                    System.out.print("   ");
                }else  if(this.board[i][j] == "space")
                {
                    System.out.print("     ");
                }else  if(this.board[i][j] == "goal,1")
                {
                    String type [] = this.board[i][j].split(",");
                    System.out.print("("+ type[1]+ ")");
                }  else {
                    String type [] = this.board[i][j].split(",");
                    System.out.print(" "+type[1]+" ");
                }


            }

        }
    }



    public List<String> checkMove (int row , int cloumn){
        List <String> posionNext= new ArrayList<>();
        if(this.isAvaliable(this.board[row][cloumn+1]))  //right
        {
            int var = cloumn+1;
            posionNext.add(""+row+","+var);
        }
        if(this.isAvaliable(this.board[row][cloumn-1])) //left
        {
            int var = cloumn-1;

            posionNext.add(""+row+","+var);
        }
        if(this.isAvaliable(this.board[row+1][cloumn]))
        {
            int var = row+1;

            posionNext.add(""+var+","+cloumn);
        }
        if(this.isAvaliable(this.board[row=1][cloumn+1]))
        {
            int var = row-1;

            posionNext.add(""+var+","+cloumn);
        }
        return posionNext;

    }

        public boolean isAvaliable(String state)
        {
            if (state == "path"){return  true;}
            if (state.split(",") [0]== "goal"){return  true;}
            else {
                return  false;
            }
        }

    public void GetNextStates (int row ,int column){



    }

    public void Move (String input , boolean withOther )
    {

        int row1 = 0;
        int column1=0;
        int row2=0;
        int column2=0;

        if(input.split(" ")[0] == "1")
        {
            row1 = this.box1[0];
            column1 = this.box1[1];

        }
        if(input.split(" ")[0] == "2")
        {
            row1 = this.box2[0];
            column1 = this.box2[1];

        }        if(input.split(" ")[0]  == "3")
    {
        row1 = this.box3[0];
        column1 = this.box3[1];

    }        if(input.split(" ")[0]  == "4")
    {
        row1 = this.box4[0];
        column1 = this.box4[1];

    }        if(input.split(" ")[0]  == "box5")
    {
        row1 = this.box5[0];
        column1 = this.box5[1];

    }


        if(input.split(" ")[1]  == "r")
        {
            row2 = row1;
            column2 = column1+1;
        }
        else if(input.split(" ")[1] == "l")
        {
            row2 = row1;
            column2 = column1-1;
        }
        else if(input.split(" ")[1] == "u")
        {
            row2 = row1-1;
            column2 = column1;
        }
        else if(input.split(" ")[1] == "d")
        {
            row2 = row1+1;
            column2 = column1;
        }







    }



    public String[][] standardBoard()
    {

        Board B = new Board();
        if(this.level == 2){

            return  B.initialBoard_L2;
        } else if(this.level == 3){

            return  B.initialBoard_L3;
        } else if(this.level == 4){

            return  B.initialBoard_L4;
        }else if(this.level == 5){

            return  B.initialBoard_L5;
        }else if(this.level == 6){

            return  B.initialBoard_L6;
        }
        return  B.initialBoard_L1;

    }


    public boolean isFinal(int row , int column)
    {
        String state[] = this.standardBoard()[row][column].split(",");
        if(state[0]=="goal")
        {
            if(this.board[row][column].split(",")[0]=="box")
            {
                if(this.board[row][column].split(",")[1]==state[1])
                {
                    return true;
                }
            }
        }
        return false;
    }

//   public void Moveall(int row , int cloumn){
//       List <String> arr = new ArrayList<>();
//        if( this.box1 [0] == row || this.box1[1] ==  cloumn){
//           arr.add();
//        }
//
//   }

    public void DeepCopy(int row1 , int column1 ,int row2 , int column2 ,boolean withOther)
    {
        String state1 = this.board[row1][column1];
        String type = this.board[row2][column2];
        if(type != "wall" && type !="space" )
        {
            String type2 [] = this.board[row2][column2].split(",");
            if(type2[0] != "box")
            {
                this.board[row1][column1] = this.board[row2][column2];

            }

        }
    }








    }






















