import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem>items=new ArrayList<>();
    Product product;

    public void addProduct(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("🔄 " + product.getName() + " üçün say yeniləndi: " + item.getQuantity());
                return;
            }
        }
        items.add(new CartItem(19.99, quantity));
        System.out.println("✅ " + product.getName() + " səbətə əlavə olundu (" + quantity + " ədəd).");
    }

    // Məhsulu səbətdən sil
    public void removeProduct(int productId) {
        for (CartItem item : items) {
            if (item.getProduct() == productId) {
                items.remove(item);
                System.out.println("🗑️ Məhsul səbətdən silindi: " + item.getProduct());
                return;
            }
        }
        System.out.println("⚠️ Belə məhsul səbətdə yoxdur.");
    }


    public void showCart (){
    if (items.isEmpty()) {
            System.out.println("🛒 Səbət boşdur!");
            return;
        }
        System.out.println("\n=== SƏBƏTİNİZ ===");
        for (CartItem item : items) {
            System.out.println(item);
        }
//        System.out.printf("💰 Ümumi məbləğ: %.2f AZN\n", getTotal());
        System.out.println("Umumi mebleg " + product.getTotal() );

    }


    public void updateQuantity(int productId, int newQuantity) {
        for (CartItem item : items) {
            if (item.getProduct() == productId) {
                item.setQuantity(newQuantity);
                System.out.println("✏️ " + item.getProduct() + " üçün yeni say: " + newQuantity);
                return;
            }
        }
        System.out.println("⚠️ Belə məhsul səbətdə yoxdur.");
    }

    public void checkout (){
    if (items.isEmpty()) {
            System.out.println("⚠️ Səbət boşdur! Sifariş edilə bilməz.");
            return;
        }
        System.out.println("\n🧾 Sifariş təsdiqləndi!");
        showCart();
        System.out.println("✅ Sifariş uğurla tamamlandı. Təşəkkür edirik!");
        items.clear();
    }


 // o zaman bele edek . Men bunu goturecem yazam . Siz bunu push edin , men ize codeShare ile gonderecem
    //daha sonra hemen kodlari yapishdirarsiniz .
    // Onda bunu push edin git-e
    //indi? beli men axsham yazacam size gonderem , ordan yeniden bura elave edersiniz yazarsinz,oldu narahat olmayin hell edeceyik
    //cox sagolunn buyurun
}
