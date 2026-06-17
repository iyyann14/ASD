# Panduan Belajar UTS: Modifikasi Coding Case Method

Dokumen ini berisi rangkuman modifikasi yang mungkin keluar pada UTS berdasarkan kode `CaseMethod 1`.

## 1. Modifikasi Algoritma Sorting
Di kode asli menggunakan **Insertion Sort**. Kamu harus siap jika diminta mengubahnya menjadi **Selection Sort** atau **Bubble Sort**.

### Perbandingan Logic (Descending berdasarkan Denda)

**Insertion Sort (Asli):**
```java
for (int i = 1; i < pinjam.length; i++) {
    Peminjaman temp = pinjam[i];
    int j = i - 1;
    while (j >= 0 && pinjam[j].denda < temp.denda) {
        pinjam[j + 1] = pinjam[j];
        j--;
    }
    pinjam[j + 1] = temp;
}
```

**Selection Sort (Modifikasi):**
```java
for (int i = 0; i < pinjam.length - 1; i++) {
    int idxMax = i;
    for (int j = i + 1; j < pinjam.length; j++) {
        if (pinjam[j].denda > pinjam[idxMax].denda) {
            idxMax = j;
        }
    }
    Peminjaman temp = pinjam[idxMax];
    pinjam[idxMax] = pinjam[i];
    pinjam[i] = temp;
}
```

## 2. Modifikasi Algoritma Search
Di kode asli menggunakan **Binary Search** berdasarkan NIM (Angka). Modifikasi yang mungkin:
1. Mengubah menjadi **Linear Search** (Sequential Search).
2. Mencari berdasarkan **String** (misal: Nama) yang tidak terurut.

### Linear Search berdasarkan Nama (String)
```java
System.out.print("Masukkan Nama: ");
String cari = sc.nextLine();
boolean found = false;

for (int i = 0; i < pinjam.length; i++) {
    if (pinjam[i].mhs.nama.equalsIgnoreCase(cari)) {
        pinjam[i].tampil();
        found = true;
    }
}
if (!found) System.out.println("Data tidak ditemukan");
```

## 3. Modifikasi Logika Bisnis (Denda)
Logika `hitungDenda()` seringkali dimodifikasi menjadi lebih kompleks (bertingkat/progresif).

**Denda Bertingkat (Contoh):**
- Terlambat <= 5 hari: Rp 2.000/hari.
- Terlambat > 5 hari: 5 hari pertama Rp 2.000, sisanya Rp 5.000/hari.

```java
void hitungDenda() {
    int batas = 5;
    if (lamaPinjam > batas) {
        int telat = lamaPinjam - batas;
        if (telat <= 5) {
            denda = telat * 2000;
        } else {
            denda = (5 * 2000) + ((telat - 5) * 5000);
        }
    } else {
        denda = 0;
    }
}
```

## 4. Tips Penting UTS
1. **Buffer Scanner**: Jika menggunakan `sc.nextInt()` lalu `sc.nextLine()`, jangan lupa panggil `sc.nextLine()` ekstra untuk membersihkan sisa enter di buffer.
   ```java
   int pilih = sc.nextInt();
   sc.nextLine(); // Membersihkan buffer
   String nama = sc.nextLine();
   ```
2. **Equality String**: Gunakan `.equals()` atau `.equalsIgnoreCase()` untuk membandingkan String, **JANGAN** gunakan `==`.
3. **Array Object**: Ingat bahwa `pinjam[i]` adalah sebuah objek, akses atributnya dengan titik, misal `pinjam[i].mhs.nama`.
4. **Ascending vs Descending**:
   - Ascending (Kecil ke Besar): `if (data[j] > data[idxMin])` -> `idxMin = j`
   - Descending (Besar ke Kecil): `if (data[j] > data[idxMax])` -> `idxMax = j`

Semangat UTS-nya!
