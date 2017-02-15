/**
 * Created by 24965 on 2017/2/15.
 */
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class consoledialog extends JFrame {

    JTextArea consolearea;
    JScrollPane scol;
    public consoledialog() {
        // TODO Auto-generated constructor stub
        consolearea=new JTextArea();
        scol=new JScrollPane(consolearea);
        consolearea.setEditable(true);
        setTitle("编译框");
        add(scol);
        setVisible(true);
        setBounds(0, 0, 200, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                Mainclass.frame.setState(JFrame.ICONIFIED);

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                Mainclass.frame.setState(JFrame.NORMAL);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                int i = JOptionPane.showConfirmDialog(null, "确定关闭编辑器", "系统提示",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(i == JOptionPane.YES_OPTION)
                {
                    System.out.println(Mainclass.flag);
                    for(int j=0;j<Mainclass.flag;j++)
                    {
                        File file3=new File(Mainclass.button4[j].getText().substring(0, Mainclass.button4[j].getText().indexOf('.'))+".txt");
                        if(file3.exists())
                        {
                            file3.exists();
                        }
                        File file=new File(Mainclass.button4[j].getText());
                        if(file.exists())
                        {
                            file.delete();
                        }
                        File file2=new File(Mainclass.button4[j].getText().substring(0, Mainclass.button4[j].getText().indexOf('.'))+".class");
                        if(file2.exists())
                        {
                            file2.delete();
                        }
                    }
                    System.exit(0);
                }

                else
                    return;
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }

}
