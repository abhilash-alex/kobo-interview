package koboTest.solution3;

/**
 * Created by abhilash on 2018-08-06.
 *
 * Visitor Pattern is used here.
 */
public interface PostageInterface {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
}