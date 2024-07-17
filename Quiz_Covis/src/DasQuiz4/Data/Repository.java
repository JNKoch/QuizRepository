package DasQuiz4.Data;

import java.util.List;

public interface Repository <T,K>{
    List<T> read();

    T create(T name);
    T readById(K id);
    T update(T name);
    T delete(T name);

    K createID();
}
