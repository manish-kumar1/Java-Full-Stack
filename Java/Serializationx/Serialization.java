import java.io.*;

class Serialization implements Serializable {
    int id;    
    String name;

    Serialization(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class UseSerialization {
    public static void main(String[] args) {
        try {
            Serialization obj = new Serialization(12, "Ravi");
            FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(obj);
            out.flush();
            out.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
