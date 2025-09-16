# PostTest-2-PBO-Dilla
Nama  : Dilla Maharani

NIM   : 2409116023

# Sistem Manajemen Teman Kontak ☎︎₊˚✧ ﾟ.
Program ini adalah aplikasi sederhana untuk mengelola kontak, dibuat dengan Java dan dijalankan lewat console. Di dalamnya ada menu interaktif yang memudahkan pengguna untuk melakukan hal-hal dasar seperti menambah, melihat, mengedit, atau menghapus kontak. Semua data kontak disimpan dalam bentuk daftar (ArrayList), dan tiap kontak berisi nama serta nomor telepon.

Pengguna dapat dengan mudah menambahkan kontak baru, meninjau daftar kontak yang tersedia, memperbarui informasi pada kontak tertentu, atau menghapus kontak yang sudah tidak diperlukan. Program ini dilengkapi dengan fitur validasi input untuk meningkatkan keamanan dan mencegah kesalahan. Setiap tindakan yang dilakukan akan disertai dengan pesan konfirmasi, sehingga pengguna dapat memahami hasil dari setiap proses dengan jelas.

# Penjelasan Struktur Package pada Program
<img width="329" height="186" alt="image" src="https://github.com/user-attachments/assets/13039a1b-33de-40ae-a67f-2f0b38ec92de" />

1. PostTest1PBO.java

Class ini merupakan program utama yang dijalankan. Tugasnya adalah menampilkan menu kepada pengguna, menerima input, serta mengarahkan perintah ke class KontakService. Dengan kata lain, class ini menjadi antarmuka antara pengguna dengan sistem.

2. KontakService.java

Class ini berisi logika utama program berupa operasi CRUD (Create, Read, Update, Delete). Semua perintah dari PostTest1PBO diproses di sini, misalnya menambah kontak baru, menampilkan daftar kontak, mengedit kontak berdasarkan ID, dan menghapus kontak. Class ini juga mengelola penyimpanan data kontak menggunakan ArrayList.

3. Kontak.java

Class ini merupakan model atau representasi data kontak. Atribut yang dimiliki antara lain id, nama, dan nomorHp. Class ini juga memiliki constructor untuk memudahkan pembuatan objek kontak baru. Dengan adanya class ini, setiap data kontak tersimpan dalam bentuk objek yang terstruktur.

# Penjelasan Alur Program
## A. Menu Utama
<img width="428" height="311" alt="image" src="https://github.com/user-attachments/assets/5d9c06d4-669b-45fe-b052-ba3c8d59eec9" />


Bagian ini merupakan menu utama dari program. Di dalamnya terdapat beberapa pilihan fitur yaitu:

1.	Tambah Kontak: untuk menambahkan data kontak baru.
2.	List Kontak: untuk menampilkan semua kontak yang sudah tersimpan.
3.	Edit Kontak: untuk mengubah data kontak yang ada.
4.	Hapus Kontak: untuk menghapus kontak dari daftar.
5.	Keluar: untuk menutup program.

Di bagian bawah, pengguna diminta untuk memasukkan nomor pilihan (antara 1-5) sesuai fitur yang ingin dijalankan.

**Tambahan:**
Jika pengguna memasukkan inputan yang tidak sesuai dengan opsi yang ada, maka akan muncul pesan error seperti pada gambar di bawah.

<img width="425" height="75" alt="image" src="https://github.com/user-attachments/assets/7847095a-a868-4cbe-871c-c3948e9c9030" />

<img width="424" height="77" alt="image" src="https://github.com/user-attachments/assets/c0d854ee-6d67-4f1d-85c7-85db1f3cb873" />

<img width="424" height="71" alt="image" src="https://github.com/user-attachments/assets/a8e5a228-c6e6-4716-ad06-2f87c137f772" />

## B. Menu Tambah Kontak
<img width="431" height="257" alt="image" src="https://github.com/user-attachments/assets/2fdb0ef1-65e6-4dcd-ba8c-e2e9b1555ee5" />

