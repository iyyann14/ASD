//Selection Sort Ascending Data Denda
for(int i=0;i<pinjam.length-1;i++){int min=i;for(int j=i+1;j<pinjam.length;j++){if(pinjam[j].denda<pinjam[min].denda){min=j;}}PeminjamanCM09 temp=pinjam[i];pinjam[i]=pinjam[min];pinjam[min]=temp;}

//Cari Data Berdasarkan Nama Mahasiswa Sequential Seacrh
System.out.print("Masukkan nama: ");sc.nextLine(); // buang enter
String cari=sc.nextLine();

boolean ditemukan=false;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nama.equalsIgnoreCase(cari)){p.tampil();ditemukan=true;}}

if(!ditemukan){System.out.println("Data tidak ditemukan!");}

//Total Jumlah Denda
int total=0;

for(PeminjamanCM09 p:pinjam){total+=p.denda;}

System.out.println("Total denda: "+total);

//Tampilkan Hanya yang Memiliki Denda > 0
for(PeminjamanCM09 p:pinjam){if(p.denda>0){p.tampil();}}

//Ubah Menu Switch Case
if(pilih==1){
// isi
}else if(pilih==2){
// isi
}else if(pilih==3){
// isi
}

//Kategori Buku 
String kategori;

BukuCM09(String kodeBuku,String judul,int tahunTerbit,String kategori){this.kodeBuku=kodeBuku;this.judul=judul;this.tahunTerbit=tahunTerbit;this.kategori=kategori;}

//Modifikasi Pehitungan Denda
void hitungDenda(){if(lamaPinjam<=5){denda=0;}else if(lamaPinjam<=10){denda=(lamaPinjam-5)*2000;}else{denda=(5*2000)+((lamaPinjam-10)*5000);}}

//Sequential Search Berdasarkan NIM Tanpa Sorting
System.out.print("Masukkan NIM: ");String cari=sc.next();

boolean ditemukan=false;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(cari)){p.tampil();ditemukan=true;}}

if(!ditemukan){System.out.println("Data tidak ditemukan!");}

//Selection Sort Denda Terbesar ke Terkecil
for(int i=0;i<pinjam.length-1;i++){int max=i;for(int j=i+1;j<pinjam.length;j++){if(pinjam[j].denda>pinjam[max].denda){max=j;}}PeminjamanCM09 temp=pinjam[i];pinjam[i]=pinjam[max];pinjam[max]=temp;}

//Urutkan berdasarkan Lama Pinjam (Insertion Sort - Ascending)
case 6:for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].lamaPinjam>temp.lamaPinjam){pinjam[j+1]=pinjam[j];j--;}pinjam[j+1]=temp;}

System.out.println("Sorting Lama Pinjam (Ascending):");for(PeminjamanCM09 p:pinjam)p.tampil();break;

//Cari berdasarkan Judul Buku (Sequential Search)
case 7:sc.nextLine();System.out.print("Masukkan judul buku: ");String cariJudul=sc.nextLine();

boolean ketemu=false;

for(PeminjamanCM09 p:pinjam){if(p.buku.judul.equalsIgnoreCase(cariJudul)){p.tampil();ketemu=true;}}

if(!ketemu){System.out.println("Buku tidak ditemukan!");}break;

//Tampilkan buku dengan lama pinjam TERLAMA
case 8:PeminjamanCM09 max=pinjam[0];

for(int i=1;i<pinjam.length;i++){if(pinjam[i].lamaPinjam>max.lamaPinjam){max=pinjam[i];}}

System.out.println("Peminjaman Terlama:");max.tampil();break;

//Hitung rata-rata lama pinjam
case 9:int totalHari=0;

for(PeminjamanCM09 p:pinjam){totalHari+=p.lamaPinjam;}

double rata=(double)totalHari/pinjam.length;

System.out.println("Rata-rata lama pinjam: "+rata);break;

//Sorting Denda Ascending (Insertion Sort)
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].denda>temp.denda){pinjam[j+1]=pinjam[j];j--;}pinjam[j+1]=temp;}

