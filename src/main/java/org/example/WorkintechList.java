package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        // Eğer liste zaten bu elemanı içeriyorsa ekleme
        if (this.contains(element)) {
            return false;
        }
        boolean result = super.add(element);
        // Ekleme sonrası otomatik sırala
        this.sort();
        return result;
    }

    @Override
    public void add(int index, T element) {
        // Aynı eleman varsa ekleme
        if (this.contains(element)) {
            return;
        }
        super.add(index, element);
        this.sort();
    }

    @Override
    public boolean addAll(java.util.Collection<? extends T> c) {
        boolean changed = false;
        for (T item : c) {
            if (!this.contains(item)) {
                super.add(item);
                changed = true;
            }
        }
        if (changed) this.sort();
        return changed;
    }

    // Sort metodu — değerleri küçükten büyüğe ya da alfabetik olarak sıralar
    public void sort() {
        Collections.sort(this);
    }

    // Remove metodu — verilen nesneyi siler ve listeyi sıralar
    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        if (result) {
            this.sort();
        }
        return result;
    }

    // (Opsiyonel) tostring override
    @Override
    public String toString() {
        return super.toString();
    }
}

/*
Veri Yapıları Challenge II
org.example paketi altında WorkintechList adında bir sınıf yazmanız istenmektedir.

Sınıf ArrayList sınıfının tüm özelliklerine sahip olmalı ve bir ArrayList gibi davranmalı.

Ancak WorkintechList'ten oluşturulmuş instance değerleri içerilerinde bir ArrayList'ten farklı olarak
tekrar eden data tutamazlar.

WorkintechList sınıfınde sort isminde bir metot tanımlamalısınız ve WorkintechList'e eklenmiş tüm değerleri
sıralamalı(String ise A'dan Z'ye)(numeric ise 0'dan sonsuza doğru)

WorkintechList sınıfında bir remove metodu olmalı. Parametre olarak Object tipinde bir parametre almalı.

remove metodu aldığı parametreyi WorkintechList'ten silmeli ve WorkintechList'te bulunan tüm elemanları
sıralamalı.
 */
