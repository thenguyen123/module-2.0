package ss19.bai_tap._2.service;

import ss19.bai_tap._2.model.Product;

import java.io.*;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> read(String path) {
List<Product> products = null;
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) objectInputStream.readObject();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }return products;
    }
  public static void write( String path,List<Product> products)  {
      ObjectOutputStream objectOutputStream= null;
      try {
          objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
          objectOutputStream.writeObject(products);
          objectOutputStream.flush();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }finally {
          try {
              objectOutputStream.close();
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }

  }
}
