package os_project_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class Main {
    public static void main(String[] args) {
        ImagePanel2 panel = new ImagePanel2(
                new ImageIcon("C:\\Users\\Satbharai\\IdeaProjects\\Semester_project_DSA\\src\\os_project_14\\image.jpg").getImage());

        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setBounds(50,60,517,550);
        frame.setVisible(true);


        Label l1 = new Label("3 process First Come First Serve Scheduling");
        l1.setAlignment(Label.CENTER);
        Font font = new Font("Courier", Font.BOLD,16);
        l1.setForeground(Color.white);
        l1.setFont(font);
        l1.setBounds(60,60,380,50);
        l1.setBackground(Color.black);

        panel.add(l1);

        Label l2 = new Label("Enter the Burst time for p1");
        l2.setBounds(80,160,250,40);
        l2.setBackground(Color.white);
        l2.setAlignment(Label.CENTER);
        Font font2 = new Font("Courier", Font.BOLD,14);
        l2.setForeground(Color.black);
        l2.setFont(font2);
        panel.add(l2);

        TextField t1 = new TextField();
        t1.setBounds(350,160,50,40);
        t1.setBackground(Color.white);
        Font font3 = new Font("Courier", Font.BOLD,15);
        t1.setForeground(Color.black);
        t1.setFont(font3);
        panel.add(t1);

        Label l3 = new Label("Enter the Burst time for p2");
        l3.setBounds(80,220,250,40);
        l3.setBackground(Color.white);
        l3.setAlignment(Label.CENTER);
        l3.setForeground(Color.black);
        l3.setFont(font2);
        panel.add(l3);

        TextField t3 = new TextField();
        t3.setBounds(350,220,50,40);
        t3.setBackground(Color.white);
        t3.setForeground(Color.black);
        t3.setFont(font3);
        panel.add(t3);

        Label l4 = new Label("Enter the Burst time for p3");
        l4.setBounds(80,280,250,40);
        l4.setBackground(Color.white);
        l4.setAlignment(Label.CENTER);
        l4.setForeground(Color.black);
        l4.setFont(font2);
        panel.add(l4);

        TextField t4 = new TextField();
        t4.setBounds(350,280,50,40);
        t4.setBackground(Color.white);
        t4.setForeground(Color.black);
        t4.setFont(font3);
        panel.add(t4);

        Button b1 = new Button("Quit");
        b1.setBackground(Color.black);
        b1.setBounds(50,360,150,40);
        b1.setForeground(Color.white);
        b1.setFont(font3);
        panel.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    frame.dispose();
                }
            }
        });
        Button b2 = new Button("Continue");
        b2.setBackground(Color.black);
        b2.setBounds(300,360,150,40);
        b2.setForeground(Color.white);
        b2.setFont(font3);
        panel.add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (b2 == e.getSource()){
                    int b1= Integer.parseInt(t1.getText());
                    int b2= Integer.parseInt(t3.getText());
                    int b3= Integer.parseInt(t4.getText());
                    int b[]={b1,b2,b3};
                    Main2 m= new Main2(b);

                }

            }
        });

        };


    }

class ImagePanel extends JPanel {

    private Image img;

    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
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