//Tampilkan hanya buku tahun > 2020
for(PeminjamanCM09 p:pinjam){if(p.buku.tahunTerbit>2020){p.tampil();}}

//Menampilkan mahasiswa yang paling sering meminjam buku
for(int i=0;i<mhs.length;i++){int banyak=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(mhs[i].nim)){banyak++;}}

System.out.println(mhs[i].nama+" = "+banyak+" kali");}

//Sorting berdasarkan NAMA mahasiswa (Ascending - Insertion Sort)
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].mhs.nama.charAt(0)>temp.mhs.nama.charAt(0)){

pinjam[j+1]=pinjam[j];j--;}

pinjam[j+1]=temp;}

//Cari semua peminjaman dalam rentang hari (misal: 3 – 7 hari)
System.out.print("Masukkan batas bawah: ");int min=sc.nextInt();

System.out.print("Masukkan batas atas: ");int max=sc.nextInt();

for(PeminjamanCM09 p:pinjam){if(p.lamaPinjam>=min&&p.lamaPinjam<=max){p.tampil();}}

//Tampilkan: Mahasiswa - Total jumlah buku yang dipinjam -Total denda
//Andi - Total Buku: 2 - Total Denda: 8000
for(int i=0;i<mhs.length;i++){int totalBuku=0;int totalDenda=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(mhs[i].nim)){totalBuku++;totalDenda+=p.denda;}}

System.out.println(mhs[i].nama+" - Total Buku: "+totalBuku+" - Total Denda: "+totalDenda);}

//SORTING BERDASARKAN LAMA PINJAM (DESCENDING - INSERTION)
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].lamaPinjam<temp.lamaPinjam){pinjam[j+1]=pinjam[j];j--;}pinjam[j+1]=temp;}

//SORTING BERDASARKAN NIM (ASCENDING - SELECTION)
for(int i=0;i<pinjam.length-1;i++){int min=i;

for(int j=i+1;j<pinjam.length;j++){if(pinjam[j].mhs.nim.compareTo(pinjam[min].mhs.nim)<0){min=j;}}

PeminjamanCM09 temp=pinjam[i];pinjam[i]=pinjam[min];pinjam[min]=temp;}

//SEARCHING NIM (SEQUENTIAL TANPA SORTING)
System.out.print("Masukkan NIM: ");String cari=sc.next();

boolean ketemu=false;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(cari)){p.tampil();ketemu=true;}}

if(!ketemu){System.out.println("Tidak ditemukan");}

//SEARCHING JUDUL (BINARY SEARCH + SORTING DULU)
// SORTING JUDUL
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].buku.judul.compareTo(temp.buku.judul)>0){pinjam[j+1]=pinjam[j];j--;}pinjam[j+1]=temp;}

// INPUT
sc.nextLine();System.out.print("Cari judul: ");String cari=sc.nextLine();

int left=0,right=pinjam.length-1;boolean ditemukan=false;

while(left<=right){int mid=(left+right)/2;

int hasil=pinjam[mid].buku.judul.compareToIgnoreCase(cari);

if(hasil==0){pinjam[mid].tampil();ditemukan=true;break;}else if(hasil<0){left=mid+1;}else{right=mid-1;}}

//MENAMPILKAN TOTAL DENDA PER MAHASISWA
for(MahasiswaCM09 m:mhs){int total=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(m.nim)){total+=p.denda;}}

System.out.println(m.nama+" = "+total);}

//MENAMPILKAN MAHASISWA TANPA DENDA
for(MahasiswaCM09 m:mhs){int total=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(m.nim)){total+=p.denda;}}

if(total==0){System.out.println(m.nama);}}

//MENAMPILKAN BUKU YANG PALING SERING DIPINJAM
for(int i=0;i<buku.length;i++){int count=0;

for(PeminjamanCM09 p:pinjam){if(p.buku.kodeBuku.equals(buku[i].kodeBuku)){count++;}}

System.out.println(buku[i].judul+" = "+count);}

//MENAMPILKAN PEMINJAMAN TERCEPAT (PALING SEDIKIT HARI)
PeminjamanCM09 min=pinjam[0];

