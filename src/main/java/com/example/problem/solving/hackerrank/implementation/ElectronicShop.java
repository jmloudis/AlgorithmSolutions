package com.example.problem.solving.hackerrank.implementation;

public class ElectronicShop {

    private int[] keyboards = new int[]{3,1};
    private int[] drives = new int[]{5,2,8};
    private int budget = 10;

    public int getMoneySpent(){


        int n = -1;

        for (int i = 0; i < drives.length; i++){
            for (int j = 0; j < keyboards.length; j++){

                int sum = (keyboards[j] + drives[i]);

                if (sum <= budget){
                    n = sum;
                }

                /**
                 * Or
                 *
                 *  if (sum > budget){
                 *      continue;
                 *  }
                 */

            }
        }

        return n;

    }

    public int[] getKeyboards() {
        return keyboards;
    }

    public void setKeyboards(int[] keyboards) {
        this.keyboards = keyboards;
    }

    public int[] getDrives() {
        return drives;
    }

    public void setDrives(int[] drives) {
        this.drives = drives;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
