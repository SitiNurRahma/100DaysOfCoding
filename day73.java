
package ISC;

import java.util.HashMap;

public class day73 {
    public static void main(String[] args) {
        HashMap<String, String> biodata = new HashMap<>();
        biodata.put("nama", "Rahma");
        biodata.put("kelas", "D");
        biodata.put("nim", "D0221051");

        System.out.println("Nama: " + biodata.get("nama"));
        System.out.println("Kelas: " + biodata.get("kelas"));
        System.out.println("Nim: " + biodata.get("nim"));
    }
}