for(int i=1;i<pinjam.length;i++){if(pinjam[i].lamaPinjam<min.lamaPinjam){min=pinjam[i];}}

min.tampil();

//MENAMPILKAN DATA TANPA METHOD tampil()
for(PeminjamanCM09 p:pinjam){System.out.println(p.mhs.nim+" | "+p.mhs.nama+" | "+p.buku.judul+" | "+p.lamaPinjam+" | "+p.denda);}

//MENCARI RENTANG DENDA
int min=2000;int max=8000;

for(PeminjamanCM09 p:pinjam){if(p.denda>=min&&p.denda<=max){p.tampil();}}

//SORTING 2 KRITERIA (Denda → LamaPinjam)
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&(pinjam[j].denda<temp.denda||(pinjam[j].denda==temp.denda&&pinjam[j].lamaPinjam<temp.lamaPinjam))){

pinjam[j+1]=pinjam[j];j--;}

pinjam[j+1]=temp;}

//BUKU YANG TIDAK PERNAH DIPINJAM
for(BukuCM09 b:buku){boolean dipinjam=false;

for(PeminjamanCM09 p:pinjam){if(p.buku.kodeBuku.equals(b.kodeBuku)){dipinjam=true;break;}}

if(!dipinjam){b.tampilkanInformasi();}}

//MAHASISWA YANG MEMINJAM > 1 BUKU
for(MahasiswaCM09 m:mhs){int count=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(m.nim)){count++;}}

if(count>1){System.out.println(m.nama);}}

//UPDATE DATA (EDIT DATA)
System.out.print("Masukkan NIM: ");String cari=sc.next();

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(cari)){System.out.print("Lama pinjam baru: ");p.lamaPinjam=sc.nextInt();p.hitungDenda(); // penting!
}}

//HITUNG JUMLAH BUKU PER PRODI
for(MahasiswaCM09 m:mhs){int count=0;

for(PeminjamanCM09 p:pinjam){if(p.mhs.prodi.equals(m.prodi)){count++;}}

System.out.println(m.prodi+" = "+count);}

//MENAMPILKAN DATA TERBALIK (REVERSE ARRAY)
for(int i=pinjam.length-1;i>=0;i--){pinjam[i].tampil();}

//CEK DATA DUPLIKAT
for(int i=0;i<pinjam.length;i++){for(int j=i+1;j<pinjam.length;j++){if(pinjam[i].mhs.nim.equals(pinjam[j].mhs.nim)&&pinjam[i].buku.kodeBuku.equals(pinjam[j].buku.kodeBuku)){

System.out.println("Duplikat ditemukan:");pinjam[i].tampil();}}}

//SORTING STRING TANPA compareTo
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;

while(j>=0&&pinjam[j].mhs.nama.charAt(0)>temp.mhs.nama.charAt(0)){

pinjam[j+1]=pinjam[j];j--;}

pinjam[j+1]=temp;}

//MENAMPILKAN TOP 3 DENDA TERTINGGI
for(int i=0;i<3;i++){pinjam[i].tampil();}

//Tampilkan: lama pinjam > 5 DAN denda > 0 DAN tahun buku > 2020
for(PeminjamanCM09 p:pinjam){if(p.lamaPinjam>5&&p.denda>0&&p.buku.tahunTerbit>2020){

p.tampil();}}

//MENENTUKAN DATA TERBESAR TANPA SORTING
int max=0;

for(PeminjamanCM09 p:pinjam){if(p.denda>max){max=p.denda;}}

System.out.println("Denda terbesar: "+max);

//MENAMPILKAN DATA BERDASARKAN INDEX GENAP
for(int i=0;i<pinjam.length;i+=2){pinjam[i].tampil();}

//MENUKAR DATA (SWAP TANPA SORTING)
PeminjamanCM09 temp=pinjam[0];pinjam[0]=pinjam[1];pinjam[1]=temp;

//VERSI INPUT MANUAL (SCANNER)
Scanner sc=new Scanner(System.in);

