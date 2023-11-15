public class SanPham {
//    Làm ứng dụng quản lý Sản phẩm: id, name, price, quantity. Có lớp QLSP, có menu
    private int id;
    private String name;
    private String price;
    private int  quatity;

    public SanPham(int id, String name, String price, int quatity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
