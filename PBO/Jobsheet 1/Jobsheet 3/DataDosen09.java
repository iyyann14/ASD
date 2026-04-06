public class DataDosen09 {
    public void dataSemuaDosen(DosenN09[] arrayOfDosen) {
        for (DosenN09 d : arrayOfDosen) {
            d.tampilInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(DosenN09[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (DosenN09 d: arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(DosenN09[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (DosenN09 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata - Rata Usia Dosen Pria     : " + (totalPria / jumlahPria));
            System.out.println("Rata - Rata Usia Dosen Wanita   : " + (totalWanita / jumlahWanita));

            System.out.println("------------------------------------");
        } 
    }

    public void infoDosenPalingTua(DosenN09[] arrayOfDOsen) {
        DosenN09 tertua = arrayOfDOsen[0];

        for (DosenN09 d : arrayOfDOsen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua : ");
        tertua.tampilInfo();
    }

    public void infoDosenPalingMuda(DosenN09[] arrayOfDosen) {
        DosenN09 termuda = arrayOfDosen[0];

        for (DosenN09 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda : ");
        termuda.tampilInfo();
    }
}