Bagian ini menunjukkan proses ketika pengguna memilih menu 'Tambah Kontak'. Program akan menampilkan form input untuk mengisi nama dan nomor HP yang ingin ditambahkan. Setelah data dimasukkan, program memberikan pesan konfirmasi bahwa kontak baru dengan nama yang telah diinput sudah berhasil ditambahkan ke dalam daftar.

**Tambahan:**
Jika pengguna mengosongkan nama atau mengisi nomor HP dengan selain angka, maka akan muncul pesan error seperti pada gambar di bawah.

<img width="429" height="274" alt="image" src="https://github.com/user-attachments/assets/c6661736-e7b3-4f83-993c-e523400e9da5" />

## C. Menu List Kontak
<img width="430" height="265" alt="image" src="https://github.com/user-attachments/assets/c7e2ba89-d45b-424e-9227-cbbd7b0b262c" />

Bagian ini menampilkan hasil ketika pengguna memilih menu 'List Kontak'. Program akan menampilkan seluruh data kontak yang sudah tersimpan di dalam daftar. Setiap kontak ditampilkan secara berurutan dengan nomor urut, nama, serta nomor HP yang dipisahkan oleh tanda garis vertikal (|). Dengan tampilan ini, pengguna dapat melihat seluruh kontak yang ada dengan mudah dan terstruktur.

**Tambahan:**
Jika list nomor belum ada yang terdaftar, maka akan muncul pesan seperti pada gambar di bawah.

<img width="423" height="173" alt="image" src="https://github.com/user-attachments/assets/9ec623e3-eb35-4fed-bfab-f43958764fbd" />

## D. Menu Edit Kontak
<img width="430" height="331" alt="image" src="https://github.com/user-attachments/assets/46358f41-7fce-4928-a544-57a05daa6bdc" />

Bagian ini menampilkan proses ketika pengguna memilih menu 'Edit Kontak'. Program meminta nomor urut kontak yang ingin diubah, kemudian menampilkan data kontak lama. Setelah itu, pengguna menginput nama baru dan nomor baru untuk menggantikan data sebelumnya. Program kemudian memperbarui data kontak sesuai input dan memberikan konfirmasi bahwa kontak berhasil diperbarui.

**Tambahan:**
Jika pengguna memasukkan selain angka pada saat memilih id, maka akan muncul pesan error seperti pada gambar di bawah.

<img width="425" height="160" alt="image" src="https://github.com/user-attachments/assets/75861ad2-91ad-4343-9646-3a95cd6fd707" />

## E. Menu Hapus Kontak
<img width="447" height="238" alt="image" src="https://github.com/user-attachments/assets/e4cf48d9-4fa6-4de1-9e16-6aff16f982c1" />

Bagian ini menampilkan proses ketika pengguna memilih menu 'Hapus Kontak'. Program meminta nomor urut kontak yang ingin dihapus, lalu menampilkan data kontak yang sesuai. Setelah mengonfirmasi, program menghapus kontak tersebut dari daftar dan memberikan pesan bahwa data kontak telah berhasil dihapus.

**Tambahan:**
Jika pengguna memasukkan ID yang tidak ada pada list kontak atau memasukkan input selain angka, maka akan muncul pesan error seperti pada gambar di bawah.

<img width="423" height="169" alt="image" src="https://github.com/user-attachments/assets/fcdad25b-b844-4856-960e-ad71f5ea6a69" />

<img width="431" height="170" alt="image" src="https://github.com/user-attachments/assets/217ae933-ef5d-4c8d-b6a4-8713dc7e86cf" />

## F. Menu Keluar
<img width="428" height="113" alt="image" src="https://github.com/user-attachments/assets/64a234ad-1394-4bbe-b905-e10ad0d84d1e" />

Bagian ini merupakan tampilan ketika pengguna memilih menu Keluar dengan memasukkan angka 5. Program kemudian menutup proses utama dan menampilkan pesan penutup "Program selesai. Terima kasih!" sebagai tanda bahwa aplikasi sudah berhenti dijalankan.







