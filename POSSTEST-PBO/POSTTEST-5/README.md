    #laporan Posttes-1
## deskripsi program
program yang saya buat adalah program CRUD yang memiliki judul "Sistem data list karakter dari game  arknights" penjelasan CRUD pada program ini dapat dilihat di bawah ini
    
## Class Operator
![operator](Asset/1.png)

pada gambar di atas merupakan tampilan dari class operator yang berisikan variabel nama dan role, kemudian ada contrustor yang digunakan untuk mengisi nama dan role saat ditambahkan "Operator(String nama, String role)", kemudian void dataTampil() digunakan untuk menampilkan data saat method dipanggil di class Main, kemudian ada getNama dan getRole yang digunakan untuk mengubah nilai pada saat data di update.

## Import dan Class Main
![import](Asset/2.png)

pada gambar diatas menampilkan import yang dimana import itu digunakan untuk mengimpor semua class yang ada di package java, kemudian ada Arraylist perintah ini digunakan untuk menyimpan 
semua data operator ke dalam array, dan Scanner adalah perintah yang digunakan untuk membaqca input user.

## void main
![void main](Asset/3.png)
![void main](Asset/4.png)

pada gambar di atas merupakan void main atau tempat semua program dijalankan untuk pertama kali, di dalam void main pada gammbar di atas terdapat beberapa hal yaitu ada menu sistem, kemudian terdapat perulangan yang menggunakan do while, dan terdapat switch case yang digunakan untuk mengontrol alur program berdasarkan beberapa kemungkinan nilai.

## Tambah
![tambah](Asset/5.png)

pada gambar diatas merupakan sistem crud untuk tambah yang dimana user diminta untuk memasukkan nama dan role pada operator

## Lihat
![lihat](Asset/6.png)

pada gambar diatas merupakan bagian crud yang digunakan untuk melihat semua data yang sudah disimpan dalam array jika tidak ada data maka output akan kosong

## Update
![update](Asset/7.png)

pada gambar diatas merupakan perintah update yang dimana pertama user diminta untuk memilih nomor operator yang ingin di update kemudian user harus memasukkan nama dan role baru pada operator

## Hapus
![hapus](Asset/8.png)

pada gambar diatas merupakan perintah hapus yang dimana sama seperti update pertama user diminta untuk memilih nomor operator yang ingin dihapus kemudian sistem akan menghapus operator tersebut.

## Pause
![pause](Asset/9.png)

pada gambar diatas merupakan penerapan kode untuk memberi pause pada program dan meminta user untuk tekan enter.



## POSTTEST 2
## ENCAPSULATION
## Penerapan Access Modifier
![access](Asset/1-2)

pada gambar di atas merupakan penerapan Access Modifier pada program crud java yang dimana terdapat 3 access modifier yaitu public, private, dan protected. penerapan public dilakukan pada method operator, private diterapkan pada variabel nama, dan protected diterapkan pada variabel role.

## Getter dan Setter
![gettersetter](Asset/2-2)

pada gambar di atas merupakan penerapan setter getter pada program ini, yang dimana ini dilakukan karena variabel nama dan role telah diproteksi menggunakan access modifier private dan protected, maka kelas lain tidak dapat mengaksesnya secara langsung, jadi kegunaan setter dan getter pada program ini adalah
setter: digunakan untuk memberikan atau memperbarui nilai atribut dalam tugas ini Setter dipanggil pada fungsi Create (Tambah Data) dan Update (Ubah Data).

getter: digunakan untuk membaca atau mengambil nilai dari atribut dalam tugas ini Getter dipanggil pada fungsi Read (Lihat Data) untuk menampilkan daftar operator

## Penerapan setter pada update
![updatesetter](Asset/3-2)

pada gambar diatas merupakan penerapan pemanggilan setter pada update yang ditandai dengan setNama dan setRole.

## Output
![output](Asset/10.png)
![output](Asset/11.png)
![output](Asset/12.png)
![output](Asset/13.png)
![output](Asset/14.png)
![output](Asset/15.png)


## POSTTEST 3
## INHERITANCE
## Penerapan Inheritance
Dalam posttest kali ini penerapan inheritance diterapkan dalam 2 Subclass yaitu Guard dan Vanguard, serta Operator sebagai Superclass

## Inheritance Pada Class Guard
![Guard](Asset/16.png)
Dapat dilihat pada gambar di atas bahwa class Guard melakukan extends ke class operator, dan class guard ini memiliki atribut nama dan rarity yang sama seperti class operator namun hanya class guard yang memiliki atribut tipeGuard dan tipeSerang.

## Inheritance Pada Class Vanguard
![Vanguard](Asset/17.png)
Dapat dilihat pada gambar di atas bahwa class Vanguard juga melakukan extends ke class operator, dan class Vanguard ini juga memiliki atribut nama dan rarity yang sama seperti class operator namun hanya class Vanguard yang memiliki atribut tipevanguard dan tipeSerang.

## Tipe Inheritance Yang Digunakan
Pada pengerjaan posttest kali ini saya menggunakan tipe single inheritance yang dapat dilihat pada class Guard dan Vanguard yang mewarisi atribut nama dan rarity pada class Operator.

## Perubahan Pada Fungsi Tambah
![tambah](Asset/18.png)
![tambah](Asset/18-1.png)
Jika dilihat pada gambar di atas terdapat penambahan pada fungsi tambah yaitu terdapat percabangan if else yang digunakan untuk melakukan pemilihan tipe operator yaitu Guard atau Vanguard.

## Perubahan Pada Fungsi Update
![update](Asset/19.png)
![update](Asset/19-1.png)
Jika dilihat pada gambar diatas terdapata perubahan pada fungsi update yang dimana terdapat percabangan if else yang ditambah dengan intanceof yang digunakan untuk mendeteksi objek secara spesifik, jika dilihat pada gambar sistem akan melakukan pengecekan apakah pilihan yang dipilih merupakan bagian dari Guard atau Vanguard, jika iya maka program dapat mengakses atribut yang ada di dalam class tersebut untuk di update datanya. 

## POSTTEST-4
## Polymorphism
## Overloading
![overloading](Asset/22.png)
jika dilihat pada gambar diatas merupakan penerapan overloading pada class defender, yang dimana memiliki 2 parameter yang berbeda yaitu 1. menghitung def total dan 2. menghitung total def dengan nmenggunakan persentase

## overiding
![overriding](Asset/21.png)
jika dilihat pada gambar diooatas merupakan penerapan overriding yang dimana kita mengakses data tampil pada class operator ke semua sub class dalam konteks ini adalah guard,vangurad,dan defender mengakses data tampil dari class utama operator

## POSSTEST-5
## Abstract dan Interface
## Abstract
![Abstract](Asset/27.png)
Pada gambar diatas merupakan penerapan abstract pada class operator, yang sebelumnya pada class operator hanya "public class oparator" pada kali ini ditambahkan kata abstract

## Interface
![Interface](Asset/23.png)
pada gambar diatas merupakan contoh penerapan inteface yang dimana saya membuat sebuah file baru bernama info.java dan berisikan 2 method yaitu "placeOfBirth" dan "dateOfBIrth"

## penerapan absytarct dan interface
![penerapan](Asset/24.png)
![penerapan](Asset/25.png)
pada gambar diatas merupakan penerapan cara menggunakan abstract dan interface pada class caster

## perubahan pada data tampil pada class operator
![perubahan](Asset/26.png)
pada gambar diatas merupakan perubahan pada bagian data tampil di class operator