System.out.print("Jumlah Mahasiswa: ");int jmlMhs=sc.nextInt();sc.nextLine();

MahasiswaCM09[]mhs=new MahasiswaCM09[jmlMhs];

for(int i=0;i<jmlMhs;i++){System.out.println("\nData Mahasiswa ke-"+(i+1));

System.out.print("NIM   : ");String nim=sc.nextLine();

System.out.print("Nama  : ");String nama=sc.nextLine();

System.out.print("Prodi : ");String prodi=sc.nextLine();

mhs[i]=new MahasiswaCM09(nim,nama,prodi);}

//INPUT DATA BUKU
System.out.print("\nJumlah Buku: ");int jmlBuku=sc.nextInt();sc.nextLine();

BukuCM09[]buku=new BukuCM09[jmlBuku];

for(int i=0;i<jmlBuku;i++){System.out.println("\nData Buku ke-"+(i+1));

System.out.print("Kode Buku    : ");String kode=sc.nextLine();

System.out.print("Judul Buku   : ");String judul=sc.nextLine();

System.out.print("Tahun Terbit : ");int tahun=sc.nextInt();sc.nextLine();

buku[i]=new BukuCM09(kode,judul,tahun);}

//INPUT DATA PEMINJAMAN
System.out.print("\nJumlah Peminjaman: ");int jmlPinjam=sc.nextInt();

PeminjamanCM09[]pinjam=new PeminjamanCM09[jmlPinjam];

for(int i=0;i<jmlPinjam;i++){System.out.println("\nData Peminjaman ke-"+(i+1));

// PILIH MAHASISWA
System.out.println("Pilih Mahasiswa:");for(int j=0;j<mhs.length;j++){System.out.println(j+". "+mhs[j].nama);}System.out.print("Index: ");int idxMhs=sc.nextInt();

// PILIH BUKU
System.out.println("Pilih Buku:");for(int j=0;j<buku.length;j++){System.out.println(j+". "+buku[j].judul);}System.out.print("Index: ");int idxBuku=sc.nextInt();

// LAMA PINJAM
System.out.print("Lama Pinjam (hari): ");int lama=sc.nextInt();

pinjam[i]=new PeminjamanCM09(mhs[idxMhs],buku[idxBuku],lama);}

//MENAMPILKAN HASIL INPUT
System.out.println("\n=== DATA PEMINJAMAN ===");for(PeminjamanCM09 p:pinjam){p.tampil();}

//Input tanpa pilih index (cari berdasarkan NIM)
System.out.print("Masukkan NIM: ");String cariNim=sc.next();

MahasiswaCM09 ketemu=null;

for(MahasiswaCM09 m:mhs){if(m.nim.equals(cariNim)){ketemu=m;}}

//(TAMPILKAN SEMUA DATA NIM) Sequential Search
case 5:System.out.print("Masukkan NIM yang dicari: ");String cari=sc.next();

boolean ditemukan=false;

System.out.println("\n=== HASIL PENCARIAN ===");

for(PeminjamanCM09 p:pinjam){if(p.mhs.nim.equals(cari)){p.tampil();ditemukan=true;}}

if(!ditemukan){System.out.println("Data tidak ditemukan!");}

break;

//Bubble Sort (Descending Denda) – ganti insertion
// CASE: Sorting denda DESC (terbesar → terkecil)
for(int i=0;i<pinjam.length-1;i++){for(int j=0;j<pinjam.length-i-1;j++){if(pinjam[j].denda<pinjam[j+1].denda){PeminjamanCM09 temp=pinjam[j];pinjam[j]=pinjam[j+1];pinjam[j+1]=temp;}}}System.out.println("\nSorting Denda (DESC):");for(PeminjamanCM09 p:pinjam)p.tampil();

//Selection Sort (Ascending lamaPinjam)
// CASE: Sorting lamaPinjam ASC (kecil → besar)
for(int i=0;i<pinjam.length-1;i++){int min=i;for(int j=i+1;j<pinjam.length;j++){if(pinjam[j].lamaPinjam<pinjam[min].lamaPinjam){min=j;}}PeminjamanCM09 temp=pinjam[i];pinjam[i]=pinjam[min];pinjam[min]=temp;}System.out.println("\nSorting Lama Pinjam (ASC):");for(PeminjamanCM09 p:pinjam)p.tampil();

