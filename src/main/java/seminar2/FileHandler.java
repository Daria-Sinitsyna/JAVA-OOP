package seminar2;

import java.io.*;

public class FileHandler implements Writable{

    //метод сохранения и загрузки


    public void save(Serializable stream, String path) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(stream);
        out.close();
    }

    public Object load(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        return objectInputStream.readObject();

    }


}
