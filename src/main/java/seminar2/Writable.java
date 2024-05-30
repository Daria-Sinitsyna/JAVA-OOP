package seminar2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public interface Writable {

    // сохранить
    //загрузить

    void save(Serializable stream, String path) throws IOException;
    Object load(String path) throws IOException, ClassNotFoundException;
}
