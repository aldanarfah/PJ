tugas berada di SRC terdapat 2 folder yaitu, folder javastream dan folder bonus

Perubahan & cara menjalankan
-----------------------------

- Saya telah memperbaiki beberapa hal agar proyek dapat dikompilasi dan berjalan di lingkungan Linux:
	- Mengatur target Java di `pom.xml` ke Java 11 (source/target = 11).
	- Mengganti path absolut (`/Users/aldanarfah/...`) menjadi path relatif di folder `data/` pada root proyek.
	- Menggunakan try-with-resources dan `BufferedReader`/`BufferedWriter` untuk membaca/menulis file.
	- Menambahkan pesan error dan stack trace pada catch agar lebih mudah debug.

- Lokasi file yang digunakan oleh program sekarang:
	- `./data/tugas.txt` — untuk `Bonus.ListTugas` dan `Bonus.InputListTugas`
	- `./data/praktik1.txt` — untuk `javastream.JavaStream` dan `javastream.NewInputStream`

- Build dan run:
	- Build: `mvn -DskipTests package`
	- Jalankan salah satu main class (dari folder proyek):
		- `java -cp target/JavaStream-1.0-SNAPSHOT.jar javastream.JavaStream`
		- `java -cp target/JavaStream-1.0-SNAPSHOT.jar javastream.NewInputStream`
		- `java -cp target/JavaStream-1.0-SNAPSHOT.jar Bonus.ListTugas`
		- `java -cp target/JavaStream-1.0-SNAPSHOT.jar Bonus.InputListTugas`

- Catatan:
	- Program akan membuat folder `data/` otomatis jika belum ada.
	- Jika ingin menyimpan file ke lokasi lain, pertimbangkan untuk mengubah kode agar menerima path lewat argumen baris perintah.

Jika mau, saya bisa:
- Mengubah penyimpanan ke `user.home` daripada `user.dir` (simpan di folder Documents pengguna).
- Menambahkan argumen CLI untuk mengatur lokasi file.
- Menambahkan unit test kecil atau contoh input/expected file di `data/`.
