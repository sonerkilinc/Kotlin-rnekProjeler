fun main() {

    val isim : String ="Soner"
    val soyisim :String="Kılınç"
    var yas: Byte =22
    var kilo: Double=77.8
    var boy: Double=1.75
    val cinsiyet: Char='E'

    var boykaresi: Double= boy*boy
    var boykiloendeks: Double= kilo/boykaresi

    println("adı:"+isim)
    println("soyadı:"+soyisim)
    println("yas:"+yas)
    println("kilo:"+kilo)
    println("boy:"+boy)
    println("cinsiyet"+cinsiyet)
    println("boykiloendeksi:"+boykiloendeks)

    if (boykiloendeks<18.5)
        println("zayıf")
    if (boykiloendeks>18.5 && boykiloendeks<24.9)
        println("normal")
    if (boykiloendeks>25)
        println("kilolu")


}