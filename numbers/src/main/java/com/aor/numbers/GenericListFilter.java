package com.aor.numbers;

import java.util.List;

public interface GenericListFilter{
    //public List<Integer> filter(List<Integer> list);
    public boolean accept(Integer number);
}
