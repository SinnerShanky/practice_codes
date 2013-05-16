import javax.swing.*;
class swin
{
    JFrame jfrm;
    JLabel jlab;
    swin()
    {
        jfrm=new JFrame();
        jlab=new JLabel("Shashank");
        jfrm.setSize(100,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                new swin();
            }
        });
    }
}
