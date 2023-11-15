import java.util.ArrayList;
import java.util.List;

public class DanhSachSanPham {
    List<SanPham>list=new ArrayList<>();
    public void add(SanPham sanPham ){
        list.add(sanPham);
    }
    public void inDsSinhVien(){
        for (SanPham sanphams:list
             ) {
            System.out.println(sanphams);

        }
    }
    public void update(int id,SanPham sanPham){
        int index=-1;
        for (int i = 0; i < this.list.size(); i++) {
            if(id==this.list.get(i).getId()){
                index= i;

            }
            this.list.set(index,sanPham);
            
        }


    }
    public void dellete(int id){
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {
            if (i == this.list.get(i).getId()){
                index=i;

                
            }
            this.list.remove(index);
            
        }
    }
    public void findAll(String name){
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).getName().equals(name)){
                System.out.println(this.list.get(i));

            }

        }
    }




}
