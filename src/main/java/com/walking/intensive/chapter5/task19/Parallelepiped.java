package com.walking.intensive.chapter5.task19;

public class Parallelepiped {
    int x1;
    int y1;
    int z1;

    int x2;
    int y2;
    int z2;

    int[][][] frontSide = getSides(x1, y1, x2, y2);
    int[][][] topSide = getSides(x1, z1, x2, z2);
    int[][][] rightSide = getSides(z1, y1, z2, y2);

    Parallelepiped(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;

    }

    public int[][][] getSides(int x1, int y1, int x2, int y2) {
        int[][][] side = new int[Math.abs(y1 - y2)][Math.abs(x1 - x2)][2];
        for (int i = 0; i < side.length; i++) {
            for (int j = 0; j < side[i].length; j++) {
                for (int k = 0; k < side[i][j].length; k++) {
                    if (k == 0) {
                        side[i][j][k] = Math.min(x1, x2);
                    }
                    if (k == 1) {
                        side[i][j][k] = Math.max(y1, y2);
                    }
                }
            }
        }

        return side;
    }
}

