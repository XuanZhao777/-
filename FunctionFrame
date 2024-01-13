import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.List;

public class FunctionFrame extends JFrame {
    JButton searchButton, borrowButton, returnButton, exitButton;
    Library library; // 添加 Library 实例

    public FunctionFrame() {
        searchButton = new JButton("查询书籍");
        borrowButton = new JButton("借阅书籍");
        returnButton = new JButton("归还书籍");
        exitButton = new JButton("退出");

        // 为按钮设置字体
        Font buttonFont = new Font("微软雅黑", Font.BOLD, 18);
        searchButton.setFont(buttonFont);
        borrowButton.setFont(buttonFont);
        returnButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);

        // 设置按钮边界
        searchButton.setBounds(50, 50, 200, 40);
        borrowButton.setBounds(50, 120, 200, 40);
        returnButton.setBounds(50, 190, 200, 40);
        exitButton.setBounds(50, 260, 200, 40);

        // 为按钮添加动作监听器
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 查询书籍的逻辑
                String keyword = JOptionPane.showInputDialog("请输入查询关键词：");

                if (keyword != null && !keyword.isEmpty()) {
                    List<Book> searchResult = library.searchBooks(keyword);

                    // 显示查询结果，你可以根据你的 GUI 进行修改
                    StringBuilder resultMessage = new StringBuilder("查询结果:\n");
                    for (Book book : searchResult) {
                        resultMessage.append("书名：").append(book.getTitle()).append("\n");
                        resultMessage.append("作者：").append(book.getAuthor()).append("\n");
                        resultMessage.append("出版社：").append(book.getPublisher()).append("\n");
                        resultMessage.append("ISBN：").append(book.getISBN()).append("\n");
                        resultMessage.append("剩余量：").append(book.getRemainingQty()).append("\n");
                        resultMessage.append("--------------\n");
                    }

                    JOptionPane.showMessageDialog(null, resultMessage.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "请输入有效的查询关键词！");
                }
            }
        });

        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 借阅书籍的逻辑
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 归还书籍的逻辑
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 关闭 FunctionFrame
            }
        });

        // 将按钮添加到面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(searchButton);
        panel.add(borrowButton);
        panel.add(returnButton);
        panel.add(exitButton);

        // 初始化 Library 实例
        library = new Library();

        // 设置 FunctionFrame
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.setResizable(false);
        this.setTitle("图书馆功能界面");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FunctionFrame();
    }
}
