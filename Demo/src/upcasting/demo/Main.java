package upcasting.demo;

public class Main {
    public static void main(String[] args) {
        ConChau conChauLayHet = new ConChau();   // Kiểu dữ liệu ... tạo biến tham chiếu của ... tham chiếu tới đối tượng của ...
        conChauLayHet.ptOngCha();
        conChauLayHet.ptChaCon();
        conChauLayHet.ptConChau();
        System.out.println("------------------------------------------------------");

        ChaCon chaConLayCuaConChau = new ConChau();
        chaConLayCuaConChau.ptOngCha();
        chaConLayCuaConChau.ptChaCon();
        System.out.println("------------sau khi có sự đồng ý của con cháu-----------");
        ConChau conChauDongYchoChaCon = (ConChau) chaConLayCuaConChau;
        conChauDongYchoChaCon.ptConChau();
        System.out.println("------------------------------------------------------");

        OngCha ongChaLayCuaConChau = new ConChau();
        ongChaLayCuaConChau.ptOngCha();
        System.out.println("------------sau khi có sự đồng ý của con cháu-----------");
        ((ConChau) ongChaLayCuaConChau).ptChaCon();
        ((ConChau) ongChaLayCuaConChau).ptConChau();

    }
}
