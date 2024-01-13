import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> bookList;

    public Library() {
        // 初始化图书馆，添加一些示例图书
        bookList = new ArrayList<>();
        bookList.add(new Book("Java编程思想", "Bruce Eckel", "机械工业出版社", "9787111213826", 10));
        bookList.add(new Book("Effective Java", "Joshua Bloch", "机械工业出版社", "9787111267584", 15));
        // 添加更多示例图书...

        // 你也可以从文件或数据库加载图书信息
        // 例如：loadBooksFromFile();
    }

    // 查询书籍的方法
    public List<Book> searchBooks(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            // 根据书名、作者、ISBN 模糊匹配
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    // 借阅图书的方法

    public boolean borrowBook(String ISBN) {
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                if (book.getRemainingQty() > 0) {
                    book.setRemainingQty(book.getRemainingQty() - 1);
                    System.out.println("借阅成功！");
                    return true; // 借阅成功
                } else {
                    System.out.println("剩余量不足，无法借阅！");
                    return false; // 剩余量不足，借阅失败
                }
            }
        }
        System.out.println("找不到对应的图书！");
        return false; // 找不到对应的图书，借阅失败
    }

    // 归还图书的方法
    public void returnBook(String ISBN) {
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                book.setRemainingQty(book.getRemainingQty() + 1);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("找不到对应的图书！");
        // 找不到对应的图书，可能是错误或者图书不在图书馆中，可以根据实际情况进行处理
    }

    // 示例方法：从文件加载图书信息
    private void loadBooksFromFile() {
        // 实现从文件加载图书信息的逻辑
    }
}
