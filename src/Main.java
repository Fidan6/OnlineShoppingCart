import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        ShoppingCart cart = new ShoppingCart();


        products.add(new Product(2, "Laptop", 4567));
        products.add(new Product(2, "Mouse", 150));
        products.add(new Product(3, "Klaviatura", 350));
        products.add(new Product(4, "Qulaqlıq", 400));
        products.add(new Product(5, "Telefon", 10000));


        int choice;

        System.out.println("🛍️ Onlayn Alış-veriş Səbətinə Xoş Gəldiniz! 🛍️");

        do {
            System.out.println("\n===== MENYU =====");
            System.out.println("1️⃣  Məhsulları göstər");
            System.out.println("2️⃣  Məhsulu səbətə əlavə et");
            System.out.println("3️⃣  Məhsul sayını dəyiş");
            System.out.println("4️⃣  Məhsulu səbətdən sil");
            System.out.println("5️⃣  Səbəti göstər");
            System.out.println("6️⃣  Sifarişi təsdiqlə");
            System.out.println("0️⃣  Çıxış");
            System.out.print("Seçiminizi daxil edin: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("\n=== MƏHSULLAR ===");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Məhsul ID-sini daxil edin: ");
                    int id = sc.nextInt();
                    Product selected = findProductById(products, id);
                    if (selected != null) {
                        System.out.print("Miqdarı daxil edin: ");
                        int qty = sc.nextInt();
                        cart.addProduct(selected, qty);
                    } else {
                        System.out.println("❌ Belə məhsul tapılmadı!");
                    }
                    break;

                case 3:
                    System.out.print("Məhsul ID-sini daxil edin: ");
                    int uid = sc.nextInt();
                    System.out.print("Yeni miqdarı daxil edin: ");
                    int newQty = sc.nextInt();
                    cart.updateQuantity(uid, newQty);
                    break;

                case 4:
                    System.out.print("Silmək istədiyiniz məhsulun ID-sini daxil edin: ");
                    int delId = sc.nextInt();
                    cart.removeProduct(delId);
                    break;

                case 5:
                    cart.showCart();
                    break;

                case 6:
                    cart.checkout();
                    break;

                case 0:
                    System.out.println("👋 Çıxış edilir...");
                    break;

                default:
                    System.out.println("⚠️ Yanlış seçim!");
            }

        } while (choice != 0);

        sc.close();


    }

    public static Product findProductById(ArrayList<Product> products, int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;


    }
}