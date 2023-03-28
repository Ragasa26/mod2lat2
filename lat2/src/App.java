import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        // Buat objek Hewan dan DeleteHewan
        ArrayList<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Hewan("Sapi"));
        hewanList.add(new Hewan("Kelinci"));
        hewanList.add(new Hewan("Kambing"));
        hewanList.add(new Hewan("Unta"));
        hewanList.add(new Hewan("Domba"));

        ArrayList<DeleteHewan> deleteHewanList = new ArrayList<>();
        deleteHewanList.add(new DeleteHewan("Kelinci"));
        deleteHewanList.add(new DeleteHewan("Kambing"));
        deleteHewanList.add(new DeleteHewan("Unta"));

        // Cek data sebelum dihapus
        System.out.println("Data sebelum dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }

        // Lakukan penghapusan data
        for (DeleteHewan deleteHewan : deleteHewanList) {
            String jenis = deleteHewan.getJenis();
            hewanList.removeIf(hewan -> hewan.getJenis().equals(jenis));
        }

        // Cek data setelah dihapus
        System.out.println("\nData setelah dihapus:");
        for (Hewan hewan : hewanList) {
            System.out.println(hewan.toString());
        }
    }
}

class Hewan {
    private String jenis;

    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }


    @Override
    public String toString() {
        return "Hewan{" +
                "jenis='" + jenis + '\'' +
                '}';
    }
}

class DeleteHewan {
    private String jenis;

    public DeleteHewan(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }
}