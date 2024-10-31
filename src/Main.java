import jdk.nashorn.internal.ir.IfNode;
import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"チョコレート",123000,"マルちゃん","甘い"));
        productList.add(new Product(2,"ら＝めん",623000,"にっしん","美味"));
        productList.add(new Product(3,"寿司",231000,"スシロー","新鮮"));
        productList.add(new Product(4,"うどん",632000,"にっしん","美味しい"));
        productList.add(new Product(5,"餃子 ",742000,"あじのもと","美味しい" ));
        productList.add(new Product(6,"味噌汁",776000,"マルコメ","塩軽い" ));
        System.out.println("Nhap vao path: ");
        String path = scanner.nextLine();
        writeProduct(path, productList);
        List<Product> result = readProduct(path);
        System.out.println(result);
        int keyID = scanner.nextInt();
        System.out.println("Tim kiem bang id key: ");
        findProduct(keyID,path);

    }

    public static void writeProduct(String path, List<Product> productList) {
        try(BufferedWriter oos = new BufferedWriter(new FileWriter(path))) {
            for (Product product : productList) {
                oos.write(product.getID() + " , " + product.getName() + " , " + product.getPrice() + " , " + product.getNameCompanymade() + " , " + product.getDescribe() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProduct(String path) {
        List<Product> productList = new ArrayList<>();
        String line = " ";
        try(BufferedReader ois = new BufferedReader(new FileReader(path))) {
            while ((line = ois.readLine()) != null) {
                String[] parts = line.split(" , ");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                String nameCompany = parts[3];
                String describe = parts[4];
                productList.add(new Product(id,name,price,nameCompany,describe));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
    public static void findProduct(int idkey, String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while (( line = br.readLine()) != null) {
                String[] parts = line.split(" , ");
                    int id = Integer.parseInt(parts[0]);
                if (id == idkey) {
                    // In thông tin sản phẩm nếu tìm thấy id khớp với idkey
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    String nameCompany = parts[3];
                    String descripbe = parts[4];

                    System.out.println("Product found:");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Price: " + price);
                    System.out.println("nameCompany: " + nameCompany);
                    System.out.println("Description: " + descripbe);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}