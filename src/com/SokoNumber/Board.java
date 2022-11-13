package com.SokoNumber;

public class Board {




    public String initialBoard_L1[][] = {
            {"space", "space", "space", "space", "space", "space", "space"},
            {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
            {"wall", "box,1", "path", "path", "path", "goal,1", "wall"},
            {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
            {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
            {"space", "space", "space", "space", "space", "space", "space"},

    };

    public String initialBoard_L2[][] = {
            {"space", "wall", "wall", "wall", "wall", "wall", "space"},
            {"space", "wall", "box,1", "wall", "box,2", "wall", "space"},
            {"space", "wall", "path", "wall", "path", "wall", "space"},
            {"space", "wall", "path", "wall", "path", "wall", "space"},
            {"space", "wall", "goal,1", "wall", "goal,2", "wall", "space"},
            {"space", "wall", "wall", "wall", "wall", "wall", "space"},

    };

    public String initialBoard_L3[][] = {
            {"space", "wall", "wall", "wall", "wall", "wall", "space"},
            {"space", "wall", "box,1", "goal,2", "path", "wall", "space"},
            {"space", "wall", "wall", "path", "wall", "wall", "space"},
            {"space", "wall", "path", "goal,1", "box,1", "wall", "space"},
            {"space", "wall", "wall", "wall", "wall", "wall", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},

    };

    public String initialBoard_L4[][] = {
            {"space", "space", "space", "space", "space", "space", "space"},
            {"wall", "wall", "wall", "wall", "wall", "wall", "wall"},
            {"wall", "box,1", "wall", "box,2", "wall", "box,3", "wall"},
            {"wall", "goal,3", "path", "goal,2", "path", "goal,1", "wall"},
            {"wall", "wall", "wall", "path", "wall", "wall", "wall"},
            {"space", "space", "wall", "wall", "wall", "space", "space"},

    };

    public String initialBoard_L5[][] = {
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},

    };

    public String initialBoard_L6[][] = {
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "box,1", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},
            {"space", "space", "space", "space", "space", "space", "space"},

    };

    public String getType(int Level, int row, int column) {

        if (Level == 1) {
            return this.initialBoard_L1[row][column];
        }
        if (Level == 2) {
            return this.initialBoard_L2[row][column];
        }
        if (Level == 3) {
            return this.initialBoard_L3[row][column];
        }
        if (Level == 4) {
            return this.initialBoard_L4[row][column];
        }
        if (Level == 5) {
            return this.initialBoard_L5[row][column];
        }
        if (Level == 6) {
            return this.initialBoard_L6[row][column];
        }

    return  "NO";
    }
}




