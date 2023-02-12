package com.cowok.hijrah.aplikasiberita.BeritaAdapter

import com.cowok.hijrah.aplikasiberita.R

class news(val title: String, val desc: String, val photo: Int)

object BeritaModel{
    val newslist = listOf<news>(
        news(
            "Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
            "detikom | 1 jam yang lalu",
            R.drawable.img_news1
        ),
        news(
            "Kapal Nelayan menyalorkan bansos masyarakat Sulawesi",
            "detikom | 1 jam yang lalu",
            R.drawable.img_news2
        ),
        news(
            "Macet mulai terjadi di wilayah jalur pemudik Semarang",
            "detikom | 2 jam yang lalu",
            R.drawable.img_news3
        ),
        news(
            "Jelang new normal Jakarta macet lagi",
            "detikom | 3 jam yang lalu",
            R.drawable.img_news4
        ),
        news(
            "Dukung Indonesia perangi covid-19, sampoerna donasi ventilator dan APD Full Set",
            "detikom | 4 jam yang lalu",
            R.drawable.img_news5
        ),
        news(
            "Saat risma jelaskan soal penanganan corona pada kepala BNPB dan Menkes",
            "detikom | 5 jam yang lalu",
            R.drawable.img_news6
        ),
        news(
            "Banjir keritik ke trump yang kerahkan militer usai demo george floyd",
            "detikom | 6 jam yang lalu",
            R.drawable.img_news7
        ),
        news(
            "Mengapa aksi demo damai kasus george floyd bisa berubah jadi kerusuhan?",
            "detikom | 8 jam yang lalu",
            R.drawable.img_news8
        ),
        news(
            "2 opsi bagi calon jamaah haji yang tidak jadi berangkat tahun ini",
            "detikom | 1 menit yang lalu",
            R.drawable.img_news9
        )
    )
}