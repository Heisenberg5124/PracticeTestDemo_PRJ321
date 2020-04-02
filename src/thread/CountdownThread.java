package thread;

import javax.swing.JOptionPane;

public class CountdownThread implements Runnable {    
    String name;
    
    public CountdownThread() {
    }

    public CountdownThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String[] options = new String[2];
        options[0] = "Continue";
        options[1] = "Stop";

        do {
            int time = 100;

            while (time > 0) {
                System.out.println(time);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time--;
            }
            System.out.println("Time up!");
        } while (JOptionPane.showOptionDialog(null, "Do you want to continue or stop " + name + "?", "Confirm", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null) == JOptionPane.YES_OPTION);
        
        System.exit(0);
    }
}
