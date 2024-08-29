package com.hanwhaswcamp.section01.autowired.subsection03.setter;

import com.hanwhaswcamp.section01.autowired.common.BookDAO;
import com.hanwhaswcamp.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Component의 세분화 어노테이션으로 Service 계층에서 사용한다.
// IOC container가 알아서 객체를 생성하게 하고 싶음
@Service("bookServiceSetter")
public class BookService {


    private BookDAO bookDAO;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }
}
