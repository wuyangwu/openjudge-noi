package Optional;

import Optional.model.Book;
import Optional.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/19 16:44
 */
public class OptionalUser {

    public static String getBook(Book book){

        return Optional.ofNullable(book).map(u -> book.getBookName()).orElse("book is null");
    }


    public static String getUser(User user){
        return Optional.ofNullable(user).map(u -> getBook(user.getBook())).orElse("user is null");
    }

    public static void main(String[] args ){
        User user = new User("吴同学","wuStudent@qq.com");
        System.out.println(Optional.ofNullable(user).map(u-> u).get().getEmail());
//        System.out.println(getUser(user));
    }
}
