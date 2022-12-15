package os_project_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class Main2 {
     Main2(int b[]){
         ImagePanel2 panel = new ImagePanel2(
                 new ImageIcon("C:\\Users\\Satbharai\\IdeaProjects\\Semester_project_DSA\\src\\os_project_14\\image.jpg").getImage());

         JFrame frame = new JFrame();
         frame.getContentPane().add(panel);
         frame.pack();
         frame.setBounds(50,60,517,550);
         frame.setVisible(true);


         Label l2 = new Label("pid         bt        wt        tt");
         l2.setBounds(80,60,310,40);
         l2.setBackground(Color.white);
         l2.setAlignment(Label.CENTER);
         Font font2 = new Font("Courier", Font.BOLD,14);
         l2.setForeground(Color.black);
         l2.setFont(font2);
         panel.add(l2);

         Example1 s= new Example1();
         int wt[]= new int[3];
         wt[0]= 0;
         for (int i = 1; i <3; i++) {
             wt[i] = b[i - 1] + wt[i - 1];
         }
         int tt[]= new int[3];
         for (int i = 1; i < 3; i++) {
             tt[i] = b[i] + wt[i]; //Calculating turn around time
         }
         float awt=0,att=0;
         for(int i=0;i<3;i++) {

             Label l4 = new Label(Integer.toString(i+1)+"          "+Integer.toString(b[i])+"          "+wt[i]+"          "+tt[i]);
             l4.setBounds(80, 110+(i*50), 310, 40);
             l4.setBackground(Color.white);
             l4.setAlignment(Label.CENTER);
             Font font6 = new Font("Courier", Font.BOLD, 14);
             l4.setForeground(Color.black);
             l4.setFont(font6);
             panel.add(l4);
             awt+=wt[i];
             att+=tt[i];

         }
         awt=awt/3;
         att=att/3;

         Label ll= new Label("Average waiting time = "+awt);
         ll.setBounds(50,280,260,40);
         ll.setBackground(Color.white);
         Font font5 = new Font("Courier", Font.BOLD,14);
         ll.setForeground(Color.black);
         ll.setFont(font5);
         panel.add(ll);



         Label ll1= new Label("Average Turnaround time = "+att);
         ll1.setBounds(50,320,260,40);
         ll1.setBackground(Color.white);
         Font font6 = new Font("Courier", Font.BOLD,14);
         ll1.setForeground(Color.black);
         ll1.setFont(font6);
         panel.add(ll1);


         Button b2 = new Button("EXIT");
         b2.setBackground(Color.black);
         b2.setBounds(350,380,100,40);
         Font font8 = new Font("Courier", Font.BOLD,13);
         b2.setForeground(Color.white);
         b2.setFont(font8);
         panel.add(b2);

         b2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 if (b2 == e.getSource()){
                     frame.dispose();
                 }

             }
         });

     }



 }

class ImagePanel2 extends JPanel {

    private final Image img;

    public ImagePanel2(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel2(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0,500,500,null);
    }
}

