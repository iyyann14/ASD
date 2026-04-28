public class StackTugasMahasiswa09 {
    MahasiswaStack09[] stack;
    int top;
    int size;

    public StackTugasMahasiswa09(int size) {
        this.size = size;
        stack = new MahasiswaStack09[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(MahasiswaStack09 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak Bisa Menambahkan Tugas Lagi.");
        }
    }

    public MahasiswaStack09 pop() {
        if (!isEmpty()) {
            MahasiswaStack09 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas Untuk Dinilai");
            return null;
        }
    }

    public MahasiswaStack09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas yang Dikumpulkan.");
            return null;
        }
    }

    public MahasiswaStack09 lihatTerbawah() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas yang Dikumpulkan.");
            return null;
        }
    }

    public int hitungTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}