//Binary Search → tampilkan SEMUA peminjaman 1 NIM
// SORT by NIM (ASC) - insertion
for(int i=1;i<pinjam.length;i++){PeminjamanCM09 temp=pinjam[i];int j=i-1;while(j>=0&&pinjam[j].mhs.nim.compareTo(temp.mhs.nim)>0){pinjam[j+1]=pinjam[j];j--;}pinjam[j+1]=temp;}

// INPUT
System.out.print("Masukkan NIM: ");String cari=sc.next();

// BINARY SEARCH
int left=0,right=pinjam.length-1;boolean ditemukan=false;

while(left<=right){int mid=(left+right)/2;int cmp=pinjam[mid].mhs.nim.compareTo(cari);

if(cmp==0){System.out.println("\n=== HASIL (SEMUA) ===");

// ke kiri
int i=mid;while(i>=0&&pinjam[i].mhs.nim.equals(cari)){pinjam[i].tampil();i--;}

// ke kanan
i=mid+1;while(i<pinjam.length&&pinjam[i].mhs.nim.equals(cari)){pinjam[i].tampil();i++;}

ditemukan=true;break;

}else if(cmp<0){left=mid+1;}else{right=mid-1;}}

if(!ditemukan)System.out.println("Data tidak ditemukan!");

//Cari Buku berdasarkan Judul (Sequential Search)
sc.nextLine();System.out.print("Masukkan judul buku: ");String cariJudul=sc.nextLine();

boolean ketemu=false;

for(PeminjamanCM09 p:pinjam){if(p.buku.judul.equalsIgnoreCase(cariJudul)){p.tampil();ketemu=true;}}if(!ketemu)System.out.println("Buku tidak ditemukan!");

//Tambah Class Petugas + Integrasi
class PetugasCM09 {
    String idPetugas;
    String nama;

    PetugasCM09(String idPetugas, String nama) {
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    void tampil() {
        System.out.println(idPetugas + " | " + nama);
    }}

    PetugasCM09 petugas;

PeminjamanCM09(MahasiswaCM09 mhs, BukuCM09 buku, int lamaPinjam, PetugasCM09 petugas) {
    this.mhs = mhs;
    this.buku = buku;
    this.lamaPinjam = lamaPinjam;
    this.petugas = petugas;
    hitungDenda();
}

System.out.println(mhs.nama+" | "+buku.judul+" | "+lamaPinjam+" | Denda: "+denda+" | Petugas: "+petugas.nama);

// Denda BARU (gabungan aturan + 3 level keterlambatan)
void hitungDenda() {
    if (buku.tahunTerbit < 2020) {
        denda = 0;
        return;
    }

    int telat = lamaPinjam - 5;
    if (telat <= 0) {
        denda = 0;
    } else if (buku.tahunTerbit > 2022) {
        // PROGRESIF
        if (telat <= 5) denda = telat * 2000;
        else if (telat <= 10) denda = (5 * 2000) + ((telat - 5) * 3000);
        else denda = (5 * 2000) + (5 * 3000) + ((telat - 10) * 5000);
    } else {
        // NORMAL
        denda = telat * 2000;
    }
}

//Validasi Input Menu (0–5 saja)
do {
    System.out.print("Pilih menu (0-5): ");
    while (!sc.hasNextInt()) {
        System.out.print("Harus angka! Pilih lagi: ");
        sc.next();
    }

    pilih = sc.nextInt();

    if (pilih < 0 || pilih > 5) {
        System.out.println("Menu tidak valid!");
    }

} while (pilih < 0 || pilih > 5);

//Tambah atribut angkatan
String angkatan;

MahasiswaCM09(String nim, String nama, String prodi, String angkatan) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.angkatan = angkatan;
}

System.out.println(nim + " | " + nama + " | " + prodi + " | " + angkatan);