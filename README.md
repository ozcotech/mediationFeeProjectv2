# Arabuluculuk Ücret Hesaplama 2023 - v2 (Düzeltme gelecektir)

Programda iç içe if - else kullanarak çok temel, basit bir arabuluculuk ücreti hesaplama programı yaptık.

Ek bilgi = (2023 asgari ücret tarifesine göre yani min 1.600,00 TL olacak şekilde yazdım. Geçen sene yani 2022'de 800,00 TL idi. 2022'nin son çeğreğinde 2023 tarifesi uygulanmaya başlandı.)

İlerde nesne mantığını kullanarak düzenlenecektir veya algoritması daha basit şekile indirgenecektir.

```
Kısaca Şu Şekilde Algoritmayı Kurmaya Çalıştım: 
İlk önce kullanıcıdan anlaşma miktarını aldım. ("anMi" değişkeni anlaşma miktarıdır. )

--------

Daha sonra birinci bir if koşulu oluşturdum. Bu birinci if koşulu; - 
anlaşma miktarından 100.000,00 TL çıkardığımda kalan miktar 0 (sıfır)'dan büyükse -   
şeklinde true dönerse if koşulunun içerisine gittim. (Bundan sonraki ikinci if koşulu oluşturdum).

---------

Tabiki birinci if koşulunun false dönme olasılığında yani o if koşulundan çıktığımızda yani - 
anlaşma miktarından 100.000,00 TL çıkardığımda kalan miktar 0 (sıfır)'dan küçükse -
şeklinde else koşulumun içerisine bir iç if koşulu ekledim.

bu if koşulunun içerisine ücreti bulmak için yani anlaşma miktarının % 6'sını bulmak için anlaşma miktarı ile 0.06 'yı çarptım.

bu çarpım sonucunda sonuc 1.600,00 'den küçükse en son sonuç olarak 1.600,00 TL çıkmasını sağladım, eğer büyükse sadece %6 çarpım sonucunun çıkmasını sağladım.

Buraya kadar olan kısım birinci if koşuluyla alakalı yani 100.000,00 TL ve altındaki anlaşma miktarı söz konusu olduğunda işleyecek kod bloğu.

---------

Bu şekilde iç içe if ve if - else koşulları oldu ancak bir sonraki versiyonda bunu oop mantığına çevireceğiz. Yani metod, fonksiyon, yapılar kullanarak kod yazımızı daha da kısaltarak daha da geliştirecğeiz.

Bu kod yapısının (v2) bir önceki kod yapısından (v1) farkı; bir önceki kod yapısında bazı çarpım sonuçlarını toplayıp bunu koşul içerisine yerleştirmiştim. Dolayısıyla oran veya ücret miktarı arttığında yani bir sonraki seen tarifesi geldiğinde kodun tamamını kontrol etmek gerekiyor.

Ancak ikinci versiyondaki kod yapısında baştan değişkenleri oluşturduğumuz için tarife değişikliğinde sadece baştaki bu değişkenleri değiştirmemiz yeterli olacaktır, kod yapısına tümüyle müdahale etmeye veya kontrol etmeye gerek kalmayacaktır.

Son olarak; bir önceki versiyonda koşullarda sadece iki rakam yazıp bu iki rakam içerisinde koşul durumu araştırdım, ikinci versiyonda koşullarda çıkarma işlemi yazarak koşul durumu araştırdım.

```

Ayrıca diğer ihtimaller de programımıza eklenecektir. Şöyle ki;
Bu hesaplama iş hukuku uyuşmazlıkları için geçerlidir ve sadece 2 kişi katılımında geçerlidir. Katılım yani anlaşan kişi sayısını arttırdığımızda özellikle asgarisini yani 1.600.00TL'yi baz aldığımızda savcılıkça ödenecek miktar değişmektedir. Ayrıca tüketici veya ticari uyuşmazlıklarda da asgari miktar değişmektedir. Ancak genel itibariyle asgarinin üzerinde bir ücret hesaplamasında bu basit program her zaman doğru sonucu verecektir. 

Hesaplama Şu mantıkla Yapılmaktadır;

1- Kullanıcıdan anlaşma miktarını alıyoruz.
2- Anlaşma miktarına göre belirli oranlarda arabuluculuk ücreti hesaplaması yapıyoruz ancak öncelikle anlaşma miktarı 0'dan büyük olmalıdır.
3- Daha sonra arabuluculuk ücreti 2023 yılı itibariyle 1.600,00 TL'den düşük olmamalıdır.
4- anlaşma miktarının ilk 50.000 TL'si için %6 oranında arabuluculuk ücreti hesaplanır.
```
Örnek-1: 
Anlaşma miktarınız: 10.000,00 TL
Arabuluculuk ücreti: 600,00TL değil 1.600,00TL'dir. (Çünkü % 6 olarak hesaplansa da 1.600,00TL'nin altına düşülmeyecektir.)
```
```
Örnek-2: 
Anlaşma miktarınız: 30.000,00TL
Arabuluculuk ücreti: 1.800TL'dir.
(Çünkü % 6 oranda hesaplama yaptığımızda 1.600,00TL'nin üzerinde çıktığından çıkan rakam ücretimiz oluyor.)
```

5- Anlaşma miktarının ilk 100.000,00 TL'si için %6, sonraki 160.000,00 TL'si için %5, sonraki 260.000,00 TL'si %4, sonraki 520.000,00 TL'si için %3 vd. şeklinde aşağıdaki tabloda görülmektedir.

| Sayı | Anlaşılan Miktar | Oran|
|------|-------------------|----|
| 1. | İlk 100.000,00 TL’si için | %6 |
| 2. | Sonra gelen 160.000,00 TL'si için | %5 |
| 3. | Sonra gelen 260.000,00 TL'si için | %4 |
| 4. | Sonra gelen 520.000,00 TL'si için | %3 |
| 5. | Sonra gelen 1.560.000,00 TL'si için | %2 |
| 6. | Sonra gelen 2.080.000,00 TL'si için | %1,5 |
| 7. | Sonra gelen 4.160.000,00 TL'si için | %1 |
| 8. | 8.840.000,00 TL'den yukarısı için | %0,5 |
