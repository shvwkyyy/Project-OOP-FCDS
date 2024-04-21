import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        ElectronicProduct e1 = new ElectronicProduct();
        e1.setName("smartphone");
        e1.setProductId(1);
        e1.setPrice(599.99);
        e1.setBrand("Samsung");
        e1.setWarrantyPeriod(1);
        ClothingProduct c1 = new ClothingProduct();
        c1.setName("T-shirt");
        c1.setProductId(2);
        c1.setPrice(19.99);
        c1.setSize("Medium");
        c1.setFabric("Fabric");
        BookProduct b1 = new BookProduct();
        b1.setName("OOP");
        b1.setProductId(3);
        b1.setPrice(39.99);
        b1.setAuthor("O'Reilly");
        b1.setPublisher("X Publications");
        Customer c2 = new Customer();

        int id =Integer.parseInt(JOptionPane.showInputDialog("Enter Your ID: "));
        c2.setCustomerId(id);

        String name = JOptionPane.showInputDialog("Enter your Name:");
        c2.setName(name);

        String address = JOptionPane.showInputDialog("Enter your Address:");
        c2.setAddress(address);
        Cart cart1 = new Cart();

        int nproducts = Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to your cart?"));
        cart1.setNProducts(nproducts);
        int x;
        for(int i =0;i<nproducts;i++){

            switch(x =Integer.parseInt(JOptionPane.showInputDialog("Which Product would you like to add ? 1- Smartphone 2- T-shirt 3- OOP"))){
                case 1:
                    cart1.AddProduct(e1,i);
                    break;
                case 2:

                    cart1.AddProduct(c1,i);
                    break;
                case 3:
                    cart1.AddProduct(b1,i);
                    break;
                 default:
                JOptionPane.showMessageDialog(null,"Invalid");
                    break;

            }

        }


        Order o1 = new Order(c2.getCustomerId(),1,cart1.CalculatePrice());
        o1.setProducts(cart1.getProducts());


        int accept = Integer.parseInt(JOptionPane.showInputDialog("Your order total is"+cart1.CalculatePrice()+"Would You like to place order ?  1-Yes    2- No"));
        switch (accept){
            case 1:
            o1.OrderInfo();
            break;
            case 2:
                JOptionPane.showMessageDialog(null,"Thank you!!");
                break;
        }



    }


        }






