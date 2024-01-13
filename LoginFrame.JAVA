import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    //用户名变量（文本）
    JLabel userLabel;
    //用户名输入框（文本输入框）
    JTextField userField;
    //密码变量（文本）
    JLabel userLabel2;
    //密码输入框（文本输入框）
    JPasswordField userField2;
    //登录按钮、取消按钮（按钮）
    JButton Login, Cancel;

    public LoginFrame() {
        userLabel = new JLabel("用户名");
        userLabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
        userLabel2 = new JLabel("密  码");
        userLabel2.setFont(new Font("微软雅黑", Font.BOLD, 18));

        userLabel.setBounds(20, 220, 100, 30);
        this.add(userLabel);
        userLabel2.setBounds(20, 280, 100, 30);
        this.add(userLabel2);

        userField = new JTextField();
        userField.setBounds(80, 80, 100, 30);
        userField.setBorder(BorderFactory.createLoweredBevelBorder());
        userField.setOpaque(false);
        this.add(userField);

        userField2 = new JPasswordField();
        userField2.setBounds(80, 140, 100, 30);
        userField2.setBorder(BorderFactory.createLoweredBevelBorder());
        userField2.setOpaque(false);
        this.add(userField2);

        Login = new JButton("登录");
        Login.setBounds(45, 200, 60, 36);
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = userField.getText();
                String passWord = userField2.getText();

                if ("team13".equals(userName) && "123".equals(passWord)) {
                    JOptionPane.showMessageDialog(null, "欢迎" + userName + "来到重庆理工大学图书馆");

                    // Open FunctionFrame upon successful login
                    new FunctionFrame();

                    dispose();
                } else if ("".equals(userName) || "".equals(passWord)) {
                    JOptionPane.showMessageDialog(null, "用户名 / 密码不能为空，请重新输入！");
                } else {
                    JOptionPane.showMessageDialog(null, "用户名 / 密码输入错误，请重新输入！");
                }
            }
        });
        this.add(Login);

        Cancel = new JButton("取消");
        Cancel.setBounds(135, 200, 60, 36);
        this.add(Cancel);
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        LoginPanel panel = new LoginPanel();
        this.add(panel);

        this.setSize(900, 530);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setIconImage(new ImageIcon("Image/115.png").getImage());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

    class LoginPanel extends JPanel {
        Image background;

        public LoginPanel() {
            try {
                background = ImageIO.read(new File("Image/login.jpeg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(background, 0, 0, 900, 530, null);
        }
    }
}
