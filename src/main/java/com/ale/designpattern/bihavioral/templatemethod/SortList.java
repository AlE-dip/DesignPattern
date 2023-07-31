package com.ale.designpattern.bihavioral.templatemethod;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public abstract class SortList<T> {
    private List<T> list;

    public void sort() {
        T[] ts = (T[]) list.toArray();

        for (int i = 0; i < ts.length - 1; i++) {
            for (int j = i + 1; j < ts.length; j++) {
                T ti = ts[i];
                T tj = ts[j];
                if(comparable(ti, tj) > 0) {
                    ts[i] = tj;
                    ts[j] = ti;
                }
            }
        }
        list = Arrays.stream(ts).toList();
    }

    public abstract int comparable(T current, T other);
}
