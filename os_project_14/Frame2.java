package os_project_14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2{
    private static void waiting_time(int n, int[] bt, int[] wt) {
        wt[0] = 0;
        // calculating waiting time

        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }
    private static void turnaround_time(int n, int[] bt, int[] wt, int[] tt) {
        for (int i = 0; i < n; i++) {
            tt[i] = bt[i] + wt[i]; //Calculating turn around time
        }
    }
    Frame2(int b1[]){


    }
}